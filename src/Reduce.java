public class Reduce {

    public static int reduceToZero(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        int result = reduceToZero(100);
        System.out.println(result);
    }
}
