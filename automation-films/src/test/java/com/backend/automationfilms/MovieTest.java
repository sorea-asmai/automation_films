package com.backend.automationfilms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void getMovieObject() {
		Integer id = 99;
	    String movieName = "Titanic";
	    String description = "This movie won 11 oscar awards.";
	    Integer year = 1997;
	    String poster = "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg";
	    String imdbLink = "https://www.imdb.com/title/tt0120338/";
	    Movie movie = new Movie();
	    movie.setId(id);
	    movie.setName(movieName);
	    movie.setDescription(description);
	    movie.setImbdLink(imdbLink);
	    movie.setPoster(poster);
	    movie.setYear(year);
	    // set Genre
	    Set<Genre> genreList = new HashSet<>();
	    Genre drama = new Genre();
	    drama.setName("Drama");
	    Genre romance = new Genre();
	    romance.setName("Romance");
	    genreList.add(drama);
	    genreList.add(romance);
	    movie.setGenre(genreList);
	    
		assertEquals(id,movie.getId(), "getId()");
	    assertEquals("getMovieName()", 
                movieName, movie.getName());
	    assertEquals("getDescription()", 
	    		description, movie.getDescription());
	    assertEquals("getImbdLink()", 
	    		imdbLink, movie.getImbdLink());
	    assertEquals("getPoster()", 
	    		poster, movie.getPoster());
		assertEquals(year, movie.getYear(), "getYear()");
		assertEquals(genreList, movie.getGenre(), "getGenre()");
	}
	

	@Test
	void getMovieString() {
		Integer id = 99;
	    String movieName = "Titanic";
	    String description = "This movie won 11 oscar awards.";
	    Integer year = 1997;
	    String poster = "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg";
	    String imdbLink = "https://www.imdb.com/title/tt0120338/";
	    Movie movie = new Movie();
	    movie.setId(id);
	    movie.setName(movieName);
	    movie.setDescription(description);
	    movie.setImbdLink(imdbLink);
	    movie.setPoster(poster);
	    movie.setYear(year);
	    // set Genre
	    Set<Genre> genreList = new HashSet<>();
	    Genre drama = new Genre();
	    drama.setId(1);
	    drama.setName("Drama");
	    Genre romance = new Genre();
	    romance.setId(2);
	    romance.setName("Romance");
	    genreList.add(drama);
	    genreList.add(romance);
	    movie.setGenre(genreList);
	    
	    String movieToString = "99" + "\n" 
	    			+ "Titanic" + "\n"
	    			+ "1997" + "\n"
	    			+ "This movie won 11 oscar awards." + "\n"
	    			+ "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg" + "\n"
	    			+ "https://www.imdb.com/title/tt0120338/" + "\n"
	    			+ "1\nDrama\n" +"2\nRomance\n"
	    			+ "\n";
	    assertEquals("toString()", 
	    		movieToString, movie.toString());
	}
}
