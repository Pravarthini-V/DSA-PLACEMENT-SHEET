import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twosum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 
        System.out.println("Enter the target");
        int k=sc.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<n;i++){
            int comple=k-array[i];
            if(map.containsKey(comple)){
                ans[0]=map.get(comple);
                ans[1]=i;
                break;
            }
            map.put(array[i],i);
        }
        System.out.println(ans[0]+" "+ans[1]+" ");
    }
}
