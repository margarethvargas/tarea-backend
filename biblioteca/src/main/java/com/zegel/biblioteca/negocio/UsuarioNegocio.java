package com.zegel.biblioteca.negocio;

import com.zegel.biblioteca.entidades.Usuario;
import com.zegel.biblioteca.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioNegocio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario grabar(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> obtener(){
        return(List<Usuario>) usuarioRepositorio.findAll();
    }

    public Usuario actualizar(Usuario usuario){
        Usuario c = usuarioRepositorio.findById(usuario.getId()).get();
        if(c!=null){
            return usuarioRepositorio.save(usuario);
        }else {return null;}
    }

    public Usuario borrar(Long id){
        Usuario c = usuarioRepositorio.findById(id).get();
        if(c!=null){
            usuarioRepositorio.delete(c);
        }else{return null;}
        return c;
    }
}
