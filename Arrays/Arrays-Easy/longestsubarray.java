

import java.util.Scanner;

public class longestsubarray {
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
        int right=0,left=0;
        int sum=0;
        for(right=0;right<n;right++){
              sum+=array[right];
              while(sum>k){
                sum-=array[left];
                 left++;
              }
              if(sum==k){
                 maxlen=Math.max(maxlen,right-left+1);
              }
        }
        System.out.println(maxlen);
    }
}
