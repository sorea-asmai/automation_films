package com.backend.automationfilms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void getPersonObject() {
		Integer id = 1;
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
		Integer id = 1;
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
