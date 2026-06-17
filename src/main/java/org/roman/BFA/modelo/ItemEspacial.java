package org.roman.BFA.modelo;

import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.data.hibernate.spring.SpringHibernateDataAdapter;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Getter @Setter

public class ItemEspacial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Required
    private int Numero;

    @Column(length = 200)
    private String ImagenModelo;

    @Column(length = 200)
    private String ImagenA;
    @Column(length = 200)
    private String ImagenB;
    @Column(length = 200)
    private String ImagenC;
    @Column(length = 200)
    private String ImagenD;
    @Column(length = 200)
    private String ImagenE;

    @Required
    @Column(length = 5)
    private String RespuestaCorrecta;
}
