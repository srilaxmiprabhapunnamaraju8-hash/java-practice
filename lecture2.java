import java.util.*;
public class lecture2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an Adult");
        }

        int marks = sc.nextInt();
        if (marks <101 && marks >= 100) {
            System.out.println("A grade");
        } else if (marks <=90){
            System.out.println("B grade");
        } else if(marks <=80) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail..");
        }

        int num = 3;
        if (num%2==0){
            System.out.println("even");
        } else {
            System.out.println("Bazinga");
        }

        int button = sc.nextInt();
        // if(button == 1) {
        //     System.out.println("Hello!");
        // } else if (button == 2) {
        //     System.out.println("Namaste!");
        // } else if (button == 3) {
        //     System.out.println("Bonjour!!");
        // } else {
        //     System.out.println("Invalid option");
        // }

        switch(button) {
            case 1 : System.out.println("hello!!!");
            break;
            case 2: System.out.println("namaste!!!");
            break;
            case 3: System.out.println("Bonjour!!!"); 
            default  : System.out.println("Invalid button!");
        }
    }
}
