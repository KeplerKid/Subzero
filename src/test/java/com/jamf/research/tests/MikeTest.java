package test.java.com.jamf.research.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.jamf.research.James;

/**
 * Created by Mike Mello on 1/11/17.
 */
public class JamesTests {

	@Test
	public void testSaySomething() {
		// arrange
		String[] sayings =  {"Raspberry Pi's FTW",
				"Why pay for subscription, roll your own!",
				"In the words of señor Cynor, \"Game Changer\"",
				"IDE? you mean easy-mode?"};
		ArrayList<String> sayingsList = new ArrayList<String>();
		for (String saying : sayings) {
			sayingsList.add(saying);
		}

		// act
		String mikeSaid = Mike.saySomething();

		// assert
		assertEquals(true, sayingsList.contains(mikeSaid));
	}
}
