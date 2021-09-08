package com.jordy.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordy.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
