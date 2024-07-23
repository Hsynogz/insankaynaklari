package com.HRapp.HRapp.services;

import com.HRapp.HRapp.entity.personelenvanter;
import com.HRapp.HRapp.repository.envanterpersonelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personelenvanterservice
{
    @Autowired
    private envanterpersonelrepo personelEnvanterRepository;

    public List<personelenvanter> getAllPersonelEnvanter() {
        return personelEnvanterRepository.findAll();
    }

    public personelenvanter saveOrUpdatePersonelEnvanter(personelenvanter personelEnvanter) {
        return personelEnvanterRepository.save(personelEnvanter);
    }

    public void deletePersonelEnvanter(Long id) {
        personelEnvanterRepository.deleteById(id);
    }
}
