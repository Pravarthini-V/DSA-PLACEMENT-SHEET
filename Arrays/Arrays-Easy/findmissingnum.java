

import java.util.Scanner;

public class findmissingnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int xor1=0;
        int xor2=0;
         for(int i=0;i<n-1;i++){
              xor1=xor1^array[i];
              xor2=xor2^(i+1);
         }
         xor2=xor2^n;
         System.out.println(xor1^xor2);

    }
}
