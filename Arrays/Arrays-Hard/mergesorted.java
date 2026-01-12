

public class mergesorted {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        int array1[]={1,2,3,4};
        int array2[]={5,6,7,8,9};
        int temp[]=new int[n+m];
        int left=n-1;
        int right=m-1;
        int len=n+m-1;
        while(left>=0 && right>=0){
            if(array1[left]>=array2[right]){
                temp[len--]=array1[left--];
            }
            else if(array2[right]>=array1[left]){
                temp[len--]=array2[right--];

            }
        }
        while(right>=0){
            temp[len--]=array2[right];
            right--;
        }
        while(left>=0){
            temp[len--]=array1[left];
            left--;
        }
        for(int ns:temp){
            System.out.println(ns);
        }
        

    }
}
