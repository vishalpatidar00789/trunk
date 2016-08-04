package com.workscape.vehicleidentifier.report;

import java.util.Map;

import com.workscape.vehicleidentifier.bind.Vehicles;

public class VehicleIdentifierReportGeneratorImpl implements VehicleIdentifierReportGenerator {
	
	VehicleIdentifierReport vehicleIdentifierReport = null;
	
	public VehicleIdentifierReportGeneratorImpl(){
		super();
	}
	
	public VehicleIdentifierReportGeneratorImpl(VehicleIdentifierReport vehicleIdentifierReport){
		super();
		this.vehicleIdentifierReport = vehicleIdentifierReport;
	}
	
	public void generateReport(Vehicles vehicles) {
		if(null!=vehicles && null!=vehicles.getVehicles() && !vehicles.getVehicles().isEmpty()){
			Map<String,String> vehicleTypeMap = vehicleIdentifierReport.getVehicleTypeReport(vehicles);
			Map<String,Integer> vehicleTypeCountMap = vehicleIdentifierReport.getVehicleTypeCountReport(vehicles);
			
			this.showVehicleTypeReport(vehicleTypeMap);
			this.showVehicleTypeCountReport(vehicleTypeCountMap);
		}else{
			// throw some valid validation
		}
		
	}
	
		
	private void showVehicleTypeReport(Map<String,String> vehicleTypeMap){
		System.out.println("-------------------- Vehicle Type Report -----------------------");
		System.out.println("--------------------------------------------");
		System.out.println("|  Vehicle Id  |       Vehicle Type        |");
		System.out.println("--------------------------------------------");
		
		if(null!=vehicleTypeMap){
			for(Map.Entry<String, String> entry : vehicleTypeMap.entrySet()){
				System.out.println("|  "+entry.getKey()+"   |        "+entry.getValue()+"         |");
				System.out.println("--------------------------------------------");
			}
		}else{
			System.out.println("       No Record Found        ");
		}
	}
	
	private void showVehicleTypeCountReport(Map<String,Integer> vehicleTypeCountMap){

		System.out.println("-------------------- Vehicle Type Count Report -----------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("|       Vehicle Type         |   Vehicle Type Count  |");
		System.out.println("------------------------------------------------------");
		
		if(null!=vehicleTypeCountMap){
			for(Map.Entry<String, Integer> entry : vehicleTypeCountMap.entrySet()){
				System.out.println("|       "+entry.getKey()+"                |        "+entry.getValue()+"            |");
				System.out.println("------------------------------------------------------------------");
			}
		}else{
			System.out.println("       No Record Found        ");
		}
	}
}
