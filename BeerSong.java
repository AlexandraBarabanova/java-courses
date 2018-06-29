public class BeerSong {
	public static void main (String[] args) {
		int numBeer = 99;
		String word = "bottles";
		
		while (numBeer > 0) {
			System.out.println(numBeer + word + " of beer on the wall");
			System.out.println(numBeer + word + " of beer!");
			System.out.println("Take one down, pass it around");
			numBeer = numBeer - 1;
			if (numBeer == 1) {
				word = "bottle";
			}
			if (numBeer > 0) {
				System.out.println(numBeer + word + " of beer on the wall!");
			} else {
				System.out.println("No bottles of beer on the wall!");
			}
		}
	}
}