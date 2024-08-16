package com.zegel.biblioteca.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fch_solicitud", columnDefinition = "DATE")
    private String fch_solicitud;
    @Column(name = "fch_inicio", columnDefinition = "DATE")
    private String fch_inicio;
    @Column(name = "fch_fin", columnDefinition = "DATE")
    private String fch_fin;
    @Column(name = "fch_recojo", columnDefinition = "DATE")
    private String fch_recojo;
    @Column(name = "estado_reserva", length = 20, columnDefinition = "VARCHAR(20)")
    private String estado_reserva;
}
