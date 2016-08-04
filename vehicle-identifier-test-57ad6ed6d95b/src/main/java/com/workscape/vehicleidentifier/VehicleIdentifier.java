package com.workscape.vehicleidentifier;

import com.workscape.vehicleidentifier.bind.Vehicles;
import com.workscape.vehicleidentifier.report.VehicleIdentifierReport;
import com.workscape.vehicleidentifier.report.VehicleIdentifierReportGenerator;
import com.workscape.vehicleidentifier.report.VehicleIdentifierReportGeneratorImpl;
import com.workscape.vehicleidentifier.report.VehicleIdentifierReportImpl;
import com.workscape.vehicleidentifier.util.XMLRequestProcessor;

/**
 * Hello world!
 * 
 */
public class VehicleIdentifier {
	
	public static void main(String[] args) {
		
		final String filePath = "vehicles.xml";
		
		Vehicles vehicles =  XMLRequestProcessor.processXMLRequest(filePath);
		
		VehicleIdentifierReport vehicleIdentifierReport = new VehicleIdentifierReportImpl();
		
		VehicleIdentifierReportGenerator reportGenerator = new VehicleIdentifierReportGeneratorImpl(vehicleIdentifierReport);
		
		reportGenerator.generateReport(vehicles);
          
	}
	
	
	
	
	
}
