package com.privalia.collections;

import java.util.Map;

public class Product {
	
	private int idProduct;
	private String name;
	private Map<Long,Category> categoryList;
	/**
	 * @return the idProduct
	 */
	public int getIdProduct() {
		return idProduct;
	}
	/**
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the categoryList
	 */
	public Map<Long, Category> getCategoryList() {
		return categoryList;
	}
	/**
	 * @param categoryList the categoryList to set
	 */
	public void setCategoryList(Map<Long, Category> categoryList) {
		this.categoryList = categoryList;
	}

}
