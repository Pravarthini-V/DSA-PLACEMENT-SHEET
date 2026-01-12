

import java.util.Scanner;

public class checkifarraysorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
             
             found=true;
                break;
            }
        }
        if(found) System.out.println("not sorted");
        else System.out.println("sorted");

       
    }   
}
