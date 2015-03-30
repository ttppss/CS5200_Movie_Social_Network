package edu.neu.cs5200.msn.ds.model;

public class Movie {
	private int id;
	private String title;
	private String poster;
	private String movieId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public Movie(int id, String title, String poster, String movieId) {
		super();
		this.id = id;
		this.title = title;
		this.poster = poster;
		this.movieId = movieId;
	}
	public Movie() {
		super();
	}
}
