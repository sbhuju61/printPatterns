/**
 * 
 */
package com.ss.first;

/**
 * @author srv-max
 *
 */
public class App {

	public void firstPattern(int numOfLines) {
		for (int i = 1; i <= numOfLines; i++) {
			System.out.println(calculateString(i, '*'));
		}
	}

	public void secondPattern(int numOfLines) {
		for (int i = numOfLines; i >= 1; i--) {
			System.out.println(calculateString(i, '*'));
		}
	}

	public void thirdPattern(int numOfLines) {
		int numOfStars = numOfLines * 2 - 1;

		for (int i = 1; i <= numOfStars; i += 2) {
			int numOfSpaces = (numOfStars - i) / 2;
			System.out.println(calculateString(numOfSpaces, ' ') + calculateString(i, '*')
					+ calculateString((numOfStars - i) / 2, ' '));
		}
	}

	public void fourthPattern(int numOfLines) {
		int numOfStars = numOfLines * 2 - 1;

		for (int i = numOfStars; i >= 1; i -= 2) {
			int numOfSpaces = (numOfStars - i) / 2;
			System.out.println(calculateString(numOfSpaces, ' ') + calculateString(i, '*')
					+ calculateString((numOfStars - i) / 2, ' '));
		}
	}

	private String calculateString(int count, char charType) {
		StringBuilder string = new StringBuilder();

		while (count > 0) {
			string.append(charType);
			count--;
		}

		return string.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App star = new App();

		/* Enter of lines for each pattern */
		int numOfLines = 40;

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
