package com.d.questions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SortListByProperty {
	public static void main(String[] args) {
		List<OrderDto> orders = new ArrayList<>(0);
		orders.add(new OrderDto(1, 2, new BigDecimal(100)));
		orders.add(new OrderDto(2, 4, new BigDecimal(300)));
		orders.add(new OrderDto(3, 4, new BigDecimal(500)));
		
		orders.stream().sorted((o1,o2)->(int)o2.getOrderNumber()-(int)o1.getOrderNumber()).
		forEach(System.out::println);
		

	}

}// https://theoneamin.medium.com/useful-java-streams-d48266effe59
