package com.perry.domain.call;

import com.perry.domain.CallType;
import com.perry.domain.Customer;
import com.perry.infrastructure.Persisted;

public class Call extends Persisted {

	private Customer customer;

	private String pickUpLocation;

	private String dropOffLocation;

	private CallType callType;

	private String truckId;

	public Call() {
		// Default Constructor
	}

	public Call(Customer customer, String pickUpLocation, String dropOffLocation, CallType callType, String truckId) {
		super();
		this.customer = customer;
		this.pickUpLocation = pickUpLocation;
		this.dropOffLocation = dropOffLocation;
		this.callType = callType;
		this.truckId = truckId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public CallType getCallType() {
		return callType;
	}

	public void setCallType(CallType callType) {
		this.callType = callType;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	public String getTruckId() {
		return truckId;
	}
}
