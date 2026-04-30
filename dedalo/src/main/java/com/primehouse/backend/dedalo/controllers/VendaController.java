package com.primehouse.backend.dedalo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.primehouse.backend.dedalo.Models.Venda;
import com.primehouse.backend.dedalo.service.VendaService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping
public class VendaController {
    

    
@Autowired
private VendaService vendaService;

@GetMapping("/contar-vendas")
public Long ContarVendas(){

return vendaService.contarVendas();

}

@GetMapping("buscar-Vendas/{id}")
public Venda buscarVendas(@PathVariable Integer id){

return vendaService.buscarVendas(id);
    
}

@GetMapping("/Listar-Vendas")
public List<Venda> ListarVenda(){

return vendaService.ListarVenda();
}

@DeleteMapping("/deletar-Venda/{id}")
public String deletarVenda(@PathVariable Integer id){

    if (vendaService.deletarVenda(id)) {
    
        return "Venda deletada com sucesso";
    }
    return "Falha ao deletar Venda";
}

@PostMapping("/salvar-Venda")
public Venda CadastrarVendas(@RequestBody Venda venda){
return vendaService.CadastrarVendas(venda);

}

@PutMapping("/atualizar-Vendas/{id}")
public String AtualizarVendas(@PathVariable Integer id, @RequestBody Venda venda){
if (vendaService.AtualizarVendas(id, venda) != null) {
    return "Vendas atualizados com sucesso";
}
return "Falha ao atualizar Vendas";
}

}
