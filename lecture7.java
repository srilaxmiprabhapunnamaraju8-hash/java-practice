import java.util.*;
public class lecture7 {
    // public static void printMyName(String name) {
        // System.out.println(name);
        // return;

    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //      return sum;

    // public static int calculateProduct(int a, int b){
    //     int product = a * b;
    //     return product;
    // }

    public static void printFactorial(int n ){
        if(n <0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i =n; i >=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("sum of 2 no.'s is = " + sum);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
       // printMyName(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = calculateProduct(a, b);
        // System.out.println("product of 2 nums is = " + product);

        int n = sc.nextInt();
        printFactorial(n);


    }
}

