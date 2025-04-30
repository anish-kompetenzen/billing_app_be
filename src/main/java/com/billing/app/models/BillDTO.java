package com.billing.app.models;

public class BillDTO {
	private Integer productId;
	private String productName;
	private String productImage;
	private String productManDate;
	private String productManufacturer;
	private String productExpDate;
	private String productCategory;
	private Double productPrice;
	private Integer productQuantity;
	private Integer productPurchaseQty;

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

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
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

	public Integer getProductPurchaseQty() {
		return productPurchaseQty;
	}

	public void setProductPurchaseQty(Integer productPurchaseQty) {
		this.productPurchaseQty = productPurchaseQty;
	}

	public BillDTO(Integer productId, String productName, String productImage, String productManDate,
			String productManufacturer, String productExpDate, String productCategory, Double productPrice,
			Integer productQuantity, Integer productPurchaseQty) {
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productManDate = productManDate;
		this.productManufacturer = productManufacturer;
		this.productExpDate = productExpDate;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productPurchaseQty = productPurchaseQty;
	}

	@Override
	public String toString() {
		return "BillDTO [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productManDate=" + productManDate + ", productManufacturer=" + productManufacturer
				+ ", productExpDate=" + productExpDate + ", productCategory=" + productCategory + ", productPrice="
				+ productPrice + ", productQuantity=" + productQuantity + ", productPurchaseQty=" + productPurchaseQty
				+ "]";
	}

	public BillDTO() {
	}
}
