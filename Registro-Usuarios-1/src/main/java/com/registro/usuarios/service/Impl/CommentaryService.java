package com.registro.usuarios.service.Impl;


import com.registro.usuarios.GenericService;
import com.registro.usuarios.entity.Commentary;
import com.registro.usuarios.repository.CommentaryRepository;

import org.springframework.stereotype.Service;

/**
 * Servicio correspondiente al modelo Commentary
 * **/

@Service
public class CommentaryService extends GenericService<Commentary, Integer> {

    /**
     * Instancia del servicio Commentary
     * @param repository recibe el repositorio correspondiente al modelo
     * **/
    public CommentaryService(CommentaryRepository repository) {
        super(repository);
    }

    /**
     * Metodo Buscar Comentarios por Post ID ordenados por fecha
     * El metodo recibe el resultado de la operación realizada por el repositorio
     * @param postId ID del post donde se encuentran los comentarios
     * @return Todos los comentarios asociados al post
     * **/

    public Iterable<Commentary> findAllByPostIdOrderByDateAsc(int postId){
        return ((CommentaryRepository) repository).findAllByPostIdOrderByDateAsc(postId);
    }
}
