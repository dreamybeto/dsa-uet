import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TwoSum {
    public static int binarySearch(int[] a, int l, int r, int val) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (val < a[mid]) r = mid - 1;
            else if (val > a[mid]) l = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In("..\\temp\\algs4-data\\1Kints.txt");
        int[] a = in.readAllInts();
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; ++i) {
            int key = binarySearch(a, i + 1, n, -a[i]);
            if (key != -1) StdOut.println(a[i] + " " + a[key]);
        }
    }
}
