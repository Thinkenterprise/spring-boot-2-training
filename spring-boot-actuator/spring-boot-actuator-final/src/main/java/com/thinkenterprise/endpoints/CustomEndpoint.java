package com.thinkenterprise.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Endpoint(id="legacy")
@Component
public class CustomEndpoint {
	
	
	@ReadOperation
	public Echo echoWithQueryParameter(String message) {
		return new Echo(message, "thinkenterprise");
	}
	
	
	@ReadOperation
	public Echo echoWithPathParameter(@Selector String message) {
		return new Echo(message, "thinkenterprise");

	}
	

}
