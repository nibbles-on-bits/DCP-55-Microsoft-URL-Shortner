package main;

import java.util.HashMap;

public class UrlShortner {
	private char[] alphaNums = new char[62];
	HashMap<String, String> mUrls = new HashMap<String, String>();
	
	
	public UrlShortner() {
		int cnt = 0;
		
		for (int x = (int) 'a'; x <= (int) 'z'; x++ ) {
			alphaNums[cnt] = (char) x;
			cnt++;
		}
		for (int x = (int) 'A'; x <= (int) 'Z'; x++ ) {
			alphaNums[cnt] = (char) x;
			cnt++;
		}
		for (int x = (int) '0'; x <= (int) '9'; x++ ) {
			alphaNums[cnt] = (char) x;
			cnt++;
		}
		
		System.out.println("Check it out");
	}
	
	public String shorten(String s) {
		String ret = "";
		
		for (int x = 0; x < 7; x++) {
			int rand = (int)(Math.random()*62);
			ret += alphaNums[rand];
		}
		
		mUrls.put(ret, s);
		
		return ret;
	}
	
	public String restore(String s) {
		
		return mUrls.get(s);
	}

}
