import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of element");
        int n=sc.nextInt();
         int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(array[mid]==0){
                int temp=array[mid];
                array[mid]=array[low];
                array[low]=temp;
                low++;
                mid++;
            }
            else if(array[mid]==1){
                mid++;
            }
            else{
                int temp=array[high];
                array[high]=array[mid];
                array[mid]=temp;
                high--;
            }

        }
        for(int a:array){
            System.out.println(a);
        }
    }
}
