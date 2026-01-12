

import java.util.Scanner;

public class movezerosend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(array[i]!=0){
                int temp=array[index];
                array[index]=array[i];
                array[i]=temp;
                index++;
            }
        }
        for(int a:array){
            System.out.println(a);
        }
    }

}
