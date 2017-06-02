public class Euler4 {

    private static String reverse(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            ret = str.substring(i,i+1) + ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        int largest = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int prod = i * j;
                String p = Integer.toString(prod);
                if (p.substring(0, p.length() / 2).equals(reverse(p.substring(p.length() / 2, p.length())))) {
                    if (prod > largest)
                        largest = prod;
                }
            }
        }
        System.out.println(largest);
    }
}
