package com.thinkenterprise.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.junit.jupiter.EnabledIf;

import com.thinkenterprise.controller.RouteController;
import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TestRouteController {
	
	
	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
 
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }
	
	@Test
	@DisplayName("Checking if context is loaded with beans")
	public void contextLoad() {
	}
	
	@Test
	@DisplayName("Checking if repository is loaded with data by Autowire")
	@DirtiesContext(methodMode=MethodMode.BEFORE_METHOD)
	public void checkRouteRepositoryWithAutowire(@Autowired TestRestTemplate restTemplate) {
		Iterable<Route> iterable = restTemplate.getForObject("/routes", Iterable.class);
		Assertions.assertTrue(iterable.iterator().hasNext());
	} 
	
	@Test
	@DisplayName("Checking if repository is loaded with data by @Qualifier")
	@DirtiesContext(methodMode=MethodMode.BEFORE_METHOD)
	public void checkRouteRepositoryWithQualifier(@Qualifier("routeRepository") RouteRepository routeRepository) {
		Assertions.assertTrue(routeRepository.count()>0);
	} 
	
	@Test
	@DisplayName("Checking property route count == 4")
	@DirtiesContext(methodMode=MethodMode.BEFORE_METHOD)
	public void checkRouteRepositoryWithQualifier(@Value("${route.count}") float count) {
		Assertions.assertTrue(count == 4);
	} 
	
	
	@Test
	@Tag("doNothing")
	public void checkExcludeTest() {
		System.out.println("doNoting");
		Assertions.assertTrue(true);
	} 
		
	@Test
	@EnabledIf(expression="false")
	public void checkConditionalTest() {
		Assertions.assertTrue(false);
	} 
	
	@Test
	@EnabledOnOs(OS.MAC)
	public void checkMacOs() {
		Assertions.assertTrue(false);
	} 
	
	
}
