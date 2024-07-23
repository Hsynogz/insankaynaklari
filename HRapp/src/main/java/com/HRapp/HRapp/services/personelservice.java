package com.HRapp.HRapp.services;

import com.HRapp.HRapp.entity.personel;
import com.HRapp.HRapp.repository.personelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personelservice
{
    @Autowired
    private personelrepo personelRepository;

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


