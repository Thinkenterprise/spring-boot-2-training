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

package com.thinkenterprise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkenterprise.domain.tracking.Tracking;
import com.thinkenterprise.repository.ReactiveTrackingRepository;

import reactor.core.publisher.Flux;


@RestController
@RequestMapping("trackings")
public class ReactiveTrackingController {

    @Autowired
	ReactiveTrackingRepository trackingRepository;
	
	@GetMapping
	public Flux<Tracking> trackings() {
		
		return trackingRepository.findAll();
	
	}
	
	@GetMapping("static")
	public Flux<Tracking> trackingsStatic() {
	
		return Flux.just(new Tracking(1L, "123"));
		
	}
	 
}
