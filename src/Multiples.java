public class Multiples {
    public static void main(String[] args) {
        int limit = 1000;
        int number = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                number++;
            }
        }

        System.out.println("The number of multiples of 3 or 5 below 1000 is: " + number);
    }
}
