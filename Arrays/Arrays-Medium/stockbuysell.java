import java.util.Scanner;

public class stockbuysell {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter no of element");
        int n=sc.nextInt();
         int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 
        int minprice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(minprice>array[i]){
            minprice=Math.min(minprice,array[i]);
            }else{
            max=Math.max(max,array[i]-minprice);
            }

        }
        System.out.println(max);
        }
}
