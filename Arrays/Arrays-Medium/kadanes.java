import java.util.Scanner;

public class kadanes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter no of element");
        int n=sc.nextInt();
         int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 
     long sum=0;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=array[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println((int)max);
    }
}
