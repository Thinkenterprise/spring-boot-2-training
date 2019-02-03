package com.thinkenterprise.repository;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkenterprise.domain.tracking.FlightStatus;
import com.thinkenterprise.domain.tracking.Tracking;

@Component
public class InitializeTrackingRepository {
	
	@Autowired
	private ReactiveTrackingRepository trackingRepository;
	
	
	@PostConstruct
	public void init() {
		
		Tracking tracking = new Tracking();
        tracking.setRouteId(00L);
        tracking.setFlightNumber("LH7902");
        tracking.setCurrentTime(LocalDateTime.now());
        tracking.setStatus(FlightStatus.BOARDING);
		
		trackingRepository.save(tracking).then().subscribe();
        
		
		tracking = new Tracking();
        tracking.setRouteId(00L);
        tracking.setFlightNumber("LH7902");
        tracking.setCurrentTime(LocalDateTime.now());
        tracking.setStatus(FlightStatus.AIRBORNE);
		
		trackingRepository.save(tracking).then().subscribe();
		
		
		tracking = new Tracking();
        tracking.setRouteId(00L);
        tracking.setFlightNumber("LH7902");
        tracking.setCurrentTime(LocalDateTime.now());
        tracking.setStatus(FlightStatus.LANDED);
		
		trackingRepository.save(tracking).then().subscribe();
		
				
		
	} 
	
	
	
	
	
	
	

}
