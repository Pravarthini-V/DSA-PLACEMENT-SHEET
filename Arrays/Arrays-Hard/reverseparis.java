import java.util.ArrayList;
import java.util.Scanner;

public class reverseparis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(mergesort(0,n-1,array));
    }
    public static int mergesort(int low,int high,int array[]){  
        int count=0;
        if(low>=high) return count;
        int mid=(low+high)/2;
        count+=mergesort(low, mid, array);
        count+=mergesort(mid+1,high, array);
        count+=countpairs(low,mid,high,array);
        merge(low,mid,high,array);
        return count;
    }
    public static int countpairs(int low,int mid,int high,int array[]){
        int count=0;
        int left=low;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high&&array[i]>2*array[right]) right++;
             count+=(right-(mid+1));
        }
        return count;
    }
    public static void merge(int low,int mid,int high,int array[]){
        ArrayList<Integer>list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(array[left]<=array[right]){
                list.add(array[left]);
                left++;
            }
            else{
                list.add(array[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(array[left]);
            left++;
        }
        while(right<=high){
            list.add(array[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            array[i]=list.get(i-low);
        }
    }
}
