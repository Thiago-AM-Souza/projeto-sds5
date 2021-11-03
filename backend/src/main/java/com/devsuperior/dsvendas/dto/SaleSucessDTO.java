package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDTO {

	private String sellerName;
	private Long visited;
	private Long sucess;
	
	public SaleSucessDTO() {
	}

	public SaleSucessDTO(Seller seller, Long visited, Long sucess) {
		sellerName = seller.getName();
		this.visited = visited;
		this.sucess = sucess;
	}

	public SaleSucessDTO(String sellerName, Long visited, Long sucess) {
		super();
		this.sellerName = sellerName;
		this.visited = visited;
		this.sucess = sucess;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getSucess() {
		return sucess;
	}

	public void setSucess(Long sucess) {
		this.sucess = sucess;
	}
	
	
}
