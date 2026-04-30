package com.primehouse.backend.dedalo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.primehouse.backend.dedalo.models.Corretores;

import com.primehouse.backend.dedalo.repositories.CorretoresRepository;

@Service
public class CorretoresService {
   
    @Autowired
private CorretoresRepository CorretoresRepository;

public Long contarCorretores(){
    return CorretoresRepository.count();
}

public Corretores buscarCorretores(Integer id ){
    return CorretoresRepository.findById(id).get();
}

public List<Corretores> listarCorretores(){
   return CorretoresRepository.findAll(); 
}


public Boolean deletarsCorretores(Integer id){
    if (CorretoresRepository.existsById(id)) {
        CorretoresRepository.deleteById(id);
        return true;
    }
    return false;
}
}
