import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("numbers are :"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers after swapping are :"+a+" "+b);
    }
}
