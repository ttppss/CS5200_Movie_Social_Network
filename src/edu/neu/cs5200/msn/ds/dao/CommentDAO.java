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

import edu.neu.cs5200.msn.ds.model.Comment;

public class CommentDAO {
	
	
	DataSource ds;
	
	public CommentDAO()
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
	//create a comment;
	public Comment create(Comment newComment)
	{
		String sql = "insert into comment values (?,?,?)";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, newComment.getComment());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//read all comments
	public List<Comment> readAllComments()
	{
		List<Comment> comments = new ArrayList<Comment>();
		String sql = "select * from comment";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet results = statement.executeQuery();
			while(results.next())
			{
				Comment comment = new Comment();
				comment.setComment(results.getString("comment"));
				comments.add(comment);
			}
			return comments;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comments;
	}
	//retrieve comments for username
	public Comment readAllCommentForUsername(String username)
	{
		Comment comment = new Comment();
		String sql = "select * from comment where username = ?";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			ResultSet result = statement.executeQuery();
			if(result.next())
			{
				comment.setComment(result.getString("comment"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comment;
	}
	
	//retrieve comments for movie
	public Comment readAllCommentForMovie(String movieId)
	{
		Comment comment = new Comment();
		String sql = "select * from comment where movieId = ?";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, movieId);
			ResultSet result = statement.executeQuery();
			if(result.next())
			{
				comment.setComment(result.getString("comment"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comment;
	}
	
	//retrieve comments for commentId
	public Comment readCommentForId(String commentId)
	{
		Comment comment = new Comment();
		String sql = "select * from comment where commentId = ?";
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, commentId);
			ResultSet result = statement.executeQuery();
			if(result.next())
			{
				comment.setComment(result.getString("comment"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comment;
	}
	
	//update comment
	public Comment updateComment(String commentId, Comment newComment)
	{
		String sql = "update comment set commentId = ? where commentId=?";
		Connection connection;
		try {
			connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, newComment.getCommentId());
			statement.setString(2, commentId);
//			statement.setString(3, user.getFirstName());
//			statement.setString(4, user.getLastName());
//			statement.setString(5, user.getEmail());
//			statement.setString(6, user.getUserName());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newComment;
		
	}
	
	//delete a user by username
	public int deleteComment(String commentId)
	{
		String sql = "delete from comment where commentId = ?";
		
		try {
			Connection connection = ds.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, commentId);
			return statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
