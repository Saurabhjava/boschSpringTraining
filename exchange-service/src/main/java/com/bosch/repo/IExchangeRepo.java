package com.bosch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.entity.ExchangeBean;

public interface IExchangeRepo  extends JpaRepository<ExchangeBean,Integer>{
	public ExchangeBean findByFromAndTo(String from, String to);
}
