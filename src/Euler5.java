public class Euler5 {
    public static void main(String[] args) {
        boolean end = false;
        int start = 20;
        while (!end) {
            if (start % 20 != 0)
                start++;
            else if (start % 19 != 0)
                start++;
            else if (start % 18 != 0)
                start ++;
            else if (start % 17 != 0)
                start ++;
            else if (start % 16 != 0)
                start ++;
            else if (start % 15 != 0)
                start ++;
            else if (start % 14 != 0)
                start ++;
            else if (start % 13 != 0)
                start ++;
            else if (start % 12 != 0)
                start ++;
            else if (start % 11 != 0)
                start ++;
            else end = true;
        }
        System.out.println(start);
    }
}
