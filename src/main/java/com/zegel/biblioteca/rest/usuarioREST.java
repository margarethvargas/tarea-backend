package com.zegel.biblioteca.rest;

import com.zegel.biblioteca.entidades.Usuario;
import com.zegel.biblioteca.negocio.UsuarioNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class usuarioREST {
    @Autowired
    private UsuarioNegocio usuarioNegocio;

    @PostMapping("")
    public Usuario grabar(@RequestBody Usuario usuario) {
        return usuarioNegocio.grabar(usuario);
    }

    @GetMapping("")
    public List<Usuario> obtener() {
        try {
            return usuarioNegocio.obtener();
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible obtener los datos");
        }
    }
    @PutMapping("")
    public Usuario actualizar(@RequestBody Usuario usuario) {
        try{
            return usuarioNegocio.actualizar(usuario);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible actualizar los datos");
        }
    }

    @DeleteMapping("/{id}")
    public Usuario borrar(@PathVariable(value = "id") Long id) {
        return usuarioNegocio.borrar(id);
    }
}