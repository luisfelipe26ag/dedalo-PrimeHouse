package com.primehouse.backend.dedalo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "cpf_cliente")
    private String cpfCliente;
    
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    
    @Column(name = "email_cliente")
    private String emailCliente;

    public Clientes(){

    }

    public Clientes(Integer id, String nome_cliente,String cpfCliente, String telefoneCliente, String emailCliente){
        this.id = id;
        this.nome = nome_cliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }







}
