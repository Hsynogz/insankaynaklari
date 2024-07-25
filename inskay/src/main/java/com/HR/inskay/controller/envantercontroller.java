package com.HR.inskay.controller;

import com.HR.inskay.entity.envanter;
import com.HR.inskay.repository.envanterrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/envanter")
public class envantercontroller {

    @Autowired
    private envanterrepository envanterRepository;


    @GetMapping("/{id}")
    public ResponseEntity<envanter> getEnvanterById(@PathVariable Long id) {
        return envanterRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}")
    public envanter createEnvanter(@RequestBody envanter envanter) {
        return envanterRepository.save(envanter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<envanter> updateEnvanter(@PathVariable Long id, @RequestBody envanter envanterDetails) {
        return envanterRepository.findById(id)
                .map(envanter -> {
                    envanter.setenvanterTipi(envanterDetails.getenvanterTipi());
                    envanter.setmarka(envanterDetails.getmarka());
                    envanter.setModel(envanterDetails.getModel());
                    envanter.setSerinumarasi(envanterDetails.getSerinumarasi());
                    envanter.setStatu(envanterDetails.getStatu());
                    envanterRepository.save(envanter);
                    return ResponseEntity.ok(envanter);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
