package com.sp.shopping.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Praveen Kumar.v
 * @Ojas-it
 * @since 2021-02-17
 */
@Component
public class ProductsDto {
	@JsonProperty("PNAME")
	private String pName;

	@JsonProperty("PCOST")
	private String pCost;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCost() {
		return pCost;
	}

	public void setpCost(String pCost) {
		this.pCost = pCost;
	}


}
