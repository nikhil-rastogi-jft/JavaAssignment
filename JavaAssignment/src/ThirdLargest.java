import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:!");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int f=arr[0],s=0,t=0;
        for(int i=1;i<n;i++){
            if(f<arr[i]){
                t=s;
                s=f;
                f=arr[i];
            }
            else if(s<arr[i]){
                t=s;
                s=arr[i];
            }
            else t=arr[i];
        }
        System.out.println("Third largest number is:"+t);
    }
}
