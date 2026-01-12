import java.util.Scanner;



public class mergetwosorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        System.out.println("Enter the second no of elements");
        int m=sc.nextInt();
        int array1[]=new int[n+m];
        int array2[]=new int[m];
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        for(int i=n;i<n+m;i++){
            array1[i]=0;
        }
        for(int j=0;j<m;j++){
            array2[j]=sc.nextInt();
        }
        int len=m+n-1;
        int left=n-1;
        int right=m-1;
        while (left>=0&&right>=0) {
            if(array1[left]>=array2[right]){
                array1[len--]=array1[left--];
            }
            else{
                array1[len--]=array2[right--];
            }
        }
        while(right>=0){
            array1[len--]=array2[right--];
            
        }
        for(int a:array1){
            System.out.println(a);
        }
    }   
}
