package com.HR.inskay.controller;

import com.HR.inskay.entity.personelenvanter;
import com.HR.inskay.services.personelenvanterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personelenvanter")
public class personelenvantercontroller {

    @Autowired
    private personelenvanterservice personelEnvanterService;

    @GetMapping
    public List<personelenvanter> getAllPersonelEnvanter() {
        return personelEnvanterService.getAllPersonelEnvanter();
    }

    @PostMapping
    public personelenvanter createOrUpdatePersonelEnvanter(@RequestBody personelenvanter personelEnvanter) {
        return personelenvanterservice.saveOrUpdatePersonelEnvanter(personelEnvanter);
    }

    @DeleteMapping("/{id}")
    public void deletePersonelEnvanter(@PathVariable Long id) {
        personelEnvanterService.deletePersonelEnvanter(id);
    }
}
