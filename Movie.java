package com.yash.springioc;

import java.util.List;

public class Movie {
private List<String> movieName;
private List<String> movieTiming;

public List<String> getMovieName() {
	return movieName;
}
public void setMovieName(List<String> movieName) {
	this.movieName = movieName;
}
public List<String> getMovieTiming() {
	return movieTiming;
}
public void setMovieTiming(List<String> movieTiming) {
	this.movieTiming = movieTiming;
}
public Movie(List<String> movieName, List<String> movieTiming) {
	super();
	this.movieName = movieName;
	this.movieTiming = movieTiming;
}
@Override
public String toString() {
	return "Movie [movieName=" + movieName + ", movieTiming=" + movieTiming + "]";
}
public Movie() {
	super();
	// TODO Auto-generated constructor stub
}

}
