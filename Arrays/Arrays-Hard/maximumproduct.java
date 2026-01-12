import java.util.Scanner;

public class maximumproduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max=0;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=array[i];
            suffix*=array[i];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        System.out.println(max);
    }
}
