public class PrimeCount {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6)); 
    }

    public static int primeCount(int start, int end) {
        if (start <= 0) {
            start = 1;
        }
        if (start > end) {
            return 0;
        }
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt((double) n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}