public class Euler7 {
    public static void main(String[] args) {
        int[] factors = {2};
        int count = 0;
        int number = 2;
        while (count < 10000) {
            number++;
            boolean prime = true;
            int i = 0;
            while (i < factors.length/2 && prime) {
                if (number % factors[i] == 0) {
                    prime = false;
                }
                i++;
            }
            if (prime) {
                count++;
                int[] temp = new int[factors.length+1];
                System.arraycopy(factors, 0, temp, 0, factors.length);
                temp[factors.length] = number;
                factors = temp;
            }
        }
        System.out.println(number);
    }
}
