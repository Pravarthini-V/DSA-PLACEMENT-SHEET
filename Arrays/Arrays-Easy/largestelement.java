

import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("largest element "+max);
    }
}
