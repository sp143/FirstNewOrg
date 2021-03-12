package com.sp.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Praveen Kumar.v
 * @Ojas-it
 * @since 2021-02-17
 */

@Entity
@Table(name = "PRODUCT_M")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prod_Id;
	private String pName;
	private String pCost;

	@ManyToOne
	@JoinColumn(name = "order_Id")
	private Orders order;

	public long getProd_Id() {
		return prod_Id;
	}

	public void setProd_Id(long prod_Id) {
		this.prod_Id = prod_Id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

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
