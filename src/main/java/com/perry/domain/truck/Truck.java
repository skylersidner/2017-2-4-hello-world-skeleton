package com.perry.domain.truck;

import com.perry.infrastructure.Persisted;

public class Truck extends Persisted {

	private long truckId;

	private String driverFirstName;

	private String driverLastName;

	private TruckStatusType truckStatusType;

	public long getTruckId() {
		return truckId;
	}

	public void setTruckId(long truckId) {
		this.truckId = truckId;
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

}
