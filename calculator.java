import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("ENTER 1 FOR ADDITION:.");
        System.out.println("ENTER 2 FOR SUBTRACTION:");
        System.out.println("ENTER 3 FOR MULTIPLICATION");
        System.out.println("ENTER 4 FOR DIVISION");
        System.out.println("ENTER YOUR CHOICE");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("enter two numbers for addition");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = a + b;
                System.out.println("sum of" + a + "and" + b + "is" + c);
                break;
            case 2:
                System.out.println("enter two numbers for subtraction");
                int d = sc.nextInt();
                int e = sc.nextInt();
                int f = d - e;
                System.out.println("difference of" + d + "and" + e + "is" + f);
                break;

            case 3:
                System.out.println("enter two numbers for multiplication");
                int g = sc.nextInt();
                int h = sc.nextInt();
                int i = g * h;
                System.out.println("sum of" + g + "and" + h + "is" + i);
                break;
            case 4:
                System.out.println("enter two numbers for division");
                int j = sc.nextInt();
                int k = sc.nextInt();
                int l = j / k;
                System.out.println("sum of" + j + "and" + k + "is" + l);
                break;
            default:
                System.out.println("INVALID INPUT!!");
                break;
        }
    }
}
