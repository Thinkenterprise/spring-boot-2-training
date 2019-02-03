package org.thinkenterprise.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.thinkenterprise.repository.RouteRepository


@RestController
class RouteController (private val repository: RouteRepository){
	
	@GetMapping("routes")
	fun findAll() = repository.findAll();
	
}