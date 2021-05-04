package com.parkinglot;

import java.util.Scanner;

import com.parkinglot.constants.ParkingAppConstants;
import com.parkinglot.process.builder.ParkingLotServiceBuilder;
import com.parkinglot.service.impl.ParkingLotServiceImpl;
import com.parkinglot.util.BaseValidator;

public class Main {

	public static StringBuilder menu;
	public static void main(String[] args) {
		
		Boolean flag = true;
		String input = null;
		Scanner sc = null;
		ParkingLotServiceImpl impl =  new ParkingLotServiceImpl();
		
		try {
			
			System.out.println("\n\n\n------------------------------      MangoApps Parking Lot Demo     ----------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			Main.printMenu();
			
			while(flag)
			{
				sc =  new Scanner(System.in);
				input = sc.nextLine().trim();
				
				if(ParkingAppConstants.EXIT.equalsIgnoreCase(input))
				{
					System.out.println("Exited!!!");
					break;
				}
				
				Boolean isValidInput = BaseValidator.validateCommand(input);
				
				if(isValidInput)
				{
					ParkingLotServiceBuilder.getInstance()
					.withInput(input)
					.withParkingLotService(impl)
					.execute();
				}
				else 
				{
					System.out.println("Invalid Command: " + input+"\n\n\n");
					Main.printMenu();
				}
				flag = false;
			}
		}
		catch(Exception e)
		{
			
		}
	}

	
	private static void printMenu()
	{	
		buildMenu();
		System.out.println(menu.toString());
	}
	
	private static void buildMenu()
	{
		if(null == menu)
		{
			menu = new StringBuilder()
			.append("--------------Please Enter one of the below commands. {variable} to be replaced -----------------------\n")
			.append("A) Create a parking lot of size n                    ---> create_parking_lot {capacity}\n")
			.append("B) Park a car                                        ---> park <<car_number>> {car_clour}\n")
			.append("C) Remove(Unpark) car from parking                   ---> leave {slot_number}\n")
			.append("D) Print status of parking slot                      ---> status\n")
			.append("E) Get cars registration no. for the given car color ---> reg_num_by_color {car_color}\n")
			.append("F) Get slot numbers for the given car color          ---> slot_num_by_color {car_color}\n")
			.append("G) Get slot number for the given car number          ---> slot_num_by_reg_num {car_number}\n");
		}
	}
}
