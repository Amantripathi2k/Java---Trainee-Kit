public class phase {
	public static void main(String[] args) {
		String[] wordListOne = {"agnostic", "opinionated", "voice activated"};
		String[] wordListTwo = {"six sigma", "IOT", "cloud native"};
		String[] wordListThree = {"design", "DSL", "Rest API"};
		
		int oneLength = wordListOne.length;
		int threeLength = wordListTwo.length;
		int twoLength = wordListThree.length;
		
		java.util.Random rg = new java.util.Random();
		int rand1 = rg.nextInt(oneLength);
		int rand2 = rg.nextInt(twoLength);
		int rand3 = rg.nextInt(threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
		
	}
}