package org.thinkenterprise

import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.*

@ComponentScan
@EnableAutoConfiguration
class KotlinSpringApplication

fun main(args: Array<String>) {
	
	runApplication<KotlinSpringApplication>(*args)
		
}