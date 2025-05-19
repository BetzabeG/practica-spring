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
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "libro") 
public class Libro {
    @Column(name = "id_libro")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "genero")
    private String genero;
     
    @ManyToOne
    @JoinColumn(name = "id_lector")
    private Lector lector;
    
}
