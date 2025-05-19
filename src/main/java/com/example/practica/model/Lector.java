package com.example.practica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

import org.hibernate.engine.profile.Fetch;

@Data
@EqualsAndHashCode
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "lector") 
public class Lector {
    @Column(name = "id_lector")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLector;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "edad")
    private String edad;

    @OneToOne
    @JoinColumn(name = "id_libro_favorito")
    private Libro id_libro;

    @OneToMany(mappedBy = "lector")
    private List<Libro> librosLeidos;

}
