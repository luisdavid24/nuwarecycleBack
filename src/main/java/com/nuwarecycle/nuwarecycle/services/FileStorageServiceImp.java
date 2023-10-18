package com.nuwarecycle.nuwarecycle.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileStorageServiceImp implements FileStorageService{
    @Value("${media.location}")
    private String mediaLocation;

    private Path rootLocation;
    @Override
    public void init() throws IOException {
        rootLocation = Paths.get(mediaLocation);
        Files.createDirectories(rootLocation);
    }

    @Override
    @PostConstruct
    public String store(MultipartFile file) {
        try {
            if (file.isEmpty())
                throw new RuntimeException("Failed to store empty file");

            String fileName = file.getOriginalFilename();
            assert fileName != null;
            Path destinationFile = rootLocation.resolve(Paths.get(fileName)).normalize().toAbsolutePath();

            try(InputStream inputStream = file.getInputStream()){
                Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            }

            return fileName;

        }catch (IOException e){
            throw new RuntimeException("Failed to store file", e);
        }
    }

    @Override
    public Resource loadAsResource(String fileName) {
        try {
            Path file = rootLocation.resolve(fileName);
            Resource resource = new UrlResource((file.toUri()));

            if (resource.exists() || resource.isReadable()) {
                return resource;
            }else{
                throw new RuntimeException("Could not read file: " + fileName);
            }
        }catch(MalformedURLException e){
            throw new RuntimeException("Could not read filesss: " + fileName);
        }
    }
}