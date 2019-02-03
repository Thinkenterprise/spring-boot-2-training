package com.thinkenterprise.client;

import java.io.IOException;

import org.springframework.web.reactive.function.client.WebClient;

import com.thinkenterprise.domain.tracking.Tracking;

public class ReactiveClientApplication {
	
	  public static void main(String[] args) throws IOException {

	    	WebClient client = WebClient.create("http://localhost:8080");
	    	
	    	client
	    	.get()
	    	.uri("/trackings")
	    	.exchange()
	    	.flatMapMany(response -> response.bodyToFlux(Tracking.class))
	    	.log()
	    	.subscribe(tacking -> System.out.println(tacking.getStatus()));
	    
	    	    	  		
	    	System.out.println("Client started");
	    	System.in.read();
	   }

}
