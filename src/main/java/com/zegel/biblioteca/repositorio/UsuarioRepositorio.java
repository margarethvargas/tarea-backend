package com.zegel.biblioteca.repositorio;

import com.zegel.biblioteca.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
}
