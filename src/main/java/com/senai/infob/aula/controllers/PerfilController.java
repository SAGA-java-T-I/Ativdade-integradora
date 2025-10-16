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

import com.senai.infob.aula.models.Perfil;
import com.senai.infob.aula.services.PerfilService;






@RestController
public class PerfilController {

    @Autowired
    public PerfilService PerfilService;
    
    @GetMapping("/count")
    public Long count() {
        return PerfilService.count();
    }
    
    @PostMapping("/salvar")
    public Perfil salvar(@RequestBody Perfil perfil) {
        return PerfilService.salvar(perfil);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = PerfilService.delete(id);
        if (deletou) {
            return "Usuario removido com sucesso";
        }
        return "falha ao remover o usuario";
    }

    @GetMapping("/buscar/{id}")
        public Perfil buscar(@PathVariable Integer id) {
        return PerfilService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Perfil> listar() {
        return PerfilService.listar();
    }

    @PutMapping("atualizar/{id}")
    public Perfil atualizar(@PathVariable Integer id, @RequestBody Perfil perfil) {
        return PerfilService.atualizar(id, perfil);
    }
}
