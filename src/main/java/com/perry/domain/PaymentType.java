package com.perry.domain;

import com.perry.exceptions.EnumerationException;

public enum PaymentType {
	CHARGE(1, "Charge"), CASH(2, "Cash"), MOTOR_CLUB(3, "Motor Club");

	private long id;

	private String value;

	private PaymentType(long id, String value) {
		this.id = id;
		this.value = value;
	}

	public static PaymentType fromId(long id) {
		for (PaymentType paymentType : PaymentType.values()) {
			if (paymentType.getId() == id) {
				return paymentType;
			}
		}
		throw new EnumerationException(id, PaymentType.class.getName());
	}

	public long getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
}
