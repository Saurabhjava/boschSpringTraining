package com.bosch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.ExchangeProxy;
import com.bosch.model.CalculationBean;

@RestController
@RequestMapping("calculationService")
public class CalculationController {
	@Autowired
	private ExchangeProxy proxy;
	@GetMapping("/from/{from}/to/{to}/qty/{qty}")
	public CalculationBean getExchangeValue(@PathVariable String from,@PathVariable String to, @PathVariable int qty) {
		CalculationBean cb=proxy.getExchangeData(from, to);
		cb.setQty(qty);
		cb.setTotalAmt(qty*cb.getExchangeValue());
		return cb;
	}
}
