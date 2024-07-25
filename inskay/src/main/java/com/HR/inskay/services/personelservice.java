package com.HR.inskay.services;

import com.HR.inskay.entity.personel;
import com.HR.inskay.repository.personelrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personelservice {
    @Autowired
    private personelrepository personelRepository;

    public List<personel> getAllPersonel() {
        return personelRepository.findAll();
    }

    public personel saveOrUpdatePersonel(personel personel) {
        return personelRepository.save(personel);
    }

    public void deletePersonel(Long id) {
        personelRepository.deleteById(id);
    }
}
