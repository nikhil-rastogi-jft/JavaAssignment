import java.util.Random;

public class IdentifyZero {
        public static Integer missing(int arr[]){
            for(int i=0;i< arr.length;i++)
                if(arr[i]==0) return i+1;
            return null;
        }
        public static void main(String[] args) {
            Random random=new Random();
            int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
            arr[random.ints(1,10).findFirst().getAsInt()]=0;
            System.out.println("missing number is:"+missing(arr));
        }
}
