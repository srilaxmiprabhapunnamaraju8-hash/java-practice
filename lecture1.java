import java.util.*;
class lecture1 {
    public static void main (String args[]) {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.print("hello world\nfrom java..\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("*****");

        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int divide = a / b;
        int quo = a % b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(divide);
        System.out.println(quo);

        int c = 10;
        int d = 5;
        int ans = (c*d)/(c-d);
        System.err.println(ans);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int add = num1 + num2;
        System.out.println(add);

    }
}