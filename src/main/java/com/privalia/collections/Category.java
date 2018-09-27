package com.privalia.collections;

import java.util.Map;

public class Category {
	
	private int idCategory;
	private String name;
	private Map<Long, Product> productList;
	/**
	 * @return the idCategory
	 */
	public int getIdCategory() {
		return idCategory;
	}
	/**
	 * @param idCategory the idCategory to set
	 */
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
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
	 * @return the productList
	 */
	public Map<Long, Product> getProductList() {
		return productList;
	}
	/**
	 * @param productList the productList to set
	 */
	public void setProductList(Map<Long, Product> productList) {
		this.productList = productList;
	}

}
