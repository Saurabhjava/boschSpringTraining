package com.bosch.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorMapper {
	private String errorMessage;
	private String url;
	private LocalDateTime date;
	
	public ErrorMapper() {
		// TODO Auto-generated constructor stub
	}
	
	public ErrorMapper(String errorMessage, String url, LocalDateTime date) {
		super();
		this.errorMessage = errorMessage;
		this.url = url;
		this.date = date;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
	
}
