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
public class ImovelController {
    
@Autowired
private ImovelService imovelService;

@GetMapping("/contar-Imovel")
public Long ContarImovel(){

return imovelService.contarImovel();

}

@GetMapping("buscar-Imoveis/{id}")
public Imovel buscarImovel(@PathVariable Integer id){

return imovelService.buscarImovel(id);
    
}

@GetMapping("/Listar-Imoveis")
public List<Imovel> ListarImovel(){

return imovelService.ListarImovel();
}

@DeleteMapping("/deletar-Imovel/{id}")
public String deletarClientes(@PathVariable Integer id){

    if (imovelService.deletarImovel(id)) {
    
        return "Imoveis deletados com sucesso";
    }
    return "Falha ao deletar Imoveis";
}

@PostMapping("/salvar-Imoveis")
public Imovel CadastrarImovel(@RequestBody Imovel imovel){
return imovelService.CadastrarImovel(imovel);

}

@PutMapping("/atualizar-Imoveis/{id}")
public String AtualizarImoveis(@PathVariable Integer id, @RequestBody Imovel imovel){
if (imovelService.AtualizarImovel(id, imovel) != null) {
    return "Imoveis atualizados com sucesso";
}
return "Falha ao atualizar Imoveis";
}

}
