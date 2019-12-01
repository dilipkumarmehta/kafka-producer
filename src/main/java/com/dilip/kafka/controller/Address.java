package com.dilip.kafka.controller;

public class Address {
	private String state;
	private String pin;
	private String distic;
	private String landMark;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getDistic() {
		return distic;
	}

	public void setDistic(String distic) {
		this.distic = distic;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", pin=" + pin + ", distic=" + distic + ", landMark=" + landMark + "]";
	}

}
