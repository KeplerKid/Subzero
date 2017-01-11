package com.jamf.research.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.jamf.research.Kyle;

/**
 * Created by kylehammond on 1/11/17.
 */
public class KyleTests {

	@Test
	public void testSaySomething() {
		// arrange
		String[] sayings =  {"Minitaure Schnauzers.",
				"Did you test it?",
				"No, really, did you test it?",
				"Sublime Text rocks."};
		ArrayList<String> sayingsList = new ArrayList<String>();
		for (String saying : sayings) {
			sayingsList.add(saying);
		}

		// act
		String kyleSaid = Kyle.saySomething();

		// assert
		assertEquals(true, sayingsList.contains(kyleSaid));
	}
}
