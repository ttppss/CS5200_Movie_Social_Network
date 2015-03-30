package edu.neu.cs5200.msn.ds.model;

public class Cast {
	private String characterName;
	private String movieId;
	private String actorId;
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getMovidId() {
		return movieId;
	}
	public void setMovidId(String movieId) {
		this.movieId = movieId;
	}
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public Cast(String characterName, String movieId, String actorId) {
		super();
		this.characterName = characterName;
		this.movieId = movieId;
		this.actorId = actorId;
	}
	public Cast() {
		super();
	}
}
