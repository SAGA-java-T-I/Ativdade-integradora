package com.senai.infob.aula.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil extends Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idPerfil;
    @Column(name="id")
    private Integer idTarefa;
    @Column(name="objetivos_de_estudo")
    private String objetivosEstudo;
 
    public Perfil() {
    }

    public Perfil(Integer idPerfil, Integer idTarefa, String objetivosEstudo) {
        this.idPerfil = idPerfil;
        this.idTarefa = idTarefa;
        this.objetivosEstudo = objetivosEstudo;
    }

    public Perfil(Integer idPerfil, Integer idTarefa, String objetivosEstudo, LocalDate dataNascimento, String email, Integer idUser, String logradouro, String nome, String senha, String uF) {
        super(dataNascimento, email, idUser, logradouro, nome, senha, uF);
        this.idPerfil = idPerfil;
        this.idTarefa = idTarefa;
        this.objetivosEstudo = objetivosEstudo;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getObjetivosEstudo() {
        return objetivosEstudo;
    }

    public void setObjetivosEstudo(String objetivosEstudo) {
        this.objetivosEstudo = objetivosEstudo;
    }

}
