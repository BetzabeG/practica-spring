package com.example.practica.dto;

import com.example.practica.model.Lector;
import com.example.practica.model.Libro;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

public class CompraLibroDTO implements Serializable {
    @NotNull
    @NotBlank(message = "El nombre no puede estar vacío")

    private Long id;
    @NotBlank(message = "El nombre no puede estar vacío")

    @NotBlank(message = "El nombre no puede estar vacío")
    @NotNull
    private Lector id_lector;
    @NotNull
    @NotBlank(message = "El nombre no puede estar vacío")

    private Libro id_libro;

    @NotBlank(message = "El nombre no puede estar vacío")

    private LocalDate fechaCompra;
    @NotBlank(message = "El nombre no puede estar vacío")
    @DecimalMin(value = "0.0", inclusive = false, message = "El precio debe ser mayor que 0")
    private Double precio;
}
