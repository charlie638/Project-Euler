public class Euler14 {

    private static int collatz(long n) {
        if (n == 1)
            return 1;
        if (n % 2 == 0) {
            n /= 2;
            return collatz(n) + 1;
        } else {
            n = (n * 3) + 1;
            return collatz(n) + 1;
        }
    }

    public static void main(String[] args) {
        int largest = 0;
        long start = 0;
        for (long i = 1; i < 1000000; i++) {
            int n = collatz(i);
            if (n > largest) {
                largest = n;
                start = i;
            }
        }
        System.out.println(start);

    }
}
