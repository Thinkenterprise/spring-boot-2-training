package com.thinkenterprise.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Endpoint(id = "health")
@Component
public class HealthEndpoint {
	
	@ReadOperation
    public Health health() { return Health.up().withDetail("thinenterprise", 1).build(); }

}
