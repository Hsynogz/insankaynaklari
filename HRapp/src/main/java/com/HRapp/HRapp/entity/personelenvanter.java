package com.HRapp.HRapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Date;
@Entity
@Data

public class personelenvanter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personel_id")
    private personel personel;

    @ManyToOne
    @JoinColumn(name = "envanter_id")
    private envanter envanter;

    private Date alisTarihi;

    @ManyToOne
    @JoinColumn(name = "teslim_eden_personel_id")
    private personel teslimEdenPersonel;

    private Date donusTarihi;

    @ManyToOne
    @JoinColumn(name = "teslim_alan_personel_id")
    private personel teslimAlanPersonel;
}
