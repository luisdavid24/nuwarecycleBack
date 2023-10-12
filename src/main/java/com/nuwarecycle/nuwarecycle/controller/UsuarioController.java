package com.nuwarecycle.nuwarecycle.controller;


import com.nuwarecycle.nuwarecycle.dao.UsuarioDao;
import com.nuwarecycle.nuwarecycle.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    /*
    @RequestMapping(value="api/usuarios",method= RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }*/

    @RequestMapping(value="api/usuarios",method= RequestMethod.GET)
    public void getUsuarios(){
        System.out.print( usuarioDao.getUsuarios());
    }

}
