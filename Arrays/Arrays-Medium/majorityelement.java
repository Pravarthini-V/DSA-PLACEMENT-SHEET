import java.util.Scanner;

public class majorityelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter no of element");
        int n=sc.nextInt();
         int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 
        int maxcount=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n-1;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
                if(count>n/2){
                    maxcount=count;
                    System.out.println(array[i]);
                    break;
                
            }
        }
        
    }
}
