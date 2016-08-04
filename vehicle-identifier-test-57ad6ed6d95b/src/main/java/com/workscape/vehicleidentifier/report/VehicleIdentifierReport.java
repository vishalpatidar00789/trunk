package com.workscape.vehicleidentifier.report;

import java.util.Map;

import com.workscape.vehicleidentifier.bind.Vehicles;

public interface VehicleIdentifierReport {
	Map<String,String> getVehicleTypeReport(Vehicles vehicles);
	Map<String,Integer> getVehicleTypeCountReport(Vehicles vehicles);
}
