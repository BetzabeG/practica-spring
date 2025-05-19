package com.example.practica.model;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.List;


import java.util.ArrayList;

import jakarta.persistence.*;
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "lector") // nombre exacto de la tabla
public class Lector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL en PostgreSQL
    @Column(name = "id_lector")
    private Long id_lector;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "edad")
    private Integer edad;
    //relacion 1:1
    @OneToOne
    @JoinColumn(name = "id_libro")  // columna en la tabla lector que guarda la FK al libro
    private Libro libroFavorito;
    //relacion 1:n
    @OneToMany(mappedBy = "lector", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Libro> librosLeidos = new ArrayList<>();


}