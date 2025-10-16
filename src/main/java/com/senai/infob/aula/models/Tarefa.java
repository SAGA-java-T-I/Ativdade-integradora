package com.senai.infob.aula.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tarefa")
public class Tarefa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idTarefa;
    @Column(name="id")
    private Integer idRotina;
    @Column(name="titulo")
    private String titulo;
    @Column(name="descricao")
    private String descricao;
    @Column(name="tarefa_concluida")
    private Integer tarefaConcluida;
    @Column(name="tarefa_pendente")
    private Integer tarefaPendente;

    public Tarefa() {
    }

    public Tarefa(String descricao, Integer idRotina, Integer idTarefa, Integer tarefaConcluida, Integer tarefaPendente, String titulo) {
        this.descricao = descricao;
        this.idRotina = idRotina;
        this.idTarefa = idTarefa;
        this.tarefaConcluida = tarefaConcluida;
        this.tarefaPendente = tarefaPendente;
        this.titulo = titulo;
    }

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Integer getIdRotina() {
        return idRotina;
    }

    public void setIdRotina(Integer idRotina) {
        this.idRotina = idRotina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
