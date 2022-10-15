/**
 * 
 */
package com.techie.promotion;

import com.techie.model.Order;
import com.techie.model.SKU;

/**
 * @author Praveen
 *
 */
public class FixedQuantityPromotion implements Promotion {

	private SKU sku;
	private int minQuantity;
	private double promotionPrice;

	public FixedQuantityPromotion(SKU sku, int minQuantity, double promotionPrice) {
		super();
		this.sku = sku;
		this.minQuantity = minQuantity;
		this.promotionPrice = promotionPrice;
	}

	@Override
	public double calculateDiscount(Order order) {
		return 0;
	}

}
