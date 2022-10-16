/**
 * 
 */
package com.techie.promotion;

import com.techie.model.Order;
import com.techie.model.SKU;

/**
 * @author Praveen
 *
 *         This class is responsible for calculating the discount on Fixed
 *         Quantity SKU.
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
		double discount = 0;

		Integer quantity = order.getItems().get(sku);
		if (quantity != null && quantity >= minQuantity) {
			double totalPrice = sku.getUnitPrice() * quantity;
			double discountedPrice = ((quantity / minQuantity) * promotionPrice)
					+ ((quantity % minQuantity) * sku.getUnitPrice());
			return totalPrice - discountedPrice;
		}

		return discount;
	}

}
