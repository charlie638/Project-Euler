public class Euler12 {
    public static void main(String[] args) {
        int number = 1;
        int counter = 2;
        boolean end = false;
        while (!end) {
            number = counter + number;
            counter++;

            int divisors = 0;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    divisors++;
                }
            }
            if (number % Math.sqrt(number) == 0) divisors++;
            if ((divisors*2) + 2 > 500)
                end = true;
        }
        System.out.println(number);
    }
}
