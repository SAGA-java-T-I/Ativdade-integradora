package com.senai.infob.aula.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subTarefa")
public class SubTarefa extends Tarefa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idSubTarefa;
    @Column(name="descricao")
    private String descricao;
    @Column(name="rotina")
    private Integer idRotina;
    @Column(name="tarefa_concluida")
    private Integer tarefaConcluida;
    @Column(name="tarefa_pendente")
    private Integer tarefaPendente;

    public SubTarefa() {
    }

    public SubTarefa(String descricao, Integer idRotina, Integer idSubTarefa, Integer tarefaConcluida, Integer tarefaPendente) {
        this.descricao = descricao;
        this.idRotina = idRotina;
        this.idSubTarefa = idSubTarefa;
        this.tarefaConcluida = tarefaConcluida;
        this.tarefaPendente = tarefaPendente;
    }

    public Integer getIdSubTarefa() {
        return idSubTarefa;
    }

    public void setIdSubTarefa(Integer idSubTarefa) {
        this.idSubTarefa = idSubTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdRotina() {
        return idRotina;
    }

    public void setIdRotina(Integer idRotina) {
        this.idRotina = idRotina;
    }

    public Integer getTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(Integer tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    public Integer getTarefaPendente() {
        return tarefaPendente;
    }

    public void setTarefaPendente(Integer tarefaPendente) {
        this.tarefaPendente = tarefaPendente;
    }
}
