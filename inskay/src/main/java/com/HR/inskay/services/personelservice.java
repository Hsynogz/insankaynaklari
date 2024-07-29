package com.HR.inskay.services;

import com.HR.inskay.entity.Personel;
import com.HR.inskay.repository.PersonelRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Setter
@Service
public class PersonelService {

    @Autowired
    private PersonelRepository personelRepository;

    public Optional<Personel> getPersonelById(Long id) {
        return personelRepository.findById(id);
    }

    public Personel createPersonel(Personel personel) {
        return personelRepository.save(personel);
    }

    public Optional<Personel> updatePersonel(Long id, Personel personelDetails) {
        Optional<Personel> personel = personelRepository.findById(id);
        if (personel.isPresent()) {
            Personel existingPersonel = personel.get();
            existingPersonel.setAd(personelDetails.getAd());
            existingPersonel.setSoyad(personelDetails.getSoyad());
            existingPersonel.setTckn(personelDetails.getTckn());
            existingPersonel.setBirim(personelDetails.getBirim());
            personelRepository.save(existingPersonel);
            return Optional.of(existingPersonel);
        } else {
            return Optional.empty();
        }
    }
}