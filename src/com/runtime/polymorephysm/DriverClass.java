package com.runtime.polymorephysm;

public class DriverClass {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setProvider(new JioService());
		mobile.activateService();
		
		/*
		 * System.out.println(); mobile.setProvider(new Vodafone());
		 * mobile.activateService();
		 */
	}

}
