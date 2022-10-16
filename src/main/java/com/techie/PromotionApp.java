package com.techie;

import com.techie.engine.PromotionEngine;
import com.techie.model.Order;
import com.techie.model.SKU;
import com.techie.promotion.CombinationPromotion;
import com.techie.promotion.FixedQuantityPromotion;

public class PromotionApp {

	public static void main(String[] args) {
		SKU A = new SKU("A", 50);
		SKU B = new SKU("B", 30);
		SKU C = new SKU("C", 20);
		SKU D = new SKU("D", 15);

		FixedQuantityPromotion promotionA = new FixedQuantityPromotion(A, 3, 130);
		FixedQuantityPromotion promotionB = new FixedQuantityPromotion(B, 2, 45);
		CombinationPromotion promotionC = new CombinationPromotion(C, D, 30);

		PromotionEngine engine = new PromotionEngine();
		engine.addPromotions(promotionA);
		engine.addPromotions(promotionB);
		engine.addPromotions(promotionC);

		Order order1 = new Order();
		order1.addItem(A, 5);
		order1.addItem(B, 5);
		order1.addItem(C, 1);
		order1.addItem(D, 1);

		System.out.println("Total price: " + engine.calculateTotalPrice(order1));
	}

}
