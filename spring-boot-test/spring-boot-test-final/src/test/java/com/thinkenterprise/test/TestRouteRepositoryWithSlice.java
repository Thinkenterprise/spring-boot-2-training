package com.thinkenterprise.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import com.thinkenterprise.repository.RouteRepository;

@DataJpaTest
@ComponentScan("com.thinkenterprise")
public class TestRouteRepositoryWithSlice {
	
	@Test
	public void checkRouteRepositoryWithAutowire(@Autowired RouteRepository routeRepository) {
		Assertions.assertTrue(routeRepository.count()>0);
	} 
	
}
