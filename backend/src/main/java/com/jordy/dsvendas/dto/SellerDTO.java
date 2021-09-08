package com.jordy.dsvendas.dto;

import java.io.Serializable;

import com.jordy.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDTO() {}
	
	public SellerDTO(Seller seller) {
		this.id = seller.getId();
		this.name = seller.getName();
	}

	public SellerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
