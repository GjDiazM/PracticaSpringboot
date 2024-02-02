package com.Practica.Practica.controllers;


import com.Practica.Practica.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario GetUsuario(@PathVariable long id){
        Usuario User1= new Usuario();
        User1.setId(id);
        User1.setNombre("Gilberto");
        User1.setApellido("Diaz");
        User1.setCiudad("Soledad");
        User1.setEmail("Gjdiaz@gmail.com");
        User1.setTelefono("3012312");
        return User1;

    }
    @RequestMapping(value = "usuario2")
    public Usuario Editar(){
        Usuario User1= new Usuario();
        User1.setNombre("Gilberto");
        User1.setApellido("Diaz");
        User1.setCiudad("Soledad");
        User1.setEmail("Gjdiaz@gmail.com");
        User1.setTelefono("3012312");
        return User1;


    }
    @RequestMapping(value = "usuario3")
    public Usuario Eliminar(){
        Usuario User1= new Usuario();
        User1.setNombre("Gilberto");
        User1.setApellido("Diaz");
        User1.setCiudad("Soledad");
        User1.setEmail("Gjdiaz@gmail.com");
        User1.setTelefono("3012312");
        return User1;


    }
    @RequestMapping(value = "usuario4")
    public Usuario Buscar(){
        Usuario User1= new Usuario();
        User1.setNombre("Gilberto");
        User1.setApellido("Diaz");
        User1.setCiudad("Soledad");
        User1.setEmail("Gjdiaz@gmail.com");
        User1.setTelefono("3012312");
        return User1;


    }
}
