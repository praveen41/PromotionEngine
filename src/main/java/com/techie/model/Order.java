/**
 * 
 */
package com.techie.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Praveen 
 * This model class basically used for storing the the
 *         information about the SKU order
 *
 */
public class Order {
	private final Map<SKU, Integer> items;

	public Order() {
		super();
		items = new HashMap<>();
	}

	public void addItem(SKU sku, int quantity) {
		if (items.containsKey(sku)) {
			items.put(sku, items.get(sku) + quantity);
		} else {
			items.put(sku, quantity);
		}
	}

	public Map<SKU, Integer> getItems() {
		return items;
	}

}