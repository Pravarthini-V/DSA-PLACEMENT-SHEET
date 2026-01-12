

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of element");
       int n=sc.nextInt();
       int array[]=new int[n];
       for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
       }
       int secondlargest=Integer.MIN_VALUE;
       int largest=array[0];
       for(int i=0;i<n;i++){
        if(largest<array[i]){
            secondlargest=largest;
            largest=array[i];
        }
        else if(largest!=secondlargest&&secondlargest<array[i]){
            secondlargest=array[i];
        }
       }
       System.out.println("Second largest element "+secondlargest);
    }
}
