package com.techie.model;

/**
 * @author Praveen
 *
 * This model class is contain the field about the SKU.
 */
public class SKU {
	
	private String id;
	private double unitPrice;

	public SKU(String id, double unitPrice) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void updatePrice(double newPrice) {
		this.unitPrice = newPrice;
	}
}
