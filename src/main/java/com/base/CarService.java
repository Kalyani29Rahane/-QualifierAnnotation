package com.base;

import org.springframework.stereotype.Component;

@Component("car")
public class CarService  implements VehicleService{

	public String serviceVehicle() {
	
		return "Car Servicing in progress...";
	}

	
}
