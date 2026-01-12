package Arrays;

import java.util.Scanner;

public class leftrotatedbyoneplace {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of elements");
    int n=sc.nextInt();
    int array[]=new int[n];
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    int temp=array[0];
    for(int i=0;i<n-1;i++){
        array[i]=array[i+1];
    }
    array[array.length-1]=temp;
    for(int i=0;i<n;i++){
        System.out.println(array[i]);
    }
 }   
}
