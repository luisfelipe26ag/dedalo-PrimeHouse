package com.primehouse.backend.dedalo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primehouse.backend.dedalo.models.Clientes;
import com.primehouse.backend.dedalo.services.ClientesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping
public class ClientesController {
    
@Autowired
private ClientesService clientesService;

@GetMapping("/contar-Clientes")
public Long ContarClientes(){

return clientesService.contarClientes();

}

@GetMapping("buscar-clientes/{id}")
public Clientes buscarClientes(@PathVariable Integer id){

return clientesService.buscarClientes(id);
    
}

@GetMapping("/Listar-Clientes")
public List<Clientes> ListarClientes(){

return clientesService.ListarClientes();
}

@DeleteMapping("/deletar-clientes/{id}")
public String deletarClientes(@PathVariable Integer id){

    if (clientesService.deletarClientes(id)) {
    
        return "Clientes deletados com sucesso";
    }
    return "Falha ao deletar clientes";
}

@PostMapping("/salvar-Clientes")
public Clientes CadastrarClientes(@RequestBody Clientes clientes){
return clientesService.CadastrarClientes(clientes);

}

@PutMapping("/atualizar-Clientes/{id}")
public String AtualizarClientes(@PathVariable Integer id, @RequestBody Clientes clientes){
if (clientesService.AtualizarClientes(id, clientes) != null) {
    return "Clientes atualizados com sucesso";
}
return "Falha ao atualizar clientes";
}

}