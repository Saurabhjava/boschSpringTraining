package com.bosch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExchangeBean {
	@Id
	private int cid;
	@Column(name="currencyFrom")
	private String from;
	@Column(name="currencyTo")
	private String to;
	private double exchangeValue;
	private int port;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getExchangeValue() {
		return exchangeValue;
	}
	public void setExchangeValue(double exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
