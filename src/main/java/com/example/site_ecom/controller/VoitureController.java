package com.example.site_ecom.controller;

import com.example.site_ecom.dao.VoitureDao;
import com.example.site_ecom.exception.VoitureNotFoundException;
import com.example.site_ecom.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/voitures")
public class VoitureController {

    @Autowired
    VoitureDao voitureDao;


    @GetMapping("/{id}")
    public Voiture aff(@PathVariable Long id) {

        Optional<Voiture> id1 = voitureDao.findById(id);
        if (
                id1.isPresent()

        ) {
            return id1.get();
        } else
            throw new VoitureNotFoundException("voiture de id:" + id + "non trouvé");


    }


    @PostMapping()
    ResponseEntity<Voiture> crt(@Valid @RequestBody Voiture voiture) {
        Voiture voiture1 = voitureDao.save(voiture);
        return ResponseEntity.ok(voiture1);
    }

    @DeleteMapping("/{id}")
    public void sup(@PathVariable Long id) {

        voitureDao.deleteById(id);
    }

    @PutMapping("/{id}")
    public Voiture upd(@PathVariable Long id, @RequestBody Voiture voiture) {
        voiture.setId(id);
        return voitureDao.save(voiture);
    }


}
