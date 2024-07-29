package com.HR.inskay.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "personelenvanter")
public class PersonelEnvanter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personel_id")
    private Personel personel;

    @ManyToOne
    @JoinColumn(name = "envanter_id")
    private Envanter envanter;

    private LocalDate alisTarihi;
    @ManyToOne
    @JoinColumn(name = "teslim_eden_personel_id")
    private Personel teslimEdenPersonel;

    private LocalDate donusTarihi;

    @ManyToOne
    @JoinColumn(name = "teslim_alan_personel_id")
    private Personel teslimAlanPersonel;


}
