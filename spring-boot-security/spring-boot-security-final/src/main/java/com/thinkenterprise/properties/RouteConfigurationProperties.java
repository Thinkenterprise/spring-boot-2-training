package com.thinkenterprise.properties;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="route")
public class RouteConfigurationProperties {

	private String helloWorld;
	private Set<String> messages = new HashSet<String>(); 
	private Duration duration;

	public String getHelloWorld() {
		return helloWorld;
	}

	public Set<String> getMessages() {
		return messages;
	}

	public void setMessages(Set<String> messages) {
		this.messages = messages;
	} 

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}
		
}
