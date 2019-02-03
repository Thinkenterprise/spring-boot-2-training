package com.thinkenterprise.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.thinkenterprise.domain.tracking.Tracking;
import com.thinkenterprise.repository.ReactiveTrackingRepository;

import reactor.core.publisher.Mono;

@Component
public class TrackingHandler {

	@Autowired
	private ReactiveTrackingRepository reactiveTrackingRepository;
	
	public Mono<ServerResponse> trackings(ServerRequest serverRequest) {
		
		return ServerResponse.ok().body(reactiveTrackingRepository.findAll(), Tracking.class);
		
	}
	
}
