public class W01_FizzBuzz {
    public static void showFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBuzz ");
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("Fizz ");
                continue;
            }

            if (i % 5 == 0) {
                System.out.print("Buzz ");
                continue;
            }

            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        showFizzBuzz(100);
    }
}
