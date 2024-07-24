package com.HRapp.HRapp.controllers;

import com.HRapp.HRapp.entity.personelenvanter;
import com.HRapp.HRapp.services.personelenvanterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personelenvanter")
public class personelenvantercontroller
{
    @Autowired
    private personelenvanterservice personelEnvanterService;

    @GetMapping
    public List<personelenvanter> getAllPersonelEnvanter() {
        return personelEnvanterService.getAllPersonelEnvanter();
    }

    @PostMapping
    public personelenvanter createOrUpdatePersonelEnvanter(@RequestBody personelenvanter personelEnvanter) {
        return personelEnvanterService.saveOrUpdatePersonelEnvanter(personelEnvanter);
    }

    @DeleteMapping("/{id}")
    public void deletePersonelEnvanter(@PathVariable Long id) {
        personelEnvanterService.deletePersonelEnvanter(id);
    }
}
