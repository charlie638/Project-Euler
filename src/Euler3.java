public class Euler3 {
    private static int nextPrime(int num) {
        int newNum = num;
        while (true) {
            newNum += 1;
            int checker = 2;
            boolean prime = true;
            while (checker <= newNum/2 && prime) { //check if prime
                if (newNum % checker == 0)
                    prime = false;
                checker += 1;
            }
            if (prime) {
                return newNum;
            }
        }
    }
    public static void main(String[] args) {
        int[] primes = {2};
        int largest = 1;
        long num = 600851475143L;
        boolean end = false;
        while (!end) {
            int i = 0;
            boolean cont = true;
            while (i < primes.length && cont && num > primes[i]) {
                if (num % primes[i] == 0) {
                    num = num / primes[i];
                    cont = false;
                    if (primes[i] > largest)
                        largest = primes[i];
                } else {
                    int[] temp = new int[primes.length+1];
                    System.arraycopy(primes, 0, temp, 0, primes.length);
                    temp[primes.length] = nextPrime(primes[primes.length-1]);
                    primes = temp;
                }
                i++;
            }
            if (cont) {
                end = true;
                if (num > largest) largest = (int) num;
            }
        }
        System.out.println(largest);
    }
}
