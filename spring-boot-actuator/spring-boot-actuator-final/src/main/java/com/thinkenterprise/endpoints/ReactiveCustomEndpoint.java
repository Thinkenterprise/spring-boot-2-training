package com.thinkenterprise.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Endpoint(id="reactiveLegacy")
@Component
public class ReactiveCustomEndpoint {
	
	
	@ReadOperation
	public Mono<Echo> echoWithQueryParameter(String message) {
		return    Mono.just(new Echo(message, "thinkenterprise"));
	}
	
	
	@ReadOperation
	public Mono<Echo> echoWithPathParameter(@Selector String message) {
		return Mono.just(new Echo(message, "thinkenterprise"));

	}
	

}
