public class bottles {
	public static void main (String[] args) {
		int x = 10;
		String word = "bottles";
		String word2 = "bottle";
		while(x > 1) {
			System.out.println( x + "green" + word + ", hanging on the wall");
			System.out.println("And if one green bottle should accidentally fall");
			x = x - 1;
			System.out.println("There'll be " + x +  " green bottles hanging on the wall");
		}
		if(x == 1) {
				System.out.println( x + "green" + word2 + ", hanging on the wall");
				x = x - 1;
				System.out.println("And if one green bottle should accidentally fall");
				System.out.println("There'll be no green bottles hanging on the wall");
		}
		
	}
}
