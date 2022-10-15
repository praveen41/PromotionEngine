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
		double discountedAmount = calculateDiscount(order);

		double totalAmount = order.getItems().entrySet().stream()
				.mapToDouble(p -> p.getKey().getUnitPrice() * p.getValue()).sum();

		return totalAmount - discountedAmount;

	}

	private double calculateDiscount(Order order) {
		return promotions.stream().mapToDouble(p -> p.calculateDiscount(order)).sum();
	}

	public void addPromotions(Promotion promotion) {
		promotions.add(promotion);

	}

}
