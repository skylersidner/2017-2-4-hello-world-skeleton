package com.perry.domain.truck;

import com.perry.infrastructure.Persisted;

public class Truck extends Persisted {

	// this is NOT the DB id
	private String identifier;

	private String driverFirstName;

	private String driverLastName;

	private TruckStatusType truckStatusType;

	private long numberOfCalls;

	private String gisLatitude;

	private String gisLongitude;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getDriverFirstName() {
		return driverFirstName;
	}

	public void setDriverFirstName(String firstName) {
		this.driverFirstName = firstName;
	}

	public String getDriverLastName() {
		return driverLastName;
	}

	public void setDriverLastName(String lastName) {
		this.driverLastName = lastName;
	}

	public TruckStatusType getTruckStatusType() {
		return truckStatusType;
	}

	public void setTruckStatusType(TruckStatusType truckStatusType) {
		this.truckStatusType = truckStatusType;
	}

	public long getNumberOfCalls() {
		return numberOfCalls;
	}

	public void setNumberOfCalls(long numberOfCalls) {
		this.numberOfCalls = numberOfCalls;
	}

	public String getGis_latitude() {
		return gisLatitude;
	}

	public String getGisLatitude() {
		return gisLatitude;
	}

	public void setGisLatitude(String gisLatitude) {
		this.gisLatitude = gisLatitude;
	}

	public String getGisLongitude() {
		return gisLongitude;
	}

	public void setGisLongitude(String gisLongitude) {
		this.gisLongitude = gisLongitude;
	}

}
