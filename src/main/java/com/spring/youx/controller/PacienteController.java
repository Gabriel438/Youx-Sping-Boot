package com.spring.youx.controller;

import java.util.List;
import java.util.Optional;

import com.spring.youx.model.Paciente;
import com.spring.youx.repository.PacienteRepository;

import org.apache.catalina.User;
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
@RequestMapping("/paciente")
@CrossOrigin(origins = "*")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/")
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Paciente user(@PathVariable("id") Long id) {

        Optional<Paciente> userFind = pacienteRepository.findById(id);

        if (userFind.isPresent()) {
            return userFind.get();
        }

        return null;
    }

    @PutMapping("/{id}")
    public Paciente userEdit(@PathVariable("id") Long id, @RequestBody Paciente paciente) {
        Paciente newPaciente = pacienteRepository.getOne(id);
        newPaciente.setCpf(paciente.getCpf());
        newPaciente.setEmail(paciente.getEmail());
        newPaciente.setNome(paciente.getNome());
        newPaciente.setSobrenome(paciente.getSobrenome());
        newPaciente.setPassword(paciente.getPassword());
        return pacienteRepository.save(newPaciente);
    }

    @PostMapping("/create")
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        pacienteRepository.save(paciente);
        return paciente;
    }

}
