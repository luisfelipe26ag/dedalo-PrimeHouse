package com.primehouse.backend.dedalo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primehouse.backend.dedalo.models.Clientes;
import com.primehouse.backend.dedalo.repositories.ClientesRepository;

@Service
public class ClientesService {

@Autowired
private ClientesRepository ClientesRepository;

public Long contarClientes(){
    return ClientesRepository.count();
}

public Clientes buscarClientes(Integer id ){
    return ClientesRepository.findById(id).get();
}

public List<Clientes> listarClientes(){
   return ClientesRepository.findAll(); 
}

public Boolean deletarClientes(Integer id){
    if (ClientesRepository.existsById(id)) {
        ClientesRepository.deleteById(id);
        return true;
    }
    return false;
}





}
