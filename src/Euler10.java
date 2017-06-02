// need to make more efficient

public class Euler10 {
    public static void main(String[] args) {
        int[] primes = {2};
        int number = 3;
        while (number < 2000000) {
            int i = 0;
            boolean prime = true;
            while (i < primes.length/2 && prime) {
                if (number % primes[i] == 0)
                    prime = false;
                i++;
            }
            if (prime) {
                int[] temp = new int[primes.length+1];
                System.arraycopy(primes, 0, temp, 0, primes.length);
                temp[primes.length] = number;
                primes = temp;
            }
            number++;
        }
        long sum = 0;
        for (int element: primes)
            sum += element;
        System.out.println(sum);
    }
}
