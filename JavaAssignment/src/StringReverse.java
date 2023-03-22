import java.util.Scanner;

public class StringReverse {
    public static String reverse(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        String srv1=sb.toString();
        String srv2=StringReverse.reverse(s);
        System.out.println("reverse using built-in method:"+srv1);
        System.out.println("reverse using user defind in method:"+srv2);

    }
}
