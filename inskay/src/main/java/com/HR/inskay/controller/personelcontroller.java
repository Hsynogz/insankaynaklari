package com.HR.inskay.controller;

import com.HR.inskay.entity.personel;
import com.HR.inskay.repository.personelrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personel")
public class personelcontroller {


    @Autowired
    private personelrepository personelRepository;

    @GetMapping("/filter")
    public List<personel> filterPersonel(
            @RequestParam(required = false) String ad,
            @RequestParam(required = false) String soyad,
            @RequestParam(required = false) String tckn,
            @RequestParam(required = false) String birim) {
        return personelRepository.findByAdContainingAndSoyadContainingAndTcknAndBirim(ad, soyad, tckn, birim);
    }

    @GetMapping("/{id}")
    public ResponseEntity<personel> getPersonelById(@PathVariable Long id) {
        return personelRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public personel createPersonel(@RequestBody personel personel) {
        return personelRepository.save(personel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<personel> updatePersonel(@PathVariable Long id, @RequestBody personel personelDetails) {
        return personelRepository.findById(id)
                .map(personel -> {
                    personel.setAd(personelDetails.getAd());
                    personel.setSoyad(personelDetails.getSoyad());
                    personel.setTckn(personelDetails.getTckn());
                    personel.setBirim(personelDetails.getBirim());
                    personelRepository.save(personel);
                    return ResponseEntity.ok(personel);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
