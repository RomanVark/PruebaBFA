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
    private int id;

    @Required
    @Column(length = 100)
    private String PrimerNombre;
    @Required
    @Column(length = 100)
    private String SegundoNombre;
    @Required
    @Column(length = 100)
    private String PrimerApellido;
    @Required
    @Column(length = 100)
    private String SegundoApellido;

    private LocalDate FechaNacimiento;
    private int edad;

    @Column(length = 20)
    private String Sexo;

    @Column(length = 100)
    private String EstudiosRealizados;

    @Column(length = 100)
    private String Profesion;

}
