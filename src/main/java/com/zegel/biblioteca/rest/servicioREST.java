package com.zegel.biblioteca.rest;

import com.zegel.biblioteca.entidades.Libro;
import com.zegel.biblioteca.negocio.LibroNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/libro")
public class servicioREST {
    @Autowired
    private LibroNegocio libroNegocio;

    @PostMapping("")
    public Libro grabar(@RequestBody Libro libro) {
        return libroNegocio.grabar(libro);
    }

    @GetMapping("")
    public List<Libro> obtener() {
        try {
            return libroNegocio.obtener();
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible obtener los datos");
        }
    }
    @PutMapping("")
    public Libro actualizar(@RequestBody Libro libro) {
        try{
            return libroNegocio.actualizar(libro);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible actualizar los datos");
        }
    }

    @DeleteMapping("/{id}")
    public Libro borrar(@PathVariable(value = "id") Long id) {
        return libroNegocio.borrar(id);
    }
}