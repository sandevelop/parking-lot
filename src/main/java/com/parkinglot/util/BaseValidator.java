package com.parkinglot.util;

import com.parkinglot.constants.CommandsParamMap;
import com.parkinglot.exception.SystemException;

public class BaseValidator {

	public static boolean validateCommand(String inputString)
	{
		// Splitting the input string to validate command and input value/s
		boolean valid = true;
		try
		{
			String[] inputs = inputString.split(" ");
			int paramsCount = CommandsParamMap.getCommandsParameterMap().get(inputs[0]);
			switch (inputs.length)
			{
				case 1:
					if (paramsCount != 0) // status cmd
						valid = false;
					break;
				case 2:
					if (paramsCount != 1) // create_parking_lot cmd
						valid = false;
					break;
				case 3:
					if (paramsCount != 2) // park cmd
						valid = false;
					break;
				default:
					valid = false;
			}
		}
		catch (Exception e)
		{
			valid = false;
		}
		return valid;
	}
	
	public boolean validateNullCheck(Object obj, String exceptionMsg) throws SystemException 
	{
		boolean flag = true;
		if(null == obj)
		{
			flag = false;
			throw new SystemException(exceptionMsg);
		}
		
		return flag;
	}
}
