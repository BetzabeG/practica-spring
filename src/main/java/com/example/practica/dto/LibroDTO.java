package com.example.practica.dto;

import com.example.practica.model.Lector;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class LibroDTO {
    @NotBlank( message = "El email no puede estar vacío")
    @NotNull
    private Long idLibro;
    @NotBlank( message = "El nombre no puede estar vacío")

    private String nombre;
    @NotBlank( message = "El genero no puede estar vacío")
    private String genero;

    private Lector lector;
}
