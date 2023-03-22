import java.util.Random;
import java.util.Scanner;

public class IdentifyZero {

        public static void main(String[] args) {
            Random random=new Random();
            Scanner sc=new Scanner(System.in);
            int n=10 ,arr[]=new int[n];
            System.out.print(" enter the elements");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int bsum=0;
            for(int i=0;i<arr.length;i++) bsum+=arr[i];
            arr[random.ints(1,10).findFirst().getAsInt()]=0;
            int asum=0;
            for(int i=0;i<arr.length;i++) asum+=arr[i];
            System.out.println("missing number is:"+(bsum-asum));
        }
}
