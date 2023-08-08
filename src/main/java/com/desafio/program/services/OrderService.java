package com.desafio.program.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.program.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		double tax = order.getBasic() * order.getDiscount() / 100;
		
		return  order.getBasic() - tax + shippingService.shipment(order);

	}
	
}
