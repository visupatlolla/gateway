package com.sample.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(PingUriConfiguration.class)
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder, PingUriConfiguration pingUriConfiguration) {
		String pingUri = pingUriConfiguration.getPingFederateBaseUri();
		return builder.routes()
			.route(p -> p
				.path("/**")
				.uri(pingUri))
			.build();
	}

}

