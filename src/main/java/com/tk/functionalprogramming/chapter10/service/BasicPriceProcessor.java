package com.tk.functionalprogramming.chapter10.service;

import com.tk.functionalprogramming.chapter10.model.Price;

public class BasicPriceProcessor implements PriceProcessor {

	@Override
	public Price process(Price price) {
		return price;
	}

}
