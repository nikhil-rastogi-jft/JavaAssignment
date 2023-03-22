import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("elements are:");
        for(int i=0;i<n;i++)
            System.out.print(" "+arr[i]);
        System.out.println("\n Sum is :"+sum);
    }
}