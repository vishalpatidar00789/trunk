package com.workscape.vehicleidentifier.report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.workscape.vehicleidentifier.bind.Vehicle;
import com.workscape.vehicleidentifier.bind.Vehicles;
import com.workscape.vehicleidentifier.constants.VehicleType;

public class VehicleIdentifierReportImpl implements VehicleIdentifierReport{

	

	public Map<String,String> getVehicleTypeReport(Vehicles vehicles) {
		Map<String,String> vehicleTypeMap = null;
		if(null!=vehicles && null!= vehicles.getVehicles() && vehicles.getVehicles().size()>0){
			vehicleTypeMap = new HashMap<String, String>();
			for(Vehicle vehicle :vehicles.getVehicles()){
				vehicle.identifyAndSetVehicleType();
				vehicleTypeMap.put(vehicle.getId(), vehicle.getVehicleType().getName());
			}
		}	
		return vehicleTypeMap;
	}

	public Map<String, Integer> getVehicleTypeCountReport(Vehicles vehicles) {
		Map<String,Integer> vehicleTypeCountMap = null;
		List<VehicleType> vehicleTypeObjs = new ArrayList<VehicleType>();
		if(null!=vehicles && null!= vehicles.getVehicles() && vehicles.getVehicles().size()>0){
			vehicleTypeCountMap = new HashMap<String, Integer>();
			for(Vehicle vehicle :vehicles.getVehicles()){
				vehicle.identifyAndSetVehicleType();
				vehicleTypeObjs.add(vehicle.getVehicleType());
			}
			for(VehicleType vehicleType: VehicleType.values()){
				vehicleTypeCountMap.put(vehicleType.getName(), Collections.frequency(vehicleTypeObjs, vehicleType));
			}
		}
		return vehicleTypeCountMap;
	}

}
