package com.mis.domain;

public class ProductVO {
	
	private String name;
	private double price;
	private int size;
	private int quantity;
	
	public ProductVO() {
		
	}
	
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public ProductVO(String name, double price, int size, int quantity) {
		this(name, price);
		this.size = size;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", size=" + size + ", quantity=" + quantity + "]";
	}

	
}
