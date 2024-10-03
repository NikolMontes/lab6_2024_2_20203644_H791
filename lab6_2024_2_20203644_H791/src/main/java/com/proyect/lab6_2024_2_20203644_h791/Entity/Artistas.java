package com.proyect.lab6_2024_2_20203644_h791.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="artistas")
public class Artistas {

    @Id
    @Column(name="artistaId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artistaid;

    private String nombre;
    private String genero;

    private String telefono;

}
