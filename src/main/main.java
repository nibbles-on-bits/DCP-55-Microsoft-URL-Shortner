package main;

//import Math.random;

public class main {

	public static void main(String[] args) {
		
		UrlShortner us = new UrlShortner();
		System.out.println("endofprog");
		
		String s = "http://www.wassup.com";
		String r = us.shorten(s);
		System.out.printf("%s\t%s\n",s,r);
		System.out.printf("%s\n",us.expand(r));
		
		s = "https://www.google.com/catvideos";
		r = us.shorten(s);
		System.out.printf("%s\t%s\n",s,r);
		System.out.printf("%s\n",us.expand(r));
		
		s = "nibblesonbits.com";
		r = us.shorten(s);
		System.out.printf("%s\t%s\n",s,r);
		System.out.printf("%s\n",us.expand(r));
		
		s = "http://supercool.com";
		r = us.shorten(s);
		System.out.printf("%s\t%s\n",s,r);
		System.out.printf("%s\n",us.expand(r));
		
		s = "notapornsite.net/puppies/tinyboxerpup";
		r = us.shorten(s);
		System.out.printf("%s\t%s\n",s,r);
		System.out.printf("%s\n",us.expand(r));
		
		s = "whatdoyouthinkofthis.com";
		r = us.shorten(s);
		System.out.printf("%s\t%s\n",s,r);
		System.out.printf("%s\n",us.expand(r));

	}
	
	
}
