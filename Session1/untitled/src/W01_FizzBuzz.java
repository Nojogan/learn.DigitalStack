public class W01_FizzBuzz {
    public static void showFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.printf("FizzBuzz ");
                continue;
            }

            if (i % 3 == 0) {
                System.out.printf("Fizz ");
                continue;
            }

            if (i % 5 == 0) {
                System.out.printf("Buzz ");
                continue;
            }

            System.out.printf(i + " ");
        }
    }
    public static void main(String[] args) {
        showFizzBuzz(100);
    }
}
