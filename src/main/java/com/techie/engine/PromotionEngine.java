/**
 * 
 */
package com.techie.engine;

import java.util.ArrayList;
import java.util.List;

import com.techie.model.Order;
import com.techie.promotion.Promotion;

/**
 * @author Praveen
 *
 */
public class PromotionEngine {

	private List<Promotion> promotions;

	public PromotionEngine() {
		promotions = new ArrayList<>();
	}

	public double calculateTotalPrice(Order order) {
		return 280;
	}

	public void addPromotions(Promotion promotion) {
		promotions.add(promotion);

	}

}
