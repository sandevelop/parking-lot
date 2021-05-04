package com.parkinglot.constants;

import java.util.HashMap;
import java.util.Map;



public class CommandsParamMap
{


	private static final Map<String, Integer> cmdParamMap = new HashMap<String, Integer>();
	
	static
	{
		cmdParamMap.put(ParkingAppConstants.CREATE_PARKING_LOT, 1);
		cmdParamMap.put(ParkingAppConstants.PARK, 2);
		cmdParamMap.put(ParkingAppConstants.LEAVE, 1);
		cmdParamMap.put(ParkingAppConstants.REG_NUMBER_FOR_CARS_WITH_COLOR, 1);
		cmdParamMap.put(ParkingAppConstants.SLOTS_NUMBER_FOR_CARS_WITH_COLOR, 1);
		cmdParamMap.put(ParkingAppConstants.SLOTS_NUMBER_FOR_REG_NUMBER, 1);
	}
	
	
	public static Map<String, Integer> getCommandsParameterMap()
	{
		return cmdParamMap;
	}
	
	
	public static void addCommand(String command, int parameterCount)
	{
		cmdParamMap.put(command, parameterCount);
	}
	

}
