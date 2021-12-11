package com.backend.automationfilms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void getPersonObject() {
		String fName = "Leonardo";
		String lName = "DiCaprio";
		String role = "Actor";
		Person person = new Person();
		person.setFirstName(fName);
		person.setLastName(lName);
		person.setRole(role);

	    assertEquals("getFirstName()", 
                fName, person.getFirstName());
	    assertEquals("getName()", 
               lName , person.getLastName());
	    assertEquals("getMovie()", 
	    		role, person.getRole());
	}
	
	@Test
	void getPersonString() {
		String fName = "Leonardo";
		String lName = "DiCaprio";
		String role = "Actor";
		Person person = new Person();
		person.setFirstName(fName);
		person.setLastName(lName);
		person.setRole(role);
	    
	    String dramaToString = "null" + "\n" 
	    			+ "Leonardo" + "\n"
	    			+ "DiCaprio" + "\n"
	    			+ "Actor" + "\n";
	    assertEquals("toString()", 
	    		dramaToString, person.toString());
	}

}
