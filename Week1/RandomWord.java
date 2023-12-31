import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String res = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String current = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / i)) {
                res = current;
            }
            i++;
        }
        StdOut.print(res);
    }
}
