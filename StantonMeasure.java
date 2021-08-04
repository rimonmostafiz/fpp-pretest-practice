public class StantonMeasure {
    public static void main(String[] args) {
        System.out.println(isStantonMeasure(new int[] {1}));
        System.out.println(isStantonMeasure(new int[] {0}));
        System.out.println(isStantonMeasure(new int[] {3, 1, 1, 4}));
        System.out.println(isStantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
        System.out.println(isStantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(isStantonMeasure(new int[] {}));
    }

    public static int isStantonMeasure(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) count++;
        }
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == count) cnt++;
        }
        return cnt;
    }
}