package com.zegel.biblioteca.repositorio;

import com.zegel.biblioteca.entidades.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepositorio extends CrudRepository<Libro, Long> {
}
