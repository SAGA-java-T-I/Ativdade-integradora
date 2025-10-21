package com.senai.infob.aula.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idPerfil;
    @Column(name="objetivos_de_estudo")
    private String objetivosEstudo;
 
    public Perfil() {
    }

    public Perfil(Integer idPerfil, String objetivosEstudo) {
        this.idPerfil = idPerfil;
        this.objetivosEstudo = objetivosEstudo;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }


    public String getObjetivosEstudo() {
        return objetivosEstudo;
    }

    public void setObjetivosEstudo(String objetivosEstudo) {
        this.objetivosEstudo = objetivosEstudo;
    }

}