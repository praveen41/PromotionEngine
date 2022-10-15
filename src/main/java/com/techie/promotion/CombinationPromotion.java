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
		// TODO Auto-generated method stub
		return 0;
	}

}
