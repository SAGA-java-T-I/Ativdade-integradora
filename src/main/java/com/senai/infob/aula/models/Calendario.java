package com.senai.infob.aula.models;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="calendario")
public class Calendario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idCalendario;
    @Column(name="rotina")
    private Integer idRotina;
    @Column(name="tarefa")
    private Integer idTarefa;
    @Column(name="data_Marcada")
    private LocalDate dataMarcada;

    public Calendario() {
    }

    public Calendario(LocalDate dataMarcada, Integer idCalendario, Integer idRotina, Integer idTarefa) {
        this.dataMarcada = dataMarcada;
        this.idCalendario = idCalendario;
        this.idRotina = idRotina;
        this.idTarefa = idTarefa;
    }

    public Integer getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(Integer idCalendario) {
        this.idCalendario = idCalendario;
    }

    public Integer getIdRotina() {
        return idRotina;
    }

    public void setIdRotina(Integer idRotina) {
        this.idRotina = idRotina;
    }

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public LocalDate getDataMarcada() {
        return dataMarcada;
    }

    public void setDataMarcada(LocalDate dataMarcada) {
        this.dataMarcada = dataMarcada;
    }

}
