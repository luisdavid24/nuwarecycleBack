package com.nuwarecycle.nuwarecycle.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileStorageService {
    void init() throws IOException;
    String store(MultipartFile file);
    Resource loadAsResource(String fileName);
}
