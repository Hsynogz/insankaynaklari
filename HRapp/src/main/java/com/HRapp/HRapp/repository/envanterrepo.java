package com.HRapp.HRapp.repository;

import com.HRapp.HRapp.entity.envanter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface envanterrepo extends JpaRepository<envanter,Long> {
    List<envanter> findByTipiContaining(String envanterTipi);
}
