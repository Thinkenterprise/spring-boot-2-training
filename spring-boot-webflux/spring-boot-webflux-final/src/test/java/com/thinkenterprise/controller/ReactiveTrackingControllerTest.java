package com.thinkenterprise.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.thinkenterprise.domain.tracking.Tracking;
import com.thinkenterprise.repository.ReactiveTrackingRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ReactiveTrackingControllerTest {

	@Autowired
	private WebTestClient webTestClient;
	
	@Test
	public void trackings() {
		
		webTestClient.get().uri("/trackings").exchange().expectBodyList(Tracking.class).hasSize(1);
		
	}
	
	
}
