package com.perry.infrastructure.truck;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TruckCallNumberRowMapper implements RowMapper<TruckCallNumber> {

	@Override
	public TruckCallNumber mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long truckId = rs.getLong("truck_id");
		Long numberOfCalls = rs.getLong("number_of_calls");
		TruckCallNumber truckCallNumber = new TruckCallNumber(truckId, numberOfCalls);
		return truckCallNumber;
	}

}
