

import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int index=0;
        for(int j=0;j<n-1;j++){
            if(array[j]!=array[j+1]){
                array[index]=array[j];
                index++;
            }
        }
        array[index]=array[array.length-1];
        for(int i=0;i<=index;i++){
        System.out.println(array[i]);
        }
    }
    /*brute force is the intiazle the set add the elements if the element is already there donot
    add the element the next element in the array[index] where add to that and index=0 */
}
