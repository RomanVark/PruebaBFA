package org.roman.BFA.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter

public class Evaluado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Required
    @Column(length = 50)
    private String primerApellido;

    @Required
    @Column(length = 50)
    private String segundoApellido;

    @Required
    @Column(length = 50)
    private String nombre;

    private LocalDate fechaNacimiento;

    private int edad;

    @Column(length = 50)
    private String sexo;

    @Column(length = 100)
    private String estudiosRealizados;

    @Column(length = 100)
    private String profesion;
}
