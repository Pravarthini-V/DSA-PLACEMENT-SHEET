
import java.util.HashMap;
import java.util.Scanner;

public class longestsubarrayk {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the sum");
        int k=sc.nextInt();
        int maxlen=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=array[i];
            if(sum==k){
                maxlen=i+1;
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
              maxlen=  Math.max(maxlen,len);
            }
            if(!map.containsKey(rem))
            map.put(sum,i);
        }
        System.out.println(maxlen);
    }
}
