package com.zegel.biblioteca.repositorio;

import com.zegel.biblioteca.entidades.Bibliotecario;
import org.springframework.data.repository.CrudRepository;

public interface BibliotecarioRepositorio extends CrudRepository<Bibliotecario, Long> {
}
