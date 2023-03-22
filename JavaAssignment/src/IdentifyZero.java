import java.util.Random;

public class IdentifyZero {
    public static void main(String[] args) {
        Random random=new Random();
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int max=arr[0];
        
            for(int i=1;i<10;i++)
            if(max<arr[i])
                max=arr[i];
        
            Boolean []hash=new Boolean[max+1];
        for(int i=0;i<arr.length;i++) hash[arr[i]]=true;
        
            arr[random.ints(1,10).findFirst().getAsInt()]=0;
        
            for(int i=0;i<arr.length;i++) hash[arr[i]]=false;
        
            for(int i=0;i<hash.length;i++)
            if(hash[i])
            System.out.println("missing number :"+i);
    }
}
