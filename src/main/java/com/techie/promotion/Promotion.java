/**
 * 
 */
package com.techie.promotion;

import com.techie.model.Order;

/**
 * @author Praveen
 *
 *
 */
public interface Promotion {

	/**
	 * @param order
	 * @return Total discount of the order
	 * 
	 */
	double calculateDiscount(Order order);

}
