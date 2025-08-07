package com.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class User {

	@Qualifier("bike")
	@Autowired
	private VehicleService bike;
	
	@Qualifier("car")
	@Autowired
	private VehicleService Car;
	
	public User() {
		
	}
	public User(VehicleService bike, VehicleService car) {
		super();
		this.bike = bike;
		Car = car;
	}

	public VehicleService getBike() {
		return bike;
	}
	public void setBike(VehicleService bike) {
		this.bike = bike;
	}
	public VehicleService getCar() {
		return Car;
	}
	public void setCar(VehicleService car) {
		Car = car;
	}
	@Override
	public String toString() {
		return "User [bike=" + bike + ", Car=" + Car + ", getBike()=" + getBike() + ", getCar()=" + getCar()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
