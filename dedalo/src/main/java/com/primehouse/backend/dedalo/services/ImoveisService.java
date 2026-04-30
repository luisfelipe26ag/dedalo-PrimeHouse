package com.primehouse.backend.dedalo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primehouse.backend.dedalo.models.Imoveis;
import com.primehouse.backend.dedalo.repositories.ImoveisRepository;

@Service
public class ImoveisService {
    @Autowired
private ImoveisRepository ImoveisRepository;

public Long contarImoveis(){
    return ImoveisRepository.count();
}

public Imoveis buscarImoveis(Integer id ){
    return ImoveisRepository.findById(id).get();
}

public List<Imoveis> listarImoveis(){
   return ImoveisRepository.findAll(); 
}

public Boolean deletarImoveis(Integer id){
    if (ImoveisRepository.existsById(id)) {
        ImoveisRepository.deleteById(id);
        return true;
    }
    return false;
}
}
