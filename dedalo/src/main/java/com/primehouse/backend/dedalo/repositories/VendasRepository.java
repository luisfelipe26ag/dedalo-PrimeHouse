package com.primehouse.backend.dedalo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primehouse.backend.dedalo.models.Vendas;

@Repository
public interface VendasRepository  extends JpaRepository <Vendas, Integer> {
    
}
