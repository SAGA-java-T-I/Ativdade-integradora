package com.senai.infob.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.aula.models.Usuario;
import com.senai.infob.aula.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepository;

    public Long count(){
        return usuarioRepository.count();
    } 
    public Usuario salvar(Usuario Usuario) {
        return usuarioRepository.save(Usuario);
    }
    
    public boolean  delete(Integer id) {
        Usuario Usuario = usuarioRepository.findById(id).get();
        if(Usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
    return false;
    }

    public Usuario buscar (Integer id){
        return usuarioRepository.findById(id).get();
    }    

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario atualizar (Integer id, Usuario TarefaAtualizado){
        Usuario e = buscar(id);
        if (e != null){
            TarefaAtualizado.setIdUser(id);
            return usuarioRepository.save(TarefaAtualizado);
    } 
    return null;
}
    public String login(String email, String senha ) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso";
        }
        return "Falha ao realizar login";
    }

}
