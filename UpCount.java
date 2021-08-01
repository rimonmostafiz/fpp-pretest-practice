import java.lang.*;
import java.util.*;

public class UpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[] {2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println(nUpCount(new int[] {6, 3, 1}, 6));
        System.out.println(nUpCount(new int[] {1, 2, -1, 5, 3, 2, -3}, 20));
    }

    public static int nUpCount(int[] a, int n) {
        int len = a.length;
        int prev = 0;
        int sum = 0;
        int cnt = 0;
        
        for (int i = 0; i < len; i++) {
            prev = sum;
            sum += a[i];
            if (prev <= n && sum > n) cnt++;
        }

        return cnt;
    }
}