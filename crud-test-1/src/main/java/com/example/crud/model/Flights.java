package com.example.crud.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="flights")
public class Flights {
	
	@Id
	private String _id;
	private int year;
	private int month;
	private int dayOfMonth;
	private int datOfWeek;
	private double deepTime;
	private int crsDepTime;
	private double arrTime;
	private int crsArrTime;
	private double actualElapsedTime;
	private double crsElapsedTime;
	private double airTime;
	private double arrDelay;
	private double depDelay;
	private String origin;
	private String dest;
	private double distance;
	private double taxiIn;
	private double taxiOut;
	private double cancelled;
	private double diverted;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
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
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	public int getDatOfWeek() {
		return datOfWeek;
	}
	public void setDatOfWeek(int datOfWeek) {
		this.datOfWeek = datOfWeek;
	}
	public double getDeepTime() {
		return deepTime;
	}
	public void setDeepTime(double deepTime) {
		this.deepTime = deepTime;
	}
	public int getCrsDepTime() {
		return crsDepTime;
	}
	public void setCrsDepTime(int crsDepTime) {
		this.crsDepTime = crsDepTime;
	}
	public double getArrTime() {
		return arrTime;
	}
	public void setArrTime(double arrTime) {
		this.arrTime = arrTime;
	}
	public int getCrsArrTime() {
		return crsArrTime;
	}
	public void setCrsArrTime(int crsArrTime) {
		this.crsArrTime = crsArrTime;
	}
	public double getActualElapsedTime() {
		return actualElapsedTime;
	}
	public void setActualElapsedTime(double actualElapsedTime) {
		this.actualElapsedTime = actualElapsedTime;
	}
	public double getCrsElapsedTime() {
		return crsElapsedTime;
	}
	public void setCrsElapsedTime(double crsElapsedTime) {
		this.crsElapsedTime = crsElapsedTime;
	}
	public double getAirTime() {
		return airTime;
	}
	public void setAirTime(double airTime) {
		this.airTime = airTime;
	}
	public double getArrDelay() {
		return arrDelay;
	}
	public void setArrDelay(double arrDelay) {
		this.arrDelay = arrDelay;
	}
	public double getDepDelay() {
		return depDelay;
	}
	public void setDepDelay(double depDelay) {
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
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getTaxiIn() {
		return taxiIn;
	}
	public void setTaxiIn(double taxiIn) {
		this.taxiIn = taxiIn;
	}
	public double getTaxiOut() {
		return taxiOut;
	}
	public void setTaxiOut(double taxiOut) {
		this.taxiOut = taxiOut;
	}
	public double getCancelled() {
		return cancelled;
	}
	public void setCancelled(double cancelled) {
		this.cancelled = cancelled;
	}
	public double getDiverted() {
		return diverted;
	}
	public void setDiverted(double diverted) {
		this.diverted = diverted;
	}
	@Override
	public String toString() {
		return "Flights [_id=" + _id + ", year=" + year + ", month=" + month + ", dayOfMonth=" + dayOfMonth
				+ ", datOfWeek=" + datOfWeek + ", deepTime=" + deepTime + ", crsDepTime=" + crsDepTime + ", arrTime="
				+ arrTime + ", crsArrTime=" + crsArrTime + ", actualElapsedTime=" + actualElapsedTime
				+ ", crsElapsedTime=" + crsElapsedTime + ", airTime=" + airTime + ", arrDelay=" + arrDelay
				+ ", depDelay=" + depDelay + ", origin=" + origin + ", dest=" + dest + ", distance=" + distance
				+ ", taxiIn=" + taxiIn + ", taxiOut=" + taxiOut + ", cancelled=" + cancelled + ", diverted=" + diverted
				+ ", get_id()=" + get_id() + ", getYear()=" + getYear() + ", getMonth()=" + getMonth()
				+ ", getDayOfMonth()=" + getDayOfMonth() + ", getDatOfWeek()=" + getDatOfWeek() + ", getDeepTime()="
				+ getDeepTime() + ", getCrsDepTime()=" + getCrsDepTime() + ", getArrTime()=" + getArrTime()
				+ ", getCrsArrTime()=" + getCrsArrTime() + ", getActualElapsedTime()=" + getActualElapsedTime()
				+ ", getCrsElapsedTime()=" + getCrsElapsedTime() + ", getAirTime()=" + getAirTime() + ", getArrDelay()="
				+ getArrDelay() + ", getDepDelay()=" + getDepDelay() + ", getOrigin()=" + getOrigin() + ", getDest()="
				+ getDest() + ", getDistance()=" + getDistance() + ", getTaxiIn()=" + getTaxiIn() + ", getTaxiOut()="
				+ getTaxiOut() + ", getCancelled()=" + getCancelled() + ", getDiverted()=" + getDiverted()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
		
	
	

}
