package com.HRapp.HRapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Entity
@Data
@Table(name="personel")

public class personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    private String ad;

    private String soyad;

    private Date dogumTarihi;
    @Column(unique = true)
    private String tckn;
    @Column(unique = true)
    private String sicilNumarasi;

    private String mezuniyetDurumu;

    private String birim;

    private String gorev;

    private Boolean calismaDurumu;

    private String fotograf;

    private Date iseGirisTarihi;

    private Date istenCikisTarihi;

    private String cikisNedeni;

    private String baslangicUnvani;

}
