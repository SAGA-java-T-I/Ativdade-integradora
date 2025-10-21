package com.senai.infob.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.aula.models.SubTarefa;
import com.senai.infob.aula.repositories.SubTarefaRepository;

@Service
public class SubTarefaService {
    
    @Autowired
    public SubTarefaRepository subTarefaRepository;

    public Long count(){
        return subTarefaRepository.count();
    } 
    public SubTarefa salvar(SubTarefa SubTarefa) {
        return subTarefaRepository.save(SubTarefa);
    }
    
    public boolean  delete(Integer id) {
        SubTarefa subTarefa = subTarefaRepository.findById(id).get();
        if(subTarefa != null) {
            subTarefaRepository.deleteById(id);
            return true;
        }
    return false;
    }

    public SubTarefa buscar (Integer id){
        return subTarefaRepository.findById(id).get();
    }    

    public List<SubTarefa> listar() {
        return subTarefaRepository.findAll();
    }

    public SubTarefa atualizar (Integer id, SubTarefa CalendarioAtualizado){
        SubTarefa e = buscar(id);
        if (e != null){
            CalendarioAtualizado.setIdSubTarefa(id);
            return subTarefaRepository.save(CalendarioAtualizado);
    } 
    return null;
}
}
