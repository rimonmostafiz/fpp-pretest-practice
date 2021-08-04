public class SumFactor {
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[] {9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[] {1}));
        System.out.println(sumFactor(new int[] {0, 0, 0}));
        System.out.println(sumFactor(new int[] {1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[] {1, 2, 3, 4}));
    }

    public static int sumFactor(int[] a) {
        int sum = 0;
        for(int x : a) {
            sum += x;
        }
        int cnt = 0;
        for (int x : a) {
            if (x == sum) {
                cnt++;
            }
        }
        return cnt;
     } 
}