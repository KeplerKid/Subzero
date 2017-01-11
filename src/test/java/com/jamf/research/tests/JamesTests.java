package test.java.com.jamf.research.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import com.jamf.research.Blake;
import org.junit.Before;
import org.junit.Test;

import com.jamf.research.James;

/**
 * Created by jamesfelton on 1/11/17.
 */
public class JamesTests {

	@Test
	public void testSaySomething() {
		// arrange
		String[] sayings =  {"Pinball time?",
				"Finally, another Apple event!",
				"Where's my iPad?",
				"My wife won't be happy I spent this much."}};
		ArrayList<String> sayingsList = new ArrayList<String>();
		for (String saying : sayings) {
			sayingsList.add(saying);
		}

		// act
		String jamesSaid = Blake.saySomething();

		// assert
		assertEquals(true, sayingsList.contains(jamesSaid));
	}
}
