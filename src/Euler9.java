public class Euler9 {
    private static int[] getTriplet() {
        int num = 3;
        while (true) {
            for (int i = num - 1; i > 0; i--) {
                for (int j = i - 1; j > 0; j--) {
                    if (num * num == (i * i) + (j * j) && num + i + j == 1000) {
                        return new int[] {j, i, num};
                    }
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = getTriplet();
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(numbers[0] * numbers[1] * numbers[2]);
    }
}
