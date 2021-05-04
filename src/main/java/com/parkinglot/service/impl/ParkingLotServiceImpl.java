package com.parkinglot.service.impl;

import java.util.List;

import com.parkinglot.dao.Vehicle;
import com.parkinglot.service.ParkingLotService;

public class ParkingLotServiceImpl extends ParkingLotService{

	@Override
	public int parkCar(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean leaveCar(int slotNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getRegNumberForColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getSlotNumbersFromColor(String colour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSlotNoFromRegistrationNo(String registrationNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAvailableSlotsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
