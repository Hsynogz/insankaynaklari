package com.HR.inskay.services;

import com.HR.inskay.entity.PersonelEnvanter;
import com.HR.inskay.repository.PersonelenvanterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelenvanterService {

    private final PersonelenvanterRepository personelEnvanterRepository;

    @Autowired
    public PersonelenvanterService(PersonelenvanterRepository personelEnvanterRepository) {
        this.personelEnvanterRepository = personelEnvanterRepository;
    }
    @SuppressWarnings("unused")
    public List<PersonelEnvanter> getAllPersonelEnvanter() {
        return personelEnvanterRepository.findAll();
    }
    @SuppressWarnings("unused")
    public PersonelEnvanter saveOrUpdatePersonelEnvanter(PersonelEnvanter personelEnvanter) {
        return personelEnvanterRepository.save(personelEnvanter);
    }
    @SuppressWarnings("unused")
    public void deletePersonelEnvanter(Long id) {
        personelEnvanterRepository.deleteById(id);
    }
}
