package com.HR.inskay.repository;

import com.HR.inskay.entity.envanter;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface envanterrepository extends JpaRepository<envanter,Long> {
    static List findByTipiContaining(String envanterTipi) {
        return null;
    }
}
