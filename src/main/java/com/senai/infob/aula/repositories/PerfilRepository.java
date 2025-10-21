package com.senai.infob.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.aula.models.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer>{
        
}
