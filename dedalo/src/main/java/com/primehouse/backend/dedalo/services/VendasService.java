package com.primehouse.backend.dedalo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primehouse.backend.dedalo.models.Vendas;
import com.primehouse.backend.dedalo.repositories.VendasRepository;

@Service
public class VendasService {
    @Autowired
private VendasRepository VendasRepository;

public Long contarVendas(){
    return VendasRepository.count();
}

public Vendas buscarVendas(Integer id ){
    return VendasRepository.findById(id).get();
}

public List<Vendas> listarVendas(){
   return VendasRepository.findAll(); 
}

public Boolean deletarVendas(Integer id){
    if (VendasRepository.existsById(id)) {
        VendasRepository.deleteById(id);
        return true;
    }
    return false;
}
}
