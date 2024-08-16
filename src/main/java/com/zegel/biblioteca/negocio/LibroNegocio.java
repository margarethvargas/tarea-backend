package com.zegel.biblioteca.negocio;

import com.zegel.biblioteca.entidades.Libro;
import com.zegel.biblioteca.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroNegocio {
    @Autowired
    private LibroRepositorio libroRepositorio;

    public Libro grabar(Libro libro){
        return libroRepositorio.save(libro);
    }

    public List<Libro> obtener(){
        return(List<Libro>) libroRepositorio.findAll();
    }

    public Libro actualizar(Libro libro){
        Libro c = libroRepositorio.findById(libro.getId()).get();
        if(c!=null){
            return libroRepositorio.save(libro);
        }else {return null;}
    }

    public Libro borrar(Long id){
        Libro c = libroRepositorio.findById(id).get();
        if(c!=null){
            libroRepositorio.delete(c);
        }else{return null;}
        return c;
    }
}
