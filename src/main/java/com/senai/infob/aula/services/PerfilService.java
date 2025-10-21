package com.senai.infob.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.aula.models.Perfil;
import com.senai.infob.aula.repositories.PerfilRepository;

@Service
public class PerfilService {
    
    @Autowired
    public PerfilRepository perfilRepository;

    public Long count(){
        return perfilRepository.count();
    } 
    public Perfil salvar(Perfil Perfil) {
        return perfilRepository.save(Perfil);
    }
    
    public boolean  delete(Integer id) {
        Perfil Perfil = perfilRepository.findById(id).get();
        if(Perfil != null) {
            perfilRepository.deleteById(id);
            return true;
        }
    return false;
    }

    public Perfil buscar (Integer id){
        return perfilRepository.findById(id).get();
    }    

    public List<Perfil> listar() {
        return perfilRepository.findAll();
    }

    public Perfil atualizar (Integer id, Perfil PerfilAtualizado){
        Perfil e = buscar(id);
        if (e != null){
            PerfilAtualizado.setIdPerfil(id);
            return perfilRepository.save(PerfilAtualizado);
    } 
    return null;
}
}
