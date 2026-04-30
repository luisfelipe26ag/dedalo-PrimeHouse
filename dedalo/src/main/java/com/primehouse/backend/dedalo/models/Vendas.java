package com.primehouse.backend.dedalo.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "vendas")
public class Vendas {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "imovel")
    private String imovel;

    @Column(name = "comprador")
    private String comprador;
    
    @Column(name = "corretor")
    private String corretor;
    
    @Column(name = "data_venda")
    private String data_venda;

    public Vendas(){

    }

    public Vendas(Integer id, String imovel,String comprador, String corretor, String data_venda){
        this.id = id;
        this.imovel = imovel;
        this.comprador = comprador;
        this.corretor = corretor;
        this.data_venda = data_venda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getimovel() {
        return imovel;
    }

    public void setimovel(String imovel) {
        this.imovel = imovel;
    }

    public String getcomprador() {
        return comprador;
    }

    public void setcomprador(String comprador) {
        this.comprador = comprador;
    }

    public String getcorretor() {
        return corretor;
    }

    public void setcorretor(String corretor) {
        this.corretor = corretor;
    }

    public String getdata_venda() {
        return data_venda;
    }

    public void setdata_venda(String data_venda) {
        this.data_venda = data_venda;
    }







}
  

