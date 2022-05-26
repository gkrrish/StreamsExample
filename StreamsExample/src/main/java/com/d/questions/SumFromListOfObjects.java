package com.d.questions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SumFromListOfObjects {
	public static void main(String[] args) {
		List<OrderDto> orders=new ArrayList<>(0);
		orders.add(new OrderDto(1, 2, new BigDecimal(100)));
		orders.add(new OrderDto(2, 4, new BigDecimal(300)));
		
		//get the sum of all orders
		
		BigDecimal sum = orders.stream()
							   .map(o->o.getTotal())
//							   .peek(System.out::println)//debugging purpose we use peek
//							   .map(OrderDto::getTotal)
					           .reduce(BigDecimal.ZERO, BigDecimal::add);
		
		
		System.out.println(sum);

	}
}//https://theoneamin.medium.com/useful-java-streams-d48266effe59

class OrderDto {
	private long orderNumber;
	private long customerId;
	private BigDecimal total;

	public OrderDto(long orderNumber, long customerId, BigDecimal total) {
		this.orderNumber = orderNumber;
		this.customerId = customerId;
		this.total = total;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public long getCustomerId() {
		return customerId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "OrderDto [orderNumber=" + orderNumber + ", customerId=" + customerId + ", total=" + total + "]";
	}
}