package com.HRapp.HRapp.controllers;

import com.HRapp.HRapp.entity.envanter;
import com.HRapp.HRapp.repository.envanterrepo;
import com.HRapp.HRapp.services.envanterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envanter")
public class envantercontroller
{
    @Autowired
    private envanterrepo envanterRepository;

    @GetMapping("/filter")
    public List<envanter> filterEnvanter(@RequestParam(required = false) String  envanterTipi) {
        if ( envanterTipi == null ||  envanterTipi.isEmpty()) {
            return envanterRepository.findAll();
        }
        return envanterRepository.findByTipiContaining( envanterTipi);
    }

    @GetMapping("/{id}")
    public ResponseEntity<envanter> getEnvanterById(@PathVariable Long id) {
        return envanterRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public envanter createEnvanter(@RequestBody envanter envanter) {
        return envanterRepository.save(envanter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<envanter> updateEnvanter(@PathVariable Long id, @RequestBody envanter envanterDetails) {
        return envanterRepository.findById(id)
                .map(envanter -> {
                    envanter.setEnvanterTipi(envanterDetails. getEnvanterTipi());
                    envanter.setMarka(envanterDetails.getMarka());
                    envanter.setModel(envanterDetails.getModel());
                    envanter.setSeriNumarasi(envanterDetails.getSeriNumarasi());
                    envanter.setStatu(envanterDetails.getStatu());
                    envanterRepository.save(envanter);
                    return ResponseEntity.ok(envanter);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
