package com.HRapp.HRapp.controllers;

import com.HRapp.HRapp.entity.envanter;
import com.HRapp.HRapp.services.envanterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envanter")
public class envantercontroller
{
    @Autowired
    private envanterservice envanterService;

    @GetMapping
    public List<envanter> getAllEnvanter() {
        return envanterService.getAllEnvanter();
    }

    @PostMapping
    public envanter createOrUpdateEnvanter(@RequestBody envanter envanter) {
        return envanterService.saveOrUpdateEnvanter(envanter);
    }

    @DeleteMapping("/{id}")
    public void deleteEnvanter(@PathVariable Long id) {
        envanterService.deleteEnvanter(id);
    }
}
