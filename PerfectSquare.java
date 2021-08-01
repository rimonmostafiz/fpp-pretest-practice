import java.lang.*;

public class PerfectSquare {
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(6));
		System.out.println(isPerfectSquare(36));
		System.out.println(isPerfectSquare(0));
		System.out.println(isPerfectSquare(-5));
	}

	public static int isPerfectSquare(int n) {
		if (n >=0 ) {
			int sq = (int) Math.sqrt((double) n);
			int nextNum = sq + 1;
			return nextNum * nextNum; 
		} else {
			return 0;
		}
	}
}