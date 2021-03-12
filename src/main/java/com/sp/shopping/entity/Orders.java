package com.sp.shopping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sp.shopping.dto.ProductsDto;

/**
 * @author Praveen Kumar.v
 * @Ojas-it
 * @since 2021-02-17
 */

@Entity
@Table(name = "ORDER_M")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long order_Id;

	private String order_By;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public long getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(long order_Id) {
		this.order_Id = order_Id;
	}

	

	public String getOrder_By() {
		return order_By;
	}

	public void setOrder_By(String order_By) {
		this.order_By = order_By;
	}

}
