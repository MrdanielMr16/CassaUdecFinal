package com.registro.usuarios.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.entity.Foro;
import com.registro.usuarios.service.Impl.PostService;
import com.registro.usuarios.service.Impl.UsuarioServiceImpl;

import java.security.Principal;
import java.util.Date;

/**
 * Clase encargada de crear las nuevas publicaciones y guardarlas en la DB
 * **/

@Controller
@RequestMapping("/new-post")
public class NewPostController {

    /**
     *Instanciación de los servicios para los modelos necesarios en el controlador.
     * **/

    @Autowired
    private PostService postService;

    @Autowired
    private UsuarioServiceImpl impl;


    /**
     * Ruta formulario nueva publicación
     * Metodo genera un objeto Post apartir del formulario y lo envia por POST
     * @return Vista formulario nueva publicación
     * **/

    @GetMapping
    public String main(Model model, Principal p) {
        // FIXME buena práctica: nombrar atributo como newPost
        model.addAttribute("post", new Foro());

        return "new-post";
    }

    /**
     * Ruta guardado nuevo post
     * El metodo recibe el objeto post, inserta la fecha donde fue creado y los guarda en la base de datos usando el
     * servicio.
     *
     * @param post Objeto post con los datos.
     * **/


    @PostMapping
    public String save(@ModelAttribute Foro post, Principal p) {
        Date date = new Date();
        java.sql.Timestamp sqlTimeStamp = new java.sql.Timestamp(date.getTime());
        post.setDate(sqlTimeStamp);
        
        postService.save(post);
        return "redirect:/post?id=" + post.getId();
    }
}
