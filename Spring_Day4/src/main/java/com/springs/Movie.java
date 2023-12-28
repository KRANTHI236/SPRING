package com.springs;

public class Movie {

	private String movieName;
	private long movieBudget;
	private double movieRuntime;
	private String movieHero;
	private String movieHeroine;

	public Movie(String movieName, long movieBudget, double d, String movieHero, String movieHeroine) {
		super();
		this.movieName = movieName;
		this.movieBudget = movieBudget;
		this.movieRuntime = d;
		this.movieHero = movieHero;
		this.movieHeroine = movieHeroine;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieBudget=" + movieBudget + ", movieRuntime=" + movieRuntime
				+ ", movieHero=" + movieHero + ", movieHeroine=" + movieHeroine + "]";
	}

}
