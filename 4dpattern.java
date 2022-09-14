public class Pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int  i, j, k;
        // System.out.println("enter no. of terms");
        // n = sc.nextInt();
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = 4; i >= 1; i--)
        {
            for (j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
