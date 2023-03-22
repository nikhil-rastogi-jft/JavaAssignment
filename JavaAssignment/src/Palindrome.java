import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int rev=0,temp=n;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(rev==n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(isPalindrome(n)) System.out.println("number is palindrome");
        else System.out.println("number is not palindrome");
    }
}