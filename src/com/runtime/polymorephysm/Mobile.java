package com.runtime.polymorephysm;

public class Mobile {

	private ServiceProvider serviceProvider;

	public void setProvider(ServiceProvider provider) {
		this.serviceProvider = provider;
	}
	
	public void activateService() {
		serviceProvider.callingService();
		serviceProvider.datService();
	}
}
