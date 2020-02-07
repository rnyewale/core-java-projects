package com.runtime.polymorephysm;

public class JioService implements ServiceProvider {

	@Override
	public void callingService() {
		System.out.println("calling using Jio Sim");
	}

	@Override
	public void datService() {
		System.out.println("browsing using Jio Sim");
	}
}
