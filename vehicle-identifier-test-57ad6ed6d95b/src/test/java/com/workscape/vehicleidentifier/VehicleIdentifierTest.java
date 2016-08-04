package com.workscape.vehicleidentifier;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.workscape.vehicleidentifier.bind.Vehicles;
import com.workscape.vehicleidentifier.constants.VehicleType;
import com.workscape.vehicleidentifier.report.VehicleIdentifierReport;
import com.workscape.vehicleidentifier.report.VehicleIdentifierReportImpl;
import com.workscape.vehicleidentifier.util.XMLRequestProcessor;

/**
 * Unit test for simple App.
 */
public class VehicleIdentifierTest {

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void testGetVehicleTypeCountReport() {
		final String filePath = "vehicles.xml";
		
		Vehicles vehicles =  XMLRequestProcessor.processXMLRequest(filePath);
		
		VehicleIdentifierReport vehicleIdentifierReport = new VehicleIdentifierReportImpl();
		
		Map<String,Integer> expectedResult = new HashMap<String, Integer>();
		expectedResult.put(VehicleType.HANGGLIDER.getName(), 0);
		expectedResult.put(VehicleType.MOTORCYCLE.getName(), 0);
		expectedResult.put(VehicleType.CAR.getName(), 0);
		expectedResult.put(VehicleType.BIGWHEEL.getName(), 1);
		expectedResult.put(VehicleType.BICYCLE.getName(), 1);
		Map<String,Integer> actualResult = vehicleIdentifierReport.getVehicleTypeCountReport(vehicles);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testGetVehicleTypeReport() {
		final String filePath = "vehicles.xml";
		
		Vehicles vehicles =  XMLRequestProcessor.processXMLRequest(filePath);
		
		VehicleIdentifierReport vehicleIdentifierReport = new VehicleIdentifierReportImpl();
		
		Map<String,String> expectedResult = new HashMap<String, String>();
		expectedResult.put("vehicle 1", VehicleType.BIGWHEEL.getName());
		expectedResult.put("vehicle 2", VehicleType.BICYCLE.getName());
		Map<String,String> actualResult = vehicleIdentifierReport.getVehicleTypeReport(vehicles);
		assertEquals(expectedResult, actualResult);
	}
}
