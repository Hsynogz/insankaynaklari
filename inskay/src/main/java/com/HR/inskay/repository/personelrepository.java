package com.HR.inskay.repository;

import com.HR.inskay.entity.personel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface personelrepository   extends JpaRepository<personel,Long> {
    List<personel> findByAdContainingAndSoyadContainingAndTcknAndBirim(String ad, String soyad, String tckn, String birim);
}
