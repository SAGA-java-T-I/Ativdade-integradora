package com.senai.infob.aula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.aula.models.SubTarefa;
import com.senai.infob.aula.services.SubTarefaService;






@RestController
@RequestMapping("subTarefa")
public class SubTarefaController {

    @Autowired
    public SubTarefaService SubTarefaService;
    
    @GetMapping("/count")
    public Long count() {
        return SubTarefaService.count();
    }
    
    @PostMapping("/salvar")
    public SubTarefa salvar(@RequestBody SubTarefa SubTarefa) {
        return SubTarefaService.salvar(SubTarefa);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = SubTarefaService.delete(id);
        if (deletou) {
            return "Usuario removido com sucesso";
        }
        return "falha ao remover o usuario";
    }

    @GetMapping("/buscar/{id}")
        public SubTarefa buscar(@PathVariable Integer id) {
        return SubTarefaService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<SubTarefa> listar() {
        return SubTarefaService.listar();
    }

    @PutMapping("atualizar/{id}")
    public SubTarefa atualizar(@PathVariable Integer id, @RequestBody SubTarefa subTarefa) {
        return SubTarefaService.atualizar(id, subTarefa);
    }
}
