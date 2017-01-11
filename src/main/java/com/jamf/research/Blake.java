package com.jamf.research;

/**
 * Created by blakepierce on 1/11/17.
 */
public class Blake {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings =  {"Pinball time?",
				"Finally, another Apple event!",
				"Where's my iPad?",
				"My wife won't be happy I spent this much."};
		return sayings[selection % sayings.length];
	}
}
