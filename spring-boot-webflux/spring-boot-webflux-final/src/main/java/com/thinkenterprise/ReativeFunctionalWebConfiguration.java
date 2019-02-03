package com.thinkenterprise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.thinkenterprise.domain.tracking.Tracking;
import com.thinkenterprise.repository.ReactiveTrackingRepository;

@Configuration
public class ReativeFunctionalWebConfiguration {
	
	@Bean
	public RouterFunction<ServerResponse> trackingsFunctional(ReactiveTrackingRepository reactiveTrackingRepository) {
	
		return RouterFunctions.route(RequestPredicates.GET("/trackings/functional"), request -> ServerResponse.ok().body(reactiveTrackingRepository.findAll(), Tracking.class));
				
	}


}
