package com.HR.inskay.controller;

import com.HR.inskay.entity.Envanter;
import com.HR.inskay.repository.EnvanterRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
@Setter
@Controller
@RestController
@RequestMapping( "/envanter")
public class EnvanterController {

    @Autowired
    private EnvanterRepository envanterRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Envanter> getEnvanterById(@PathVariable Long id) {
        Optional<Envanter> envanter = envanterRepository.findById(id);
        return envanter.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Envanter createEnvanter(@RequestBody Envanter envanter) {
        return envanterRepository.save(envanter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Envanter> updateEnvanter(@PathVariable Long id, @RequestBody Envanter envanterDetails) {
        Optional<Envanter> envanter = envanterRepository.findById(id);
        if (envanter.isPresent()) {
            envanter.get().setEnvanterTipi(envanterDetails.getEnvanterTipi());
            envanter.get().setMarka(envanterDetails.getMarka());
            envanter.get().setModel(envanterDetails.getModel());
            envanter.get().setSeriNumarasi(envanterDetails.getSeriNumarasi());
            envanter.get().setStatu(envanterDetails.getStatu());
            envanterRepository.save(envanter.get());
            return ResponseEntity.ok(envanter.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
