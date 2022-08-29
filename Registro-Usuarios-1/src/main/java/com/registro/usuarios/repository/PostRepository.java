package com.registro.usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.entity.Foro;

/**
 * Repositorio para operaciones CRUD de tipo <i>Post</i>
 *
 * @see <a href="https://docs.spring.io/spring-data/commons/docs/2.6.0/api/org/springframework/data/repository/CrudRepository.html">CrudRepository</a>
 * @see Post
 */
@Repository
public interface PostRepository extends CrudRepository<Foro, Integer> {
    
    /**
     * Obtener todos los <i>Post</i> de <i>User</i> ordenados por fecha ascendente
     * @param userId id de <i>User</i> buscado
     * @return Iterable con <i>Post</i> obtenidos
     */
    Iterable<Foro> findAllByAuthorIdOrderByDateAsc(int userId);
}