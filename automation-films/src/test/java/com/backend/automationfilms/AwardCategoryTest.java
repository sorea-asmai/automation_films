package com.backend.automationfilms;

import static org.junit.jupiter.api.Assertions.*;

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
		
	    assertEquals(id, awardCate.getId(), "getId()");
		assertEquals(name, awardCate.getName(), "getMovie()");
		assertEquals(year, awardCate.getYear(), "getYear()");
		assertEquals(null, awardCate.getNomination(), "getNomination()");
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
