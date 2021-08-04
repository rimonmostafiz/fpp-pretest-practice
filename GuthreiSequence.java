public class GuthreiSequence {
    public static void main(String[] args) {
        System.out.println(isGuthreiSequence(new int[]{8, 4, 2, 1}));
        System.out.println(isGuthreiSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthreiSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthreiSequence(new int[]{8, 4, 2}));
        System.out.println(isGuthreiSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
    }

    public static int isGuthreiSequence(int[] a) {
        int len = a.length;
        int num = a[0];
        for (int i = 1; i < len; i++) {
            int next;
            if (num % 2 == 0) {
                next = num / 2;
            } else {
                next = (num * 3) + 1;
            }
            if (next == a[i]) {
                num = next;
                continue;
            } else {
                return 0;
            }
        }
        if (num == 1) return 1;
        else return 0;
    }
}