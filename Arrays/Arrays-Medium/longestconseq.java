import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class longestconseq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter no of element");
        int n=sc.nextInt();
         int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(array[i]);
        }
        int longest=1;
        for(int it:set){
           
            if(!set.contains(it-1)){
               int count=1;
                int x=it;
            
            while(set.contains(x+1)){
                count++;
                x=x+1;
            }
            longest=Math.max(longest,count);
        }
        }
        System.out.println(longest);
    }
}
