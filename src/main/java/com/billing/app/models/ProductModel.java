package com.billing.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_details")
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_image")
	private String productImage;
	@Column(name = "product_man_date")
	private String productManDate;
	@Column(name = "product_manufacturer")
	private String productManufacturer;
	@Column(name = "product_exp_date")
	private String productExpDate;
	@Column(name = "product_category")
	private String productCategory;
	@Column(name = "product_price")
	private Double productPrice;
	@Column(name = "product_quantity")
	private Integer productQuantity;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductManDate() {
		return productManDate;
	}

	public void setProductManDate(String productManDate) {
		this.productManDate = productManDate;
	}

	public String getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(String productExpDate) {
		this.productExpDate = productExpDate;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", productImage="
				+ productImage + ", productManDate=" + productManDate + ", productManufacturer=" + productManufacturer
				+ ", productExpDate=" + productExpDate + ", productCategory=" + productCategory + ", productPrice="
				+ productPrice + ", productQuantity=" + productQuantity + "]";
	}

	public ProductModel(Integer productId, String productName, String productImage, String productManDate,
			String productManufacturer, String productExpDate, String productCategory, Double productPrice,
			Integer productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productManDate = productManDate;
		this.productManufacturer = productManufacturer;
		this.productExpDate = productExpDate;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public ProductModel() {
	}
}
