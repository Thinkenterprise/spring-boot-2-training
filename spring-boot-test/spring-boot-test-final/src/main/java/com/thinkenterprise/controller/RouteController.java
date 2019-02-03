/*
 * Copyright (C) 2016 Thinkenterprise
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
 * @author Rafael Kansy
 * @author Michael Schaefer
 */

package com.thinkenterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;
import com.thinkenterprise.service.RouteService;


@RestController
@RequestMapping("routes")
public class RouteController {

    @Autowired
    private RouteService service;
    
    @Autowired
   	RouteRepository routeRepository;

    @RequestMapping("count")
    public long count() {
        return service.count();
    }

   
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Route>> getAll() {
		if(routeRepository.count()>0) return new ResponseEntity<Iterable<Route>>(routeRepository.findAll(),HttpStatus.OK);
		else return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
	}
	
}
