package com.HR.inskay.repository;

import com.HR.inskay.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonelRepository extends JpaRepository<Personel,Long> {
    List<Personel> findByAdContainingAndSoyadContainingAndTcknAndBirim(String ad, String soyad, String tckn, String birim);
}
