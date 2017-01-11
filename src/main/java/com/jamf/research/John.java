package com.jamf.research;

/**
 * Created by jamesfelton on 1/11/17.
 */
public class John {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings = {
				"Just say 'No' to plug-ins!",
				"Serverless code, man! Serverless code.",
				"Did someone say Lambda",
				"Dungeons & Dragons!" };
		return sayings[selection % sayings.length];
	}

}
