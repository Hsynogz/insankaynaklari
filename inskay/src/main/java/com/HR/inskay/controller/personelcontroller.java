package com.HR.inskay.controller;

import com.HR.inskay.entity.Personel;
import com.HR.inskay.repository.PersonelRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Setter
@Controller
@RequestMapping("/personel")
public class PersonelController {

    @Autowired
    private PersonelRepository personelRepository;

    @GetMapping("/filter")
    public ResponseEntity<List<Personel>> filterPersonel(
            @RequestParam(required = false) String ad,
            @RequestParam(required = false) String soyad,
            @RequestParam(required = false) String tckn,
            @RequestParam(required = false) String birim) {
        List<Personel> filteredPersonel = personelRepository.findByAdContainingAndSoyadContainingAndTcknAndBirim(ad, soyad, tckn, birim);
        return ResponseEntity.ok(filteredPersonel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personel> getPersonelById(@PathVariable Long id) {
        Optional<Personel> personel = personelRepository.findById(id);
        return personel.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Personel> createPersonel(@RequestBody Personel personel) {
        Personel createdPersonel = personelRepository.save(personel);
        return ResponseEntity.ok(createdPersonel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personel> updatePersonel(@PathVariable Long id, @RequestBody Personel personelDetails) {
        Optional<Personel> personel = personelRepository.findById(id);
        if (personel.isPresent()) {
            Personel existingPersonel = personel.get();
            existingPersonel.setAd(personelDetails.getAd());
            existingPersonel.setSoyad(personelDetails.getSoyad());
            existingPersonel.setTckn(personelDetails.getTckn());
            existingPersonel.setBirim(personelDetails.getBirim());
            personelRepository.save(existingPersonel);
            return ResponseEntity.ok(existingPersonel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}