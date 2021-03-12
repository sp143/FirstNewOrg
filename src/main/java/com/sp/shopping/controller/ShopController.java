package com.sp.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.shopping.dto.OrdersDto;
import com.sp.shopping.dto.ProductsDto;
import com.sp.shopping.entity.Orders;
import com.sp.shopping.entity.Product;
import com.sp.shopping.repo.OrderRepository;
import com.sp.shopping.repo.ProductRepository;

/**
 * @author Praveen Kumar.v
 * @Ojas-it
 * @since 2021-02-17
 */
@RestController
public class ShopController {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders() {
		System.out.println("Hello in all Orders get");
		List<Orders> od = orderRepository.findAll();
		return od;
	}

	@PostMapping("/saveOrders")
	public Orders saveOrders(@RequestBody OrdersDto o) {
		System.out.println("Hello in all Orders get");
		Orders oEntity = new Orders();
		oEntity.setOrder_By(o.getOrder_By());
		List<ProductsDto> lp = o.getProdList();
		List<Product> lpEn = new ArrayList<Product>();

		System.out.println("LP" + lp);
		for (ProductsDto productsDto : lp) {
			Product p = new Product();
			p.setpCost(productsDto.getpCost());
			p.setpName(productsDto.getpName());
			lpEn.add(p);
		}

//		lp.stream().allMatch(null)
//		lists.add(null);
//		lists.add(null);
		oEntity.setProducts(lpEn);
		Orders od = orderRepository.save(oEntity);
		return od;
	}

	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		System.out.println("Hello in all Orders get");
		List<Product> od = productRepository.findAll();
		return od;
	}

	@PostMapping("/postCheck")
	public String postCheckData(@RequestBody OrdersDto o) { 
		System.out.println("Hello in all Orders get" + o.getFile());
		//System.out.println("Hello in all Orders get fileeee " + reapExcelDataFile);
		List<Product> od = productRepository.findAll();
		return "Hello tested";
	}

}
