package tiy.pink;

/**
 * Created by Brett on 8/24/16.
 */
public class ChocolateSolver {
	public int makeChocolate(int small, int big, int goal) {
//		int bigCounter = 1;
		while (goal >= 5 && big > 0) {
			goal -= 5;
			big--;
		}
		if (goal <= small){
			return goal;
		}else {
			return -1;
		}
	}

}
