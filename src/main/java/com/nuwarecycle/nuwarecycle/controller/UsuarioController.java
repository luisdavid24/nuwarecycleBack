package com.nuwarecycle.nuwarecycle.controller;


import com.nuwarecycle.nuwarecycle.dao.UsuarioDao;
import com.nuwarecycle.nuwarecycle.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioDao usuarioDao;

    public UsuarioController(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }


    @RequestMapping(value="/prueba",method= RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        System.out.print( usuarioDao.getUsuarios());
        return usuarioDao.getUsuarios();
    }

    /*
    @RequestMapping(value="/",method= RequestMethod.GET)
    public void getUsuarios(){
        System.out.print( usuarioDao.getUsuarios());
    }*/

}
