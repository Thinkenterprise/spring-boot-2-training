package com.thinkenterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.thinkenterprise.domain.tracking.Tracking;
import com.thinkenterprise.handler.TrackingHandler;
import com.thinkenterprise.repository.ReactiveTrackingRepository;

@Configuration
public class ReativeFunctionalMethodWebConfiguration {
	
	@Autowired
	private TrackingHandler trackingHandler;
	
	@Bean
	public RouterFunction<ServerResponse> trackingsFunctionMethod(ReactiveTrackingRepository reactiveTrackingRepository) {
	
		return RouterFunctions.route(RequestPredicates.GET("/trackings/functional/method"), trackingHandler::trackings);
				
	}


}
