package com.billing.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bill_details")
public class BillModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private Integer billId;
	@Column(name = "bill_time")
	private String billTime;
	@Column(name = "bill_date")
	private String billDate;
	@Column(name = "cashier_name")
	private String cashierName;
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_price")
	private Double productPrice;
	@Column(name = "product_manufacturer")
	private String productManufacturer;
	@Column(name = "product_quantity")
	private Integer productQuantity;

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getBillTime() {
		return billTime;
	}

	public void setBillTime(String billTime) {
		this.billTime = billTime;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getCashierName() {
		return cashierName;
	}

	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

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

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "BillModel [billId=" + billId + ", billTime=" + billTime + ", billDate=" + billDate + ", cashierName="
				+ cashierName + ", productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productManufacturer=" + productManufacturer + ", productQuantity=" + productQuantity
				+ "]";
	}

	public BillModel(Integer billId, String billTime, String billDate, String cashierName, Integer productId,
			String productName, Double productPrice, String productManufacturer, Integer productQuantity) {
		this.billId = billId;
		this.billTime = billTime;
		this.billDate = billDate;
		this.cashierName = cashierName;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productManufacturer = productManufacturer;
		this.productQuantity = productQuantity;
	}

	public BillModel() {
	}
}
