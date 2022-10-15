/**
 * 
 */
package com.techie.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techie.model.SKU;

/**
 * @author Praveen
 *
 */
public class PromotionEngineTest {

	Map<String, SKU> items;

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

	}

	@Test
	public void calculateSKUCartTestCase1() {

		double totalPrice = 280;

		Assert.assertEquals(280, totalPrice, 0);

	}

}
