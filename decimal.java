public class decimal {
    public static void main(String args[]) {
        int i = 0, num = 1100, rem;
        double sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem * Math.pow(2, i);
            i++;
            num = num / 10;
        }
        System.out.println(sum);
    }
}