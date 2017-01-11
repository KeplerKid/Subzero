package com.jamf.research.tests;

import com.jamf.research.John;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * forked by john.dassow on 1/11/17.
 */
public class JohnTests {

	@Test
	public void testSaySomething() {
		// arrange
		String[] sayings =  {"What does this do?",
				"Don't press the 'Don't' button.",
				"I could really go for some ramen.",
				"Nope. .. Nope. .. Noooooope."};
		ArrayList<String> sayingsList = new ArrayList<String>();
		for (String saying : sayings) {
			sayingsList.add(saying);
		}

		// act
		String johnSaid = John.saySomething();

		// assert
		assertEquals(false, sayingsList.contains(johnSaid));
	}
}
