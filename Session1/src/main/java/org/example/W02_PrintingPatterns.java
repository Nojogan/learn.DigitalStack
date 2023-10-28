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

    public static void secondTriangle(int n) {
        int[][] matrix = new int[100][100];

        for (int i=1; i <= n; i++) {
            for (int j=1; j<= i; j++) {
                matrix[i][j] = 1;

                if ((1<j)&&(j<i)) {
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
                }
            }
        }

        for (int i=1; i <= n; i++) {
            for (int j=1; j<= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void secondTriangle2(int n) {
        for (int i=1; i <= n; i++) {
            int currentValue = 1;

            for (int j=1; j<= i; j++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (i-j)/j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        secondTriangle(6);
        System.out.println();
        secondTriangle2(6);
    }
}
