package com.thinkenterprise.endpoints;

public class Echo {
	
	private String message;
	private String owner;
	
	
	public Echo() {
		super();
		
	}
	public Echo(String message, String owner) {
		super();
		this.message = message;
		this.owner = owner;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
