package com.HR.inskay.services;

import com.HR.inskay.entity.Envanter;
import com.HR.inskay.repository.EnvanterRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Setter
@Service
public class EnvanterService {
    @Autowired
    private EnvanterRepository envanterRepository;

    @SuppressWarnings("unused")
    public List<Envanter> getAllEnvanter() {
        return envanterRepository.findAll();
    }
    @SuppressWarnings("unused")
    public Envanter saveOrUpdateEnvanter(Envanter envanter) {
        return envanterRepository.save(envanter);
    }
    @SuppressWarnings("unused")
    public void deleteEnvanter(Long id) {
        envanterRepository.deleteById(id);
    }

}
