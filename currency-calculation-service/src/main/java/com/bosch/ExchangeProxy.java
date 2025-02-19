package com.bosch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bosch.model.CalculationBean;

@FeignClient(name="exchange-service", url = "http://localhost:8081")
public interface ExchangeProxy {
	
		@GetMapping("exchangeService/from/{from}/to/{to}")
		public CalculationBean getExchangeData(@PathVariable String from, @PathVariable String to);
}
