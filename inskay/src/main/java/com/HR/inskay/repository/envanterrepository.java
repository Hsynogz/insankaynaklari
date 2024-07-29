package com.HR.inskay.repository;

import com.HR.inskay.entity.Envanter;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvanterRepository extends JpaRepository<Envanter,Long> {
    static List findByTipiContaining(String ignoredEnvanterTipi) {
        return null;
    }
}
