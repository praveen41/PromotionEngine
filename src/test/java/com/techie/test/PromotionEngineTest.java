/**
 * 
 */
package com.techie.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techie.engine.PromotionEngine;
import com.techie.model.Order;
import com.techie.model.SKU;
import com.techie.promotion.CombinationPromotion;
import com.techie.promotion.FixedQuantityPromotion;
import com.techie.promotion.Promotion;

/**
 * @author Praveen
 *
 */
public class PromotionEngineTest {

	Map<String, SKU> items;
	PromotionEngine engine;

	@Before
	public void init() {
		SKU A = new SKU("A", 50);
		SKU B = new SKU("B", 30);
		SKU C = new SKU("C", 20);
		SKU D = new SKU("D", 15);

		items = new HashMap<>();
		items.put("A", A);
		items.put("B", B);
		items.put("C", C);
		items.put("D", D);

		Promotion promotionA = new FixedQuantityPromotion(A, 3, 130);
		Promotion promotionB = new FixedQuantityPromotion(B, 2, 45);
		Promotion promotionC = new CombinationPromotion(C, D, 30);

		engine = new PromotionEngine();
		engine.addPromotions(promotionA);
		engine.addPromotions(promotionB);
		engine.addPromotions(promotionC);

	}

	@Test
	public void calculateSKUCartWithFixed() {

		Order order = new Order();
		order.addItem(items.get("A"), 3);
		order.addItem(items.get("B"), 2);
		order.addItem(items.get("C"), 1);
		double totalPrice = engine.calculateTotalPrice(order);

		Assert.assertEquals(195, totalPrice, 0);

	}

	@Test
	public void calculateSKUCartWithFixedWithMultipleSKU() {

		Order order = new Order();
		order.addItem(items.get("A"), 5);
		order.addItem(items.get("B"), 5);
		order.addItem(items.get("C"), 1);
		double totalPrice = engine.calculateTotalPrice(order);

		Assert.assertEquals(370, totalPrice, 0);

	}

	@Test
	public void calculateSKUCartWithCombination() {

		Order order = new Order();

		order.addItem(items.get("C"), 1);
		order.addItem(items.get("D"), 1);

		double totalPrice = engine.calculateTotalPrice(order);

		Assert.assertEquals(30, totalPrice, 0);

	}
}
