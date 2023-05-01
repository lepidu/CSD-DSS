package com.example.flights.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
	
	@Id
	private String id;
	
	private int year;
	private int month;
	private int dayMonth;
	private int dayWeek;
	private int depTime;
	private int CRSdepTime;
	private int arrTime;
	private int CRSarrTime;
	private int elapsedTime;
	private int CRSelapsedTime;
	private int airTime;
	private int arrDelay;
	private int depDelay;
	private String origin;
	private String dest;
	private int distance;
	private int taxiIn;
	private int taxiOut;
	private int cancelled;
	private int diverted;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDayMonth() {
		return dayMonth;
	}
	public void setDayMonth(int dayMonth) {
		this.dayMonth = dayMonth;
	}
	public int getDayWeek() {
		return dayWeek;
	}
	public void setDayWeek(int dayWeek) {
		this.dayWeek = dayWeek;
	}
	public int getDepTime() {
		return depTime;
	}
	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}
	public int getCRSdepTime() {
		return CRSdepTime;
	}
	public void setCRSdepTime(int CRSdepTime) {
		this.CRSdepTime = CRSdepTime;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getCRSarrTime() {
		return CRSarrTime;
	}
	public void setCRSarrTime(int CRSarrTime) {
		this.CRSarrTime = CRSarrTime;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	public int getCRSelapsedTime() {
		return CRSelapsedTime;
	}
	public void setCRSelapsedTime(int CRSelapsedTime) {
		this.CRSelapsedTime = CRSelapsedTime;
	}
	public int getAirTime() {
		return airTime;
	}
	public void setAirTime(int airTime) {
		this.airTime = airTime;
	}
	public int getArrDelay() {
		return arrDelay;
	}
	public void setArrDelay(int arrDelay) {
		this.arrDelay = arrDelay;
	}
	public int getDepDelay() {
		return depDelay;
	}
	public void setDepDelay(int depDelay) {
		this.depDelay = depDelay;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getTaxiIn() {
		return taxiIn;
	}
	public void setTaxiIn(int taxiIn) {
		this.taxiIn = taxiIn;
	}
	public int getTaxiOut() {
		return taxiOut;
	}
	public void setTaxiOut(int taxiOut) {
		this.taxiOut = taxiOut;
	}
	public int getCancelled() {
		return cancelled;
	}
	public void setCancelled(int cancelled) {
		this.cancelled = cancelled;
	}
	public int getDiverted() {
		return diverted;
	}
	public void setDiverted(int diverted) {
		this.diverted = diverted;
	}
	
	public Flight(String id, int year, int month, int dayMonth, int dayWeek, int depTime, int CRSdepTime, int arrTime,
			int CRSarrTime, int elapsedTime, int CRSelapsedTime, int airTime, int arrDelay, int depDelay, String origin,
			String dest, int distance, int taxiIn, int taxiOut, int cancelled, int diverted) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.dayMonth = dayMonth;
		this.dayWeek = dayWeek;
		this.depTime = depTime;
		this.CRSdepTime = CRSdepTime;
		this.arrTime = arrTime;
		this.CRSarrTime = CRSarrTime;
		this.elapsedTime = elapsedTime;
		this.CRSelapsedTime = CRSelapsedTime;
		this.airTime = airTime;
		this.arrDelay = arrDelay;
		this.depDelay = depDelay;
		this.origin = origin;
		this.dest = dest;
		this.distance = distance;
		this.taxiIn = taxiIn;
		this.taxiOut = taxiOut;
		this.cancelled = cancelled;
		this.diverted = diverted;
	}
	
	
}