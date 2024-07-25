package com.HR.inskay.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personel")
public class envanter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String envanterTipi;
    private String marka;
    private String model;
    private String Serinumarasi;
    private String statu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getenvanterTipi() {
        return envanterTipi;
    }

    public void setenvanterTipi(String envanterTipi) {
        this.envanterTipi =envanterTipi;
    }

    public String getmarka() {
        return marka;
    }

    public void setmarka(String marka) {
        this.marka = marka;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
   public String getSerinumarasi(){
        return Serinumarasi;
   }
   public void setSerinumarasi(String Serinumarasi){
        this.Serinumarasi=Serinumarasi;
   }
   public String getStatu(){
        return statu;

   }
   public void setStatu(String statu){
        this.statu=statu;
   }


}
