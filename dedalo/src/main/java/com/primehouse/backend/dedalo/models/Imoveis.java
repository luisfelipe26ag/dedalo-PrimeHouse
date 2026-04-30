package com.primehouse.backend.dedalo.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "imoveis")
public class Imoveis {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "valor_imovel")
    private String valor_imovel;

    @Column(name = "bairro_imovel")
    private String bairro_imovel;
    
    @ManyToOne
    @JoinColumn(name = "proprietario")
    private List<Clientes> proprietario;

    public Imoveis() {
    }

    public Imoveis(Integer id, String valor_imovel, String bairro_imovel, List<Clientes> proprietario) {
        this.id = id;
        this.valor_imovel = valor_imovel;
        this.bairro_imovel = bairro_imovel;
        this.proprietario = proprietario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValor_imovel() {
        return valor_imovel;
    }

    public void setValor_imovel(String valor_imovel) {
        this.valor_imovel = valor_imovel;
    }

    public String getBairro_imovel() {
        return bairro_imovel;
    }

    public void setBairro_imovel(String bairro_imovel) {
        this.bairro_imovel = bairro_imovel;
    }

    public List<Clientes> getProprietario() {
        return proprietario;
    }

    public void setProprietario(List<Clientes> proprietario) {
        this.proprietario = proprietario;
    }
    
    
    

}
