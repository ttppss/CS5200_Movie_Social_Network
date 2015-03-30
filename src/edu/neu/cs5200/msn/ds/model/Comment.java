package edu.neu.cs5200.msn.ds.model;

public class Comment {
	private String commentId;
	private String comment;
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Comment(String commentId, String comment) {
		super();
		this.commentId = commentId;
		this.comment = comment;
	}
	public Comment() {
		super();
	}
	}