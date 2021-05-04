package com.parkinglot.process.builder;

import com.parkinglot.constants.ParkingAppConstants;
import com.parkinglot.exception.ErrorCode;
import com.parkinglot.exception.SystemException;
import com.parkinglot.service.ParkingLotService;
import com.parkinglot.service.impl.ParkingLotServiceImpl;

import io.gojek.parkinglot.constants.Constants;

public class ParkingLotServiceBuilder {

	String input;
	ParkingLotService parkingLotService;
	
	
	public String getInput() {
		return input;
	}
	
	public ParkingLotServiceBuilder withInput(String input) {
		this.input = input;
		return this;
	}
	
	public ParkingLotService getParkingLotService() {
		return parkingLotService;
	}
	
	public ParkingLotServiceBuilder withParkingLotService(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
		return this;
	}
		
	public static ParkingLotServiceBuilder getInstance()
	{
		return LazyLoader.INSTANCE;
	}
	
	private static final class LazyLoader
	{
		public static final ParkingLotServiceBuilder INSTANCE = new ParkingLotServiceBuilder();
	}
	
	public void execute() throws SystemException 
	{
		System.out.println("execute");
		String input = this.getInput();
		System.out.println("input:"+input);
		
		String[] inputs = input.split(" ");
		String cmd = inputs[0];
		
		switch(cmd)
		{
		case ParkingAppConstants.CREATE_PARKING_LOT:
			break;
			
		case ParkingAppConstants.PARK:
			break;
		case ParkingAppConstants.LEAVE:
			break;
		case ParkingAppConstants.REG_NUMBER_FOR_CARS_WITH_COLOR:
			break;
		case ParkingAppConstants.SLOTS_NUMBER_FOR_CARS_WITH_COLOR:
			break;
		case ParkingAppConstants.SLOTS_NUMBER_FOR_REG_NUMBER:
			break;
		default:
			throw new SystemException(ErrorCode.INVALID_REQUEST.getMessage());
		}
	}
	
}
 