package com.base;

import org.springframework.stereotype.Component;

@Component("bike")
public class BikeService implements VehicleService {

	public String serviceVehicle() {
		
		return "Bike Servicing in progress...";
	}

}
