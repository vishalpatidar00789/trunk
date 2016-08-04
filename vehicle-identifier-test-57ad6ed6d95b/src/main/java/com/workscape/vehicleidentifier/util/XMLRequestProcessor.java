package com.workscape.vehicleidentifier.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.workscape.vehicleidentifier.bind.Vehicles;

public class XMLRequestProcessor {
	
	public static Vehicles processXMLRequest(final String filePath){
		ClassLoader classLoader = XMLRequestProcessor.class.getClassLoader();
		File file = new File(classLoader.getResource(filePath).getFile());
		JAXBContext jaxbContext = null;
        Unmarshaller jaxbUnmarshaller = null;
        Vehicles vehicles = null;
		try {
			jaxbContext = JAXBContext.newInstance(Vehicles.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			vehicles = (Vehicles) jaxbUnmarshaller.unmarshal(file);
			
		} catch (JAXBException e) {
			e.printStackTrace();
			// throw some message
		}
		return vehicles;
	}
}
