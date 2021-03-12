package com.sp.shopping.dto;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Praveen Kumar.v
 * @Ojas-it
 * @since 2021-02-17
 */
@Component
public class OrdersDto {
	@JsonProperty(value = "ORDER_BY")
	private String order_By;
	@JsonProperty(value = "PRODUCT_LIST")
	private List<ProductsDto> prodList;
	@JsonProperty(value = "FILE")
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public List<ProductsDto> getProdList() {
		return prodList;
	}

	public void setProdList(List<ProductsDto> prodList) {
		this.prodList = prodList;
	}

	public String getOrder_By() {
		return order_By;
	}

	public void setOrder_By(String order_By) {
		this.order_By = order_By;
	}

}
