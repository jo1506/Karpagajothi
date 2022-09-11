package org.jaa;

public class Checking {

	private void employeeInfo(String name) {
		System.out.println("My name is: " + name);
		
	}
	private void employeeInfo(int phone) {
		System.out.println("My phone num is: " + phone);
	}
	private void employeeInfo(long percentage) {
		System.out.println("My percentage is: " + percentage);
	}
	public static void main (String args[]) {
		Checking a= new Checking();
		a.employeeInfo("jothi");
		a.employeeInfo("99887766");
		a.employeeInfo("8.99");
	}
	
	
}
	

