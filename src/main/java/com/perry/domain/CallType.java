package com.perry.domain;

import com.perry.exceptions.EnumerationException;

public enum CallType {
	TOW(1, "Tow"), TIRE_CHANGE(2, "Tire Change"), UNLOCK(3, "Unlock"), JUMP_START(4, "Jump Start"), WINCH(5, "Winch"), IMPOUND(6, "Impound");

	private long id;

	private String value;

	CallType(long id, String value) {
		this.id = id;
		this.value = value;
	}

	public static CallType fromId(long id) {
		for (CallType callType : CallType.values()) {
			if (callType.getId() == id) {
				return callType;
			}
		}
		throw new EnumerationException(id, CallType.class.getName());
	}

	public long getId() {
		return this.id;
	}

	public String getValue() {
		return this.value;
	}

}
