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

import com.senai.infob.aula.models.Tarefa;
import com.senai.infob.aula.services.TarefaService;






@RestController
public class TarefaController {

    @Autowired
    public TarefaService TarefaService;
    
    @GetMapping("/count")
    public Long count() {
        return TarefaService.count();
    }
    
    @PostMapping("/salvar")
    public Tarefa salvar(@RequestBody Tarefa Tarefa) {
        return TarefaService.salvar(Tarefa);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = TarefaService.delete(id);
        if (deletou) {
            return "Usuario removido com sucesso";
        }
        return "falha ao remover o usuario";
    }

    @GetMapping("/buscar/{id}")
        public Tarefa buscar(@PathVariable Integer id) {
        return TarefaService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Tarefa> listar() {
        return TarefaService.listar();
    }

    @PutMapping("atualizar/{id}")
    public Tarefa atualizar(@PathVariable Integer id, @RequestBody Tarefa Tarefa) {
        return TarefaService.atualizar(id, Tarefa);
    }
}

