public class Euler6 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += (i * i);
            sum2 += i;
        }
        sum2 *= sum2;
        System.out.println(Math.abs(sum2-sum1));
    }
}
