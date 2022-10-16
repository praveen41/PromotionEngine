/**
 * 
 */
package com.techie.promotion;

import java.util.Map;

import com.techie.model.Order;
import com.techie.model.SKU;

/**
 * @author Praveen
 * 
 * This class is responsible for calculating the discount on Combination of different SKU
 *         Quantity SKU.
 
 */
public class CombinationPromotion implements Promotion {

	private SKU sku1;
	private SKU sku2;
	private double promotionPrice;

	public CombinationPromotion(SKU sku1, SKU sku2, double promotionPrice) {
		super();
		this.sku1 = sku1;
		this.sku2 = sku2;
		this.promotionPrice = promotionPrice;
	}

	@Override
	public double calculateDiscount(Order order) {
		double discount = 0;

		Map<SKU, Integer> items = order.getItems();
		if (items.containsKey(sku1) && items.containsKey(sku2)) {
			int promotionQuantity = Math.min(items.get(sku1), items.get(sku2));
			double discountedPrice = (promotionQuantity * promotionPrice)
					+ ((items.get(sku1) - promotionQuantity) * sku1.getUnitPrice())
					+ ((items.get(sku2) - promotionQuantity) * sku2.getUnitPrice());
			double totalPrice = (items.get(sku1) * sku1.getUnitPrice()) + (items.get(sku2) * sku2.getUnitPrice());
			return totalPrice - discountedPrice;
		}

		return discount;
	}

}
