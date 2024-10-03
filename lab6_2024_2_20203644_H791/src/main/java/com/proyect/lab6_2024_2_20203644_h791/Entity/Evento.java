package com.proyect.lab6_2024_2_20203644_h791.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity(name="eventos")
public class Evento {

    @Id
    @Column(name="eventoId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventoid;

    private String nombre;
    @Column(name="fecha")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    @Column(name="asistentesEsperados")
    private Integer asistentes_esperados;


}
