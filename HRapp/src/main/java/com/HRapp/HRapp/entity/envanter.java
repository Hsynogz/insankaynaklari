package com.HRapp.HRapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.sql.Date;

@Entity
@Data
@Table(name="envanter")
public class envanter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String envanterTipi;
    private Date girisTarihi;
    private String marka;
    private String model;

    @Column(unique = true)
    private String seriNumarasi;

    private String statu;
}
