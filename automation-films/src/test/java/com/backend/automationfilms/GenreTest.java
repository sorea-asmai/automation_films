package com.backend.automationfilms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class GenreTest {
	
	@Test
	void getGenreObject() {
		Integer id = 1;
		String name = "Drama";
		Genre drama = new Genre();
		drama.setId(1);
		drama.setName("Drama");
		Set<Movie> movieList = new HashSet<>();
		Integer movieId = 99;
	    String movieName = "Titanic";
	    String description = "This movie won 11 oscar awards.";
	    Integer year = 1997;
	    String poster = "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg";
	    String imdbLink = "https://www.imdb.com/title/tt0120338/";
	    Movie movie = new Movie();
	    movie.setId(movieId);
	    movie.setName(movieName);
	    movie.setDescription(description);
	    movie.setImbdLink(imdbLink);
	    movie.setPoster(poster);
	    movie.setYear(year);
	    
	    drama.setMovie(movieList);

		assertEquals(id, drama.getId(), "getId()");
		assertEquals(name, drama.getName(), "getName()");
		assertEquals(movieList, drama.getMovie(), "getMovie()");
	}
	
	@Test
	void getGenreString() {
		Integer id = 1;
		String name = "Drama";
		Genre drama = new Genre();
		drama.setId(id);
		drama.setName(name);

	    
	    String dramaToString = "1" + "\n" 
	    			+ "Drama" + "\n";
	    assertEquals("toString()", 
	    		dramaToString, drama.toString());
	}

}
