package com.thinkenterprise.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.thinkenterprise.controller.RouteController;
import com.thinkenterprise.service.RouteService;

@SpringBootTest
public class TestRouteControllerWithMock {

	
	@MockBean
	private static RouteService routeService;

	@BeforeAll
	public static void setup() {
		Mockito.when(routeService.count()).thenReturn(10L);
	}
	
	
	@Test
	public void checkRouteRepositoryWithAutowire(@Autowired RouteController routeController) {
		Long result = routeController.count();
		Assertions.assertTrue(result==10);
	} 
	
}
