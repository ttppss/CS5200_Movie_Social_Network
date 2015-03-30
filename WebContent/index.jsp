<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="edu.neu.cs5200.msn.ds.dao.*,edu.neu.cs5200.msn.ds.model.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Hello World</h1>
    
    <%
    /* MovieDAO movieDAO = new MovieDAO(); */
    
    /* Movie movie = new Movie();
    movie.setTitle("Terminator");
    movie.setPoster("I'll be back");
    movie.setMovieId("431"); 
    
    movieDAO.create(movie);*/

    /* List<Movie> movies = movieDAO.findAllMovies();
    
    for(Movie movie : movies)
    {
        out.println(movie.getTitle());
    }
    
    Movie movie = movieDAO.findById(1);
    out.println(movie.getTitle());
    
    movie.setTitle("Avatar 2");
    movieDAO.updateMovie(1, movie);
    
    movie = movieDAO.findById(1);
    out.println(movie.getTitle());
    
    movieDAO.deleteMovie(4); */
    
    /* UserManagerDao userDAO = new UserManagerDao();
    
    userDAO.deleteUser("ThirdOne"); */
    /* User user = userDAO.readUser("FourthOne");
    user.setUserName("NewForthOne");
    userDAO.updateUser("FourthOne", user);
    user = userDAO.readUser("NewForthOne");
    out.println(user.getLastName()); */
    
    /*User user = userDAO.readUser("ThirdOne");
    out.println(user.getLastName());*/
    
    /*List<User> users = userDAO.readAllUsers();
    for(User user : users)
    {
    	out.println(user.getUserName());
    }*/
    
    /* User user = new User();
    user.setUserName("FourthOne");
    user.setPassWord("456");
    user.setFirstName("Good4");
    user.setLastName("Bye4");
    user.setEmail("Good@Bye4.com");
    userDAO.create(user); */
    
    /* ActorDAO actorDAO = new ActorDAO();
    Actor actor = new Actor();
    actor.setActorId("04");
    actor.setFirstName("Curry");
    actor.setLastName("Center");
    actorDAO.create(actor);
    out.println(actor.getFirstName()); */
    ActorDAO actorDAO = new ActorDAO();
    /* List<Actor> actors = actorDAO.readAllActors();
    for(Actor actor : actors)
    {
    	out.println(actor.getFirstName());
    } */
    /* Actor actor = actorDAO.readActor("01");
    out.println(actor.getLastName()); */
    /* Actor actor = new Actor();
    actor.setActorId("007");
    actorDAO.updateActor("002",actor);
    actor = actorDAO.readActor("007");
    out.println(actor.getLastName()); */
    actorDAO.deleteActor("3");
    
    /* actorDAO.create(actor); */
    
    
    %>
</body>
</html>