package com.example.practica.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "compra_libro") 

public class CompraLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación a Lector
    @ManyToOne
    @JoinColumn(name = "id_lector")
    private Lector id_lector;

    // Relación a Libro
    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro id_libro;

    // Atributos extra
    
    private LocalDate fechaCompra;
    private Double precio;
}
