public class MadhavArray {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    public static int isMadhavArray(int[] a) {
        int len = a.length;
        boolean lenOk = false;
        for (int n = 1; n < len; n++) {
            int prop = (n * (n + 1)) / 2;
            if (prop == len) {
                lenOk = true;
                break;
            }
        }
        if (!lenOk) return 0;

        int counter = 2;
        int i = 1;
        while (i < len) {
            int sum = 0;
            for (int j = 1; j <= counter; j++, i++) {
                sum += a[i];
            }
            if (sum == a[0]) {
                counter++;
            } else {
                return 0;
            }
        }
        return 1;
    }
}