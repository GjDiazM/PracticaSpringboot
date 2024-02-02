package com.Practica.Practica.controllers;


import com.Practica.Practica.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public List<Usuario> GetUsuario(){

        List<Usuario>usuarios = new ArrayList<>();


        Usuario User1= new Usuario();
        User1.setId(230);
        User1.setNombre("Gilberto");
        User1.setApellido("Diaz");
        User1.setCiudad("Soledad");
        User1.setEmail("Gjdiaz@gmail.com");
        User1.setTelefono("3012312");

        Usuario User2= new Usuario();
        User2.setId(550);
        User2.setNombre("Godoy");
        User2.setApellido("marquezz");
        User2.setCiudad("Sol");
        User2.setEmail("Gjdiazada@gmail.com");
        User2.setTelefono("30112312");


        usuarios.add(User1);
        usuarios.add(User2);
        return usuarios;

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
