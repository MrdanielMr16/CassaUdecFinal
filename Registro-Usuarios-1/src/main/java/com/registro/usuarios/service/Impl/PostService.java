package com.registro.usuarios.service.Impl;


import com.registro.usuarios.GenericService;
import com.registro.usuarios.entity.Foro;
import com.registro.usuarios.repository.PostRepository;

import org.springframework.stereotype.Service;
/**
 * Servicio correspondiente al modelo Post
 * **/


@Service
public class PostService extends GenericService<Foro, Integer> {

    /**
     * Instancia del servicio Post
     * @param repository recibe el repositorio correspondiente al modelo
     * **/
    public PostService(PostRepository repository) {
        super(repository);
    }

    /**
     * Metodo buscar todos los port según su autor ordenados por fecha.
     * @param userId ID del usuario autor de los post
     * @return resltado de la operación realizada por el repositorio
     * **/

    public Iterable<Foro> findAllByAuthorIdOrderByDateAsc(int userId) throws IllegalArgumentException {
        if (userId > 0) {
            return ((PostRepository) repository).findAllByAuthorIdOrderByDateAsc(userId);
        } else {
            throw new IllegalArgumentException("Id usuario debe ser mayor que 0");
        }
    }

}
