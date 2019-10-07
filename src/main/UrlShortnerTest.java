package main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UrlShortnerTest {
	
   	String[] testUrls = {
			"www.wassup.com/notmuch/thatscool",
			"www.thisisanotherurlthatmightbelong.com",
			"www.cutedoggiepictures.net/148"
	};
	
	UrlShortner us = new UrlShortner();
	
    @Test
    void test1() {    
    	for (int x = 0; x < testUrls.length; x++) {
    		String s1 = us.shorten(testUrls[x]);
    		String s2 = testUrls[x];
    		Assertions.assertEquals(us.restore(s1), s2);
    	}
    }

}
