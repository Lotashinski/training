package com.github.lotashinski.training.api.entity;


public class Period {

	private int days;
	
	
	public Period(int days) {
		this.days = days;
	}
	
	
	public int getAllDays() {
		return days;
	}
	
	public int getDays() {
		return days % 30;
	}
	
	public int getMonths() {
		return (days % 365) / 30;
	}
	
	public int getYears() {
		return days % 365;
	}
	
}
