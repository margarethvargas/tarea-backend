package com.zegel.biblioteca.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="bibliotecario")
public class Bibliotecario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cargo", length = 20, columnDefinition = "VARCHAR(20)")
    private String cargo;
    @Column(name = "turno", length = 20, columnDefinition = "VARCHAR(20)")
    private String turno;
    @Column(name = "fch_contratacion", columnDefinition = "DATE")
    private String fch_contratacion;
    @Column(name = "area", length = 20, columnDefinition = "VARCHAR(20)")
    private String area;
    @OneToMany(mappedBy = "bibliotecario", fetch = FetchType.LAZY)
    private List<Libro> libros;
    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFch_contratacion() {
        return fch_contratacion;
    }

    public void setFch_contratacion(String fch_contratacion) {
        this.fch_contratacion = fch_contratacion;
    }

    public Usuario getId_usuario() {
        return usuario;
    }

    public void setId_usuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
