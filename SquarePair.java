public class SquarePair {
    public static void main(String[] args) {
        System.out.println(countSquarePair(new int[] {11, 5, 4, 20}));
        System.out.println(countSquarePair(new int[] {9, 0, 2, -5, 7}));
        System.out.println(countSquarePair(new int[] {9}));
    }

    public static int countSquarePair(int[] a) {
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    int x = a[i];
                    int y = a[j];
                    if (x < y && x > 0 && y > 0 && isPerfectSquare(x + y)) {
                        count++;
                    }
                }
            }
        }
        return  count;
    }

    public static boolean isPerfectSquare(int n) {
        if (n > 0) {
            int num = (int) Math.sqrt((double) n);
            return n == (num * num);
        } else {
            return false;
        }
    }
}