package com.HR.inskay.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "envanter")
public class Envanter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String EnvanterTipi;
    private String Marka;
    private String Model;
    private String SeriNumarasi;
    private String Statu;


}
