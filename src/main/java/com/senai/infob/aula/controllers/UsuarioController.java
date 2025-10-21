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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.aula.models.Usuario;
import com.senai.infob.aula.services.UsuarioService;






@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    public UsuarioService UsuarioService;
    
    @GetMapping("/count")
    public Long count() {
        return UsuarioService.count();
    }
    
    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario Usuario) {
        return UsuarioService.salvar(Usuario);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = UsuarioService.delete(id);
        if (deletou) {
            return "Usuario removido com sucesso";
        }
        return "falha ao remover o usuario";
    }

    @GetMapping("/buscar/{id}")
        public Usuario buscar(@PathVariable Integer id) {
        return UsuarioService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Usuario> listar() {
        return UsuarioService.listar();
    }

    @PutMapping("atualizar/{id}")
    public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario Usuario) {
        return UsuarioService.atualizar(id, Usuario);   
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return UsuarioService.login(email, senha);
    }
    
}

