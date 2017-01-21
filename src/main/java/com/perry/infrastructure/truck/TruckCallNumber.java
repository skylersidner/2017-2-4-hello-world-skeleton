package com.perry.infrastructure.truck;

public class TruckCallNumber {

	private long truckId;

	private long numberOfCalls;

	public TruckCallNumber(long truckId, long numberOfCalls) {
		this.truckId = truckId;
		this.numberOfCalls = numberOfCalls;
	}

	public long getTruckId() {
		return truckId;
	}

	public void setTruckId(long truckId) {
		this.truckId = truckId;
	}

	public long getNumberOfCalls() {
		return numberOfCalls;
	}

	public void setNumberOfCalls(long numberOfCalls) {
		this.numberOfCalls = numberOfCalls;
	}

}
