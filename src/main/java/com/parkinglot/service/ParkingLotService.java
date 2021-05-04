package com.parkinglot.service;

import java.util.List;

import com.parkinglot.dao.Vehicle;

public abstract class ParkingLotService<T extends Vehicle> {

	public abstract int parkCar(T vehicle);
	
	public abstract boolean leaveCar(int slotNumber);
	
	public abstract List<String> getRegNumberForColor(String color);
	
	public abstract List<Integer> getSlotNumbersFromColor(String colour);
	
	public abstract int getSlotNoFromRegistrationNo(String registrationNo);
	
	public abstract int getAvailableSlotsCount();
	
}
