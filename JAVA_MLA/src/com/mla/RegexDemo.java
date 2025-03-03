package com.mla;

import java.util.regex.*;

public class RegexDemo {

	public static void main(String[] v) {
		Pattern format = Pattern.compile(".k");
		Matcher match = format.matcher("ok");
		System.out.println(match.matches());
		boolean ok = Pattern.compile("\\*.k").matcher("*ok").matches();
		System.out.println(ok);
		
		System.out.println(Pattern.matches("[7377]{5}[0-9]{7}", "737732127137"));
		
		boolean vali_email = Pattern.matches("[_a-z0-9]+(\\.[a-z0-9]*)*@[A-Z]+(\\.[a-z])", "wqerwer.weretr@mphasis.com");
		System.out.println(vali_email);
	}
}
