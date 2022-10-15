/**
 * 
 */
package com.techie.promotion;

import com.techie.model.Order;

/**
 * @author Praveen
 *
 */
public class FixedQuantityPromotion implements Promotion {

	@Override
	public double calculateDiscount(Order order) {
		return 0;
	}

}
