import java.util.Scanner;

public class lecture4 {
    public static void main (String[]args){
        
       for(int i =0; i <=5; i++){
        System.out.println("Hello World!!");
    }
    for(int counter = 0; counter <9; counter++) {
         System.out.println(counter);
    }

    int j = 0;
    while(j < 11){
        System.out.println(j);
        j++;   
        }
    int k =0;
    do{
        System.out.println(k);
        k++;
    } while(k <11);


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    for (int i =0; i<=n; i++) {
       sum =sum +i;  
    }
    System.out.println(sum);

     Scanner scn = new Scanner(System.in);
    int m = sc.nextInt();
    for( int l = 1; l<11; l++){
        System.out.println(n*l);
    }
    }
    }
