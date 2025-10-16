package com.senai.infob.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.aula.models.Tarefa;
import com.senai.infob.aula.repositories.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    public TarefaRepository tarefaRepository;

    public Long count(){
        return tarefaRepository.count();
    } 
    public Tarefa salvar(Tarefa Tarefa) {
        return tarefaRepository.save(Tarefa);
    }
    
    public boolean  delete(Integer id) {
        Tarefa Tarefa = tarefaRepository.findById(id).get();
        if(Tarefa != null) {
            tarefaRepository.deleteById(id);
            return true;
        }
    return false;
    }

    public Tarefa buscar (Integer id){
        return tarefaRepository.findById(id).get();
    }    

    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    public Tarefa atualizar (Integer id, Tarefa TarefaAtualizado){
        Tarefa e = buscar(id);
        if (e != null){
            TarefaAtualizado.setIdTarefa(id);
            return tarefaRepository.save(TarefaAtualizado);
    } 
    return null;
    }
}
