public class Euler2 {
    public static void main(String[] args) {
        long[] lastTwo = {0, 1};
        int total = 0;
        long fibNum = 0;
        while (fibNum < 4000000) {
            fibNum = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = fibNum;
            if (fibNum % 2 == 0) total += fibNum;
        }
        System.out.println(total);
    }
}