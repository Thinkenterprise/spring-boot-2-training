package org.thinkenterprise.repository

import org.springframework.stereotype.Component
import org.thinkenterprise.domain.Route
import javax.annotation.PostConstruct

@Component
class InitalizeRouteRepository(private val repository: RouteRepository) {
	
	@PostConstruct
	fun init() {
		
		repository.save(Route(1,"MUC"));
		repository.save(Route(2,"BER"));
		repository.save(Route(3,"LA"));
		
	}
	
}