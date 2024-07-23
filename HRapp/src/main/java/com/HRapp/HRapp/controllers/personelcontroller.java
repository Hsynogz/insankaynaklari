package com.HRapp.HRapp.controllers;

import com.HRapp.HRapp.entity.personel;
import com.HRapp.HRapp.services.personelservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personel")
public class personelcontroller
{
    @Autowired
    private personelservice personelService;

    @GetMapping
    public List<personel> getAllPersonel() {
        return personelService.getAllPersonel();
    }

    @PostMapping
    public personel createOrUpdatePersonel(@RequestBody personel personel) {
        return personelService.saveOrUpdatePersonel(personel);
    }

    @DeleteMapping("/{id}")
    public void deletePersonel(@PathVariable Long id) {
        personelService.deletePersonel(id);
    }
}
