package com.HRapp.HRapp.repository;

import com.HRapp.HRapp.entity.personel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface personelrepo extends JpaRepository<personel,Long> {
    List<personel> findByAdContainingOrSoyadContainingOrTcknContainingOrBirim(String ad, String soyad, String tckn, String birim);

    List<personel> findByAdContainingAndSoyadContainingAndTcknAndBirim(String ad, String soyad, String tckn, String birim);
}
