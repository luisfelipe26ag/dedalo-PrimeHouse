package com.primehouse.backend.dedalo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping
public class CorretorController {
    
@Autowired
private CorretorService corretorService;

@GetMapping("/contar-Corretores")
public Long ContarCorretor(){

return corretorService.contarCorretor();

}

@GetMapping("buscar-corretores/{id}")
public Corretor buscarCorretores(@PathVariable Integer id){

return corretorService.buscarCorretor(id);
    
}

@GetMapping("/Listar-Corretores")
public List<Corretor> ListarCorretores(){

return corretorService.ListarCorretores();
}

@DeleteMapping("/deletar-corretor/{id}")
public String deletarCorretor(@PathVariable Integer id){

    if (corretorService.deletarCorretor(id)) {
    
        return "Corretores deletados com sucesso";
    }
    return "Falha ao deletar corretores";
}

@PostMapping("/salvar-Corretores")
public Corretor CadastrarCorretor(@RequestBody Corretor corretor){
return corretorService.CadastrarCorretor(corretor);

}

@PutMapping("/atualizar-Coretores/{id}")
public String AtualizarCorretores(@PathVariable Integer id, @RequestBody Corretor corretor){
if (corretorService.AtualizarCorretor(id, corretor) != null) {
    return "Corretores atualizados com sucesso";
}
return "Falha ao atualizar corretores";
}

}
