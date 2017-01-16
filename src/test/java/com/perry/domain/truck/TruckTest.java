package com.perry.domain.truck;

import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TruckTest {

	@Test
	public void truckJson() throws JsonProcessingException {
		Truck truck = new Truck();
		truck.setDriverFirstName("Joe");
		truck.setDriverLastName("Danks");
		truck.setTruckStatusType(TruckStatusType.EN_ROUTE);
		truck.setUpdateBy(1L);
		truck.setInsertBy(1L);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(truck));
	}
}
