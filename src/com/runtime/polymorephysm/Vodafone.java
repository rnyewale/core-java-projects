package com.runtime.polymorephysm;

public class Vodafone implements ServiceProvider {

	@Override
	public void callingService() {
		System.out.println("calling using Vodaphone Sim");

	}

	@Override
	public void datService() {
		System.out.println("browsing using Vodafone Sim");

	}

}
