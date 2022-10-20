package com.yash.springioc;

import java.util.List;
import java.util.ListIterator;

public class CinemaHall {
private List<String> cinemaHallName;
private Movie movie;

public List<String> getCinemaHallName() {
	return cinemaHallName;
}
public void setCinemaHallName(List<String> cinemaHallName) {
	this.cinemaHallName = cinemaHallName;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
public CinemaHall(List<String> cinemaHallName, Movie movie) {
	super();
	this.cinemaHallName = cinemaHallName;
	this.movie = movie;
}
@Override
public String toString() {
	return "CinemaHall [cinemaHallName=" + cinemaHallName + ", movie=" + movie + "]";
}
public CinemaHall() {
	super();
	// TODO Auto-generated constructor stub
}
public void display(){
	for (String c : cinemaHallName) {
		System.out.println("cinemaHall Name: " + c + " ");
		ListIterator<String> list =movie.getMovieName().listIterator();
		ListIterator<String> list1=movie.getMovieTiming().listIterator();
		
		while (list.hasNext() && list1.hasNext()) {
			String mv=list.next();
			String t=list1.next();
			System.out.println("MovieName: " +mv+ ", Time: " + t);
		}
		System.out.println();
	}
}
}