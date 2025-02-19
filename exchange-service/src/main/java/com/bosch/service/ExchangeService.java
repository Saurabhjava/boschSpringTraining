package com.bosch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.entity.ExchangeBean;
import com.bosch.repo.IExchangeRepo;

@Service
public class ExchangeService {
	@Autowired
	private IExchangeRepo repo;
	public ExchangeBean getExchangeValue(String from , String to) {
		return repo.findByFromAndTo(from, to);
	}
}
