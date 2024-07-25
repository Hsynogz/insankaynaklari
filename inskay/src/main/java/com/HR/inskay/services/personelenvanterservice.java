package com.HR.inskay.services;

import com.HR.inskay.entity.personelenvanter;
import com.HR.inskay.repository.personelenvanterrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personelenvanterservice {
    @Autowired
    private static personelenvanterrepository personelEnvanterRepository;

    public List<personelenvanter> getAllPersonelEnvanter() {
        return personelEnvanterRepository.findAll();
    }

    public static personelenvanter saveOrUpdatePersonelEnvanter(personelenvanter personelEnvanter) {
        return personelEnvanterRepository.save(personelEnvanter);
    }

    public void deletePersonelEnvanter(Long id) {
        personelEnvanterRepository.deleteById(id);
    }

}
