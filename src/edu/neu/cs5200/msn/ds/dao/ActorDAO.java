package edu.neu.cs5200.msn.ds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import edu.neu.cs5200.msn.ds.model.Actor;

public class ActorDAO {
	
	
	DataSource ds;
	
	public ActorDAO()
	{
		//store the data source inside the 'ds';
		//now we can use ds to get connection to the database;
		try{
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MovieSocialNetworkDB");
			System.out.println(ds);
		} catch(NamingException e){
			e.printStackTrace();
		}
	}
	//create a user;
	public Actor create(Actor actor)
	{
		String sql = "insert into actor values (?,?,?)";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, actor.getActorId());
			statement.setString(2, actor.getFirstName());
			statement.setString(3, actor.getLastName());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//read all users
	public List<Actor> readAllActors()
	{
		List<Actor> actors = new ArrayList<Actor>();
		String sql = "select * from actor";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet results = statement.executeQuery();
			while(results.next())
			{
				Actor actor = new Actor();
				actor.setActorId(results.getString("actorid"));
				actor.setFirstName(results.getString("firstname"));
				actor.setLastName(results.getString("lastname"));
				actors.add(actor);
			}
			return actors;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actors;
	}
	//retrieve a user by username
	public Actor readActor(String actorId)
	{
		Actor actor = new Actor();
		String sql = "select * from actor where actorId = ?";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, actorId);
			ResultSet result = statement.executeQuery();
			if(result.next())
			{
				actor.setActorId(result.getString("actorid"));
				actor.setFirstName(result.getString("firstname"));
				actor.setLastName(result.getString("lastname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actor;
	}
	
	//update a movie by id
	public Actor updateActor(String actorId, Actor actor)
	{
		String sql = "update actor set actorId = ? where actorId=?";
		Connection connection;
		try {
			connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, actor.getActorId());
			statement.setString(2, actorId);
//			statement.setString(3, user.getFirstName());
//			statement.setString(4, user.getLastName());
//			statement.setString(5, user.getEmail());
//			statement.setString(6, user.getUserName());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return actor;
		
	}
	
	//delete a user by username
	public int deleteActor(String actorId)
	{
		String sql = "delete from actor where actorId = ?";
		
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, actorId);
			return statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
