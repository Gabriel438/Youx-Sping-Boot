package com.spring.youx.controller;

import java.util.List;
import java.util.Optional;

import com.spring.youx.exception.CustomException;
import com.spring.youx.model.Medico;
import com.spring.youx.repository.MedicoRepository;

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
@RequestMapping("/medico")
@CrossOrigin(origins = "*")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping("/")
    public List<Medico> getMedicos() {
        return medicoRepository.findAll();
    }

    @PutMapping("/{id}")
    public Medico userEdit(@PathVariable("id") Long id, @RequestBody Medico medico) {
        Medico newMedico = medicoRepository.getOne(id);
        newMedico.setCpf(medico.getCpf());
        newMedico.setNome(medico.getNome());
        newMedico.setPassword(medico.getPassword());
        return medicoRepository.save(newMedico);
    }

    @GetMapping("/{id}")
    public Medico user(@PathVariable("id") Long id) {

        Optional<Medico> userFind = medicoRepository.findById(id);

        if (userFind.isPresent()) {
            return userFind.get();
        }

        return null;
    }

    @PostMapping("/create")
    public Medico createMedico(@RequestBody Medico medico) {
        medicoRepository.save(medico);
        return medico;
    }

}
