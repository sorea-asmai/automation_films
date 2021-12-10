package com.backend.automationfilms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AwardCategoryTest {

	@Test
	void getAwardCategoryObject() {
		Integer id = 1;
		String name = "Best Picture";
		Integer year = 1928;
		
		AwardCategory awardCate = new AwardCategory();
		
		awardCate.setId(id);
		awardCate.setName(name);
		awardCate.setYear(year);
		
	    
	    assertEquals("getId()", 
                id, awardCate.getId());
	    assertEquals("getName()", 
               name , awardCate.getName());
	    assertEquals("getMovie()", 
	    		year, awardCate.getYear());
	    assertEquals("getMovie()", 
	    		null, awardCate.getNomination());
	}
	
	@Test
	void getAwardCategoryString() {
		Integer id = 1;
		String name = "Best Picture";
		Integer year = 1928;
		
		AwardCategory awardCate = new AwardCategory();
		
		awardCate.setId(id);
		awardCate.setName(name);
		awardCate.setYear(year);
	    
	    String awardToString = "1" + "\n" 
	    			+ "Best Picture" + "\n"
	    			+ "1928" +"\n";
	    assertEquals("toString()", 
	    		awardToString, awardCate.toString());
	}

}
