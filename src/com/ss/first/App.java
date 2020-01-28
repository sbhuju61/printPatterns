/**
 * 
 */
package com.ss.first;

/**
 * @author sauravbhuju
 *
 */
public class App {
	
	public void firstPattern (int numOfLines) {
		for (int i = 1; i <= numOfLines; i++) {
			System.out.println(calculateStar(i));
		}
	}
	public void secondPattern (int numOfLines) {
		for (int i = numOfLines; i >= 1; i--) {
			System.out.println(calculateStar(i));
		}
	}
	public void thirdPattern (int numOfLines) {
		int numOfStars = numOfLines*2-1;
		
		for (int i = 1; i <= numOfStars; i+=2) {
			System.out.println( calculateSpace((numOfStars-i)/2) + calculateStar(i) + calculateSpace((numOfStars-i)/2));
		}
	}
	
	public void fourthPattern (int numOfLines) {
		int numOfStars = numOfLines*2-1;
		
		for (int i = numOfStars; i >= 1; i-=2) {
			System.out.println( calculateSpace((numOfStars-i)/2) + calculateStar(i) + calculateSpace((numOfStars-i)/2));
		}
	}
	
	private String calculateStar (int starCount) {
		StringBuilder starString = new StringBuilder();
		
		while (starCount > 0) {
			starString.append("*");
			starCount--;
		}
		
		return starString.toString();
	}
	
	private String calculateSpace (int spaceCount) {
		StringBuilder spaceString = new StringBuilder();
		
		while (spaceCount > 0) {
			spaceString.append(" ");
			spaceCount--;
		}
		
		return spaceString.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App star = new App ();
		
		/*Enter of lines for each pattern */
		int numOfLines = 4;
		
		System.out.println("First Pattern: ");
		star.firstPattern(numOfLines);
		
		System.out.println("Second Pattern: ");
		star.secondPattern(numOfLines);
		
		System.out.println("Third Pattern: ");
		star.thirdPattern(numOfLines);
		
		System.out.println("Fourth Pattern: ");
		star.fourthPattern(numOfLines);
		
		

	}

}
