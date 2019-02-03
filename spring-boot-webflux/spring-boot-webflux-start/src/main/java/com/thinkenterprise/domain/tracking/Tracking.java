/*
 * Copyright (C) 2018 Thinkenterprise
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * @author Michael Schaefer
 */

package com.thinkenterprise.domain.tracking;

import com.thinkenterprise.domain.core.AbstractDocument;

import java.time.LocalDateTime;

public class Tracking extends AbstractDocument {
  
	private Long routeId;
    private String flightNumber;
  
    private LocalDateTime currentTime;
    
    private FlightStatus status;
    
    
       
    public Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tracking(Long routeId, String flightNumber) {
		super();
		this.routeId = routeId;
		this.flightNumber = flightNumber;
	}

	public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
