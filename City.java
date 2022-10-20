package com.yash.springioc;

import java.util.List;

public class City {
private List<String> cityname;
private CinemaHall cinemaHall;


public List<String> getCityname() {
	return cityname;
}


public void setCityname(List<String> cityname) {
	this.cityname = cityname;
}


public CinemaHall getCinemaHall() {
	return cinemaHall;
}


public void setCinemaHall(CinemaHall cinemaHall) {
	this.cinemaHall = cinemaHall;
}


public City(List<String> cityname, CinemaHall cinemaHall) {
	super();
	this.cityname = cityname;
	this.cinemaHall = cinemaHall;
}



public City() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "City [cityname=" + cityname + ", cinemaHall=" + cinemaHall + "]";
}


public void show() {
	for(String s : cityname) {
		System.out.println("City Name: " + s + "\n");
		cinemaHall.display();
	}
}



}
