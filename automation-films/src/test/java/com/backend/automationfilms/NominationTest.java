package com.backend.automationfilms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class NominationTest {

	@Test
	void getAwardCategoryObject() {
		Integer idAward = 1;
		String name = "Best Picture";
		Integer year = 1928;
		
		AwardCategory awardCate = new AwardCategory();
		
		awardCate.setId(idAward);
		awardCate.setName(name);
		awardCate.setYear(year);
		
		String fName = "Leonardo";
		String lName = "DiCaprio";
		String role = "Actor";
		Person person = new Person();
		person.setFirstName(fName);
		person.setLastName(lName);
		person.setRole(role);
		
		Integer idMovie = 99;
	    String movieName = "Titanic";
	    String description = "This movie won 11 oscar awards.";
	    Integer yearMovie = 1997;
	    String poster = "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg";
	    String imdbLink = "https://www.imdb.com/title/tt0120338/";
	    Movie movie = new Movie();
	    movie.setId(idMovie);
	    movie.setName(movieName);
	    movie.setDescription(description);
	    movie.setImbdLink(imdbLink);
	    movie.setPoster(poster);
	    movie.setYear(yearMovie);
	    // set Genre
	    Set<Genre> genreList = new HashSet<>();
	    Genre drama = new Genre();
	    drama.setName("Drama");
	    Genre romance = new Genre();
	    romance.setName("Romance");
	    genreList.add(drama);
	    genreList.add(romance);
	    movie.setGenre(genreList);
		
	    Integer id = 1;
	    Nominated nominationObject = new Nominated();
	    nominationObject.setId(id);
	    nominationObject.setAwardCategory(awardCate);
	    nominationObject.setPerson(person);
	    nominationObject.setMovie(movie);
	    nominationObject.setIs_winning(Boolean.FALSE);

		assertEquals(id, nominationObject.getId(), "getId()");
	    assertEquals(awardCate, nominationObject.getAwardCategory(), "getAwardCategory()");
		assertEquals(movie, nominationObject.getMovie(), "getMovie()");
		assertEquals(Boolean.FALSE, nominationObject.getIs_winning(), "getIs_winning()");
		assertEquals(person, nominationObject.getPerson(), "getPerson()");
	    
	    String result = "";
        result = result + id + "\n";
        result = result + movie.toString() + "\n";
        result = result + awardCate.toString() + "\n";
        result = result + person.toString() + "\n";
        result = result + Boolean.FALSE + "\n";
	    assertEquals("toString()", 
	    		result, nominationObject.toString());
	}


}
