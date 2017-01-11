package com.jamf.research;

/**
 * Created by jamesfelton on 1/11/17.
 */
public class Mike {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings =  {"Raspberry Pi's FTW",
				"Why pay for subscription, roll your own!",
				"In the words of señor Cynor, \"Game Changer\"",
				"IDE? you mean easy-mode?"};
		return sayings[selection % sayings.length];
	}
}
