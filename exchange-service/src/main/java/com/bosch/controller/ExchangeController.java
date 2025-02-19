package com.bosch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.entity.ExchangeBean;
import com.bosch.service.ExchangeService;

@RestController
@RequestMapping("exchangeService")
public class ExchangeController {
	@Autowired
	private ExchangeService service;
	@Autowired
	private Environment env;
	
	@GetMapping("/from/{from}/to/{to}")
	public ExchangeBean getValue(@PathVariable String from , @PathVariable String to) {
		ExchangeBean eb=service.getExchangeValue(from, to);
		eb.setPort(Integer.parseInt(env.getProperty("server.port")));
		return eb;
	}
}
