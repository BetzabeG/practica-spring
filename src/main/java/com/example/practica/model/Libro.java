package com.example.practica.model;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long id_libro;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "genero")
    private String genero;
    //lado de N de una relacion 1:N
    @ManyToOne
    @JoinColumn(name = "id_lector")
    private Lector lector;

}
