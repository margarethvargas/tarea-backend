package com.zegel.biblioteca.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="libro")
public class Libro {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAno_public() {
        return ano_public;
    }

    public void setAno_public(String ano_public) {
        this.ano_public = ano_public;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getCant_dispon() {
        return cant_dispon;
    }

    public void setCant_dispon(Integer cant_dispon) {
        this.cant_dispon = cant_dispon;
    }

    public String getEstado_libro() {
        return estado_libro;
    }

    public void setEstado_libro(String estado_libro) {
        this.estado_libro = estado_libro;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "titulo", length = 50, columnDefinition = "VARCHAR(50)")
    private String titulo;
    @Column(name = "autor", length = 50, columnDefinition = "VARCHAR(50)")
    private String autor;
    @Column(name = "editorial", length = 50, columnDefinition = "VARCHAR(50)")
    private String editorial;
    @Column(name = "ano_public", length = 4, columnDefinition = "CHAR(4)")
    private String ano_public;
    @Column(name = "genero", length = 20, columnDefinition = "VARCHAR(20)")
    private String genero;
    @Column(name = "isbn", length = 13, columnDefinition = "CHAR(13)")
    private String isbn;
    private Integer cant_dispon;
    @Column(name = "estado_libro", length = 20, columnDefinition = "VARCHAR(20)")
    private String estado_libro;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bibliotecario", referencedColumnName = "id")
    private Bibliotecario bibliotecario;

}
