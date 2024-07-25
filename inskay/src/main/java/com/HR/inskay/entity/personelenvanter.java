package com.HR.inskay.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
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

    private LocalDate alisTarihi; // Date yerine LocalDate kullanıldı

    @ManyToOne
    @JoinColumn(name = "teslim_eden_personel_id")
    private personel teslimEdenPersonel;

    private LocalDate donusTarihi; // Date yerine LocalDate kullanıldı

    @ManyToOne
    @JoinColumn(name = "teslim_alan_personel_id")
    private personel teslimAlanPersonel;

    // Getter ve Setter metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public personel getPersonel() {
        return personel;
    }

    public void setPersonel(personel personel) {
        this.personel = personel;
    }

    public envanter getEnvanter() {
        return envanter;
    }

    public void setEnvanter(envanter envanter) {
        this.envanter = envanter;
    }

    public LocalDate getAlisTarihi() {
        return alisTarihi;
    }

    public void setAlisTarihi(LocalDate alisTarihi) {
        this.alisTarihi = alisTarihi;
    }

    public personel getTeslimEdenPersonel() {
        return teslimEdenPersonel;
    }

    public void setTeslimEdenPersonel(personel teslimEdenPersonel) {
        this.teslimEdenPersonel = teslimEdenPersonel;
    }

    public LocalDate getDonusTarihi() {
        return donusTarihi;
    }

    public void setDonusTarihi(LocalDate donusTarihi) {
        this.donusTarihi = donusTarihi;
    }

    public personel getTeslimAlanPersonel() {
        return teslimAlanPersonel;
    }

    public void setTeslimAlanPersonel(personel teslimAlanPersonel) {
        this.teslimAlanPersonel = teslimAlanPersonel;
    }
}
