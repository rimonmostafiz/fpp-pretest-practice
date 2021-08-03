public class InertialArray {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[] {1}));
        System.out.println(isInertial(new int[] {2}));
        System.out.println(isInertial(new int[] {1, 2, 3, 4}));
        System.out.println(isInertial(new int[] {1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[] {2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[] {2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[] {-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[] {2, 3, 5, 7}));
        System.out.println(isInertial(new int[] {2, 4, 6, 8, 10}));
    }

    public static int isInertial(int[] a) {
        boolean hasOdd = false;
        int len = a.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;
            } 
            max = Math.max(a[i], max);
        }
        if (!hasOdd || max % 2 != 0) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < len; j++) {
                    if (a[j] % 2 == 0 && i != j && a[j] != max) {
                        if (a[i] > a[j]) {
                            continue;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }
}