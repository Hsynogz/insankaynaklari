package com.HRapp.HRapp.services;

import com.HRapp.HRapp.entity.envanter;
import com.HRapp.HRapp.entity.personel;
import com.HRapp.HRapp.repository.envanterrepo;
import com.HRapp.HRapp.repository.personelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class envanterservice
{
    @Autowired
    private envanterrepo envanterRepository;

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

