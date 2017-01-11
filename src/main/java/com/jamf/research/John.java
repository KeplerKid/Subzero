package com.jamf.research;

/**
 * Forked by john.dassow on 1/11/17.
 */
public class John {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings = {"What does this do?",
				"Don't press the 'Don't' button.",
				"I could really go for some ramen.",
				"Nope. .. Nope. .. Noooooope."};
		return sayings[selection % sayings.length];
	}

}
