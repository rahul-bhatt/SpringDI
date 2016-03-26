package spring.di.xmlwiring;

public class Sonnet29 implements Poem {

	private static String[] LINES = {"When, in disgrace with fortune and men's eyes,",
								"I all alone beweep my outcast state,"};
	
	public  Sonnet29() {}
	
	public void recite() {
		for(String line : LINES) {
			System.out.println(line);
		}
	}

}
