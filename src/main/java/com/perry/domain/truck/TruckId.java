package com.perry.domain.truck;

public class TruckId {

	private String identifier;
	private Long id;
	
	public TruckId(Long id, String identifier) {
		this.id = id;
		this.identifier = identifier;
	}
	
	public Long getId() {
		return id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
