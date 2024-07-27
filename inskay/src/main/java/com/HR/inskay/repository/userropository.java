package com.HR.inskay.repository;

import com.HR.inskay.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userropository extends JpaRepository<user, Long> {
    user findByUsername(String username);
}
