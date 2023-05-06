package com.example.crud.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flights")
public class Flights {

	@Id
	private String _id;
	private int Year;
	private int Month;
	private int DayofMonth;
	private double DepTime;
	private int CRSDepTime;
	private double ArrTime;
	private int CRSArrTime;
	private String Origin;
	private String Dest;
	private double Distance;
	
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getDayofMonth() {
		return DayofMonth;
	}
	public void setDayOfMonth(int dayofMonth) {
		DayofMonth = dayofMonth;
	}
	public double getDepTime() {
		return DepTime;
	}
	public void setDeepTime(double depTime) {
		DepTime = depTime;
	}
	public int getCRSDepTime() {
		return CRSDepTime;
	}
	public void setCRSDepTime(int cRSDepTime) {
		CRSDepTime = cRSDepTime;
	}
	public double getArrTime() {
		return ArrTime;
	}
	public void setArrTime(double arrTime) {
		ArrTime = arrTime;
	}
	public int getCRSArrTime() {
		return CRSArrTime;
	}
	public void setCRSArrTime(int cRSArrTime) {
		CRSArrTime = cRSArrTime;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	public String getDest() {
		return Dest;
	}
	public void setDest(String dest) {
		Dest = dest;
	}
	public double getDistance() {
		return Distance;
	}
	public void setDistance(double distance) {
		Distance = distance;
	}
	public String get_id() {
		return _id;
	}
	
	public Flights() {
		
	}
	
}
