package com.jamf.research;

/**
 * Created by kylehammond on 1/11/17.
 */
public class Kyle {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings =  {"Minitaure Schnauzers.",
				"Did you test it?",
				"No, really, did you test it?",
				"Sublime Text rocks."};
		return sayings[selection % sayings.length];
	}
}
