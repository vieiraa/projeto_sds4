package com.jordy.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordy.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
