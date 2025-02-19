package com.bosch.model;

public class CalculationBean {
	private String from;
	private String to;
	private double exchangeValue;
	private int qty;
	private double totalAmt;
	private int port;
	public CalculationBean() {
		// TODO Auto-generated constructor stub
	}
	
	public CalculationBean(String from, String to, double exchangeValue, int port, double totalAmt, int qty) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
		this.port = port;
		this.totalAmt = totalAmt;
		this.qty=qty;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
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
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	
	
}
