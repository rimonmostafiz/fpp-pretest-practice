public class PorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(1));
        System.out.println(findPorcupineNumber(72));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(145));
        System.out.println(findPorcupineNumber(400));
        System.out.println(findPorcupineNumber(408));
        System.out.println(findPorcupineNumber(409));
        System.out.println(findPorcupineNumber(412));
    }

    public static int findPorcupineNumber(int n) {
        int t = n + 1;
        while (true) {
            if (isPrime(t) == 1 && lastDigitIsNine(t) && lastDigitIsNine(nextPrime(t))) {
                return t;
            } else {
                t++;
            }
        }
    }

    public static boolean lastDigitIsNine(int n) {
        return n % 10 == 9;
    }

    public static int isPrime(int n) {
        if (n <= 1) return 0;
        int sq = (int) Math.sqrt((double) n);
        for (int i = 2; i <= sq; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int nextPrime(int n) {
        while (true) {
            if (isPrime(++n) == 1) {
                return n;
            }
        }
    }
}