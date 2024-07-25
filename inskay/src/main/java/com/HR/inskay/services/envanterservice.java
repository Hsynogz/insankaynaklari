package com.HR.inskay.services;

import com.HR.inskay.entity.envanter;
import com.HR.inskay.repository.envanterrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class envanterservice {
    @Autowired
    private envanterrepository envanterRepository;

    public List<envanter> getAllEnvanter() {
        return envanterRepository.findAll();
    }

    public envanter saveOrUpdateEnvanter(envanter envanter) {
        return envanterRepository.save(envanter);
    }

    public void deleteEnvanter(Long id) {
        envanterRepository.deleteById(id);
    }
}
