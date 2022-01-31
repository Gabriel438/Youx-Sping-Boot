package com.spring.youx.controller;

import java.util.List;
import java.util.Optional;

import com.spring.youx.model.Enfermeiro;
import com.spring.youx.repository.EnfermeiroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enfermeiro")
@CrossOrigin(origins = "*")
public class EnfermeiroController {

    @Autowired
    private EnfermeiroRepository enfermeiroRepository;

    @GetMapping("/")
    public List<Enfermeiro> getEnfermeiros() {
        return enfermeiroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Enfermeiro user(@PathVariable("id") Long id) {

        Optional<Enfermeiro> userFind = enfermeiroRepository.findById(id);

        if (userFind.isPresent()) {
            return userFind.get();
        }

        return null;
    }

    @PutMapping("/{id}")
    public Enfermeiro userEdit(@PathVariable("id") Long id, @RequestBody Enfermeiro enfermeiro) {
        Enfermeiro newEnfermeiro = enfermeiroRepository.getOne(id);
        newEnfermeiro.setCpf(enfermeiro.getCpf());
        newEnfermeiro.setNome(enfermeiro.getNome());
        newEnfermeiro.setPassword(enfermeiro.getPassword());
        return enfermeiroRepository.save(newEnfermeiro);
    }

    @PostMapping("/create")
    public Enfermeiro createEnfermeiro(@RequestBody Enfermeiro enfermeiro) {
        enfermeiroRepository.save(enfermeiro);
        return enfermeiro;
    }

}
