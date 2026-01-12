

import java.util.Scanner;

public class leftrotatebyDplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the no of elements to change");
        int k=sc.nextInt();
        System.out.println("To rotate right or left ans left or right");
        sc.nextLine();
        String direction=sc.nextLine();
        int result[]=rotatebydirection(array,k,direction);
        for(int res:result){
            System.out.println(res);
        }
    }
    public static int[] rotatebydirection(int array[],int k,String direction){
        if(direction.equals("right")){
            int temp[]=new int[k];
              int n=array.length;
               k=k%n;
            if(k<0 && k>n) return array;
          
            int index=0;
            for(int i=(n-k);i<n;i++){
                temp[index++]=array[i];
            }
            for(int i=(n-k-1);i>=0;i--){
                array[i-k]=array[i];
            }
            for(int i=0;i<k;i++){
                array[i]=temp[i];
            }   
            return array;
        }
        else{
            int temp[]=new int[k];
            int n=array.length;
            k=k%n;
            if(k<0 && k>n) return array;
            int index=0;
            for(int i=0;i<k;i++){
                temp[index++]=array[i];
            }
            for(int i=k;i<n;i++){
                array[i-k]=array[i];
            }
            for(int i=0;i<k;i++){
                array[n-k+i]=temp[i];
            }
        return array;
        }
    }
}
