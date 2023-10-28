public class W02_PrintingPatterns {

    public static void simpleTriangle(int n) {
        int number = 0;
        for (int i=1; i <= n; i++) {
            for (int j=1; j<= i; j++) {
                System.out.print(++number + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    simpleTriangle(5);
    }
}
