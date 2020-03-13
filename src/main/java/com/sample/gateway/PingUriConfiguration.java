package com.sample.gateway;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class PingUriConfiguration {
	
	private String pingFederateBaseUri = "https://localhost:9031/";

	public String getPingFederateBaseUri() {
		return pingFederateBaseUri;
	}

	public void setPingFederateBaseUri(String pingFederateBaseUri) {
		this.pingFederateBaseUri = pingFederateBaseUri;
	}
	
	
			
}

