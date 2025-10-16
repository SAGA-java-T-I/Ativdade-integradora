package com.senai.infob.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.aula.models.Calendario;
import com.senai.infob.aula.repositories.CalendarioRepository;

@Service
public class CalendarioService {
    
    @Autowired
    public CalendarioRepository calendarioRepository;

    public Long count(){
        return calendarioRepository.count();
    } 
    public Calendario salvar(Calendario Calendario) {
        return calendarioRepository.save(Calendario);
    }
    
    public boolean  delete(Integer id) {
        Calendario Calendario = calendarioRepository.findById(id).get();
        if(Calendario != null) {
            calendarioRepository.deleteById(id);
            return true;
        }
    return false;
    }

    public Calendario buscar (Integer id){
        return calendarioRepository.findById(id).get();
    }    

    public List<Calendario> listar() {
        return calendarioRepository.findAll();
    }

    public Calendario atualizar (Integer id, Calendario CalendarioAtualizado){
        Calendario e = buscar(id);
        if (e != null){
            CalendarioAtualizado.setIdCalendario(id);
            return calendarioRepository.save(CalendarioAtualizado);
    } 
    return null;
}
}