package com.senai.infob.aula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.aula.models.Calendario;
import com.senai.infob.aula.services.CalendarioService;






@RestController
public class CalendarioController {

    @Autowired
    public CalendarioService calendarioService;
    
    @GetMapping("/count")
    public Long count() {
        return calendarioService.count();
    }
    
    @PostMapping("/salvar")
    public Calendario salvar(@RequestBody Calendario Calendario) {
        return calendarioService.salvar(Calendario);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = calendarioService.delete(id);
        if (deletou) {
            return "Usuario removido com sucesso";
        }
        return "falha ao remover o usuario";
    }

    @GetMapping("/buscar/{id}")
        public Calendario buscar(@PathVariable Integer id) {
        return calendarioService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Calendario> listar() {
        return calendarioService.listar();
    }

    @PutMapping("atualizar/{id}")
    public Calendario atualizar(@PathVariable Integer id, @RequestBody Calendario Calendario) {
        return calendarioService.atualizar(id, Calendario);
    }
}
