import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pasacaltraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
        List<Integer>ds=new ArrayList<>();
           for(int j=1;j<=i;j++){
              ds.add(funcnr(i-1,j-1));
           }
           list.add(ds);
        }
        System.out.println(list);
    }
    public static int funcnr(int n,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(n-i)/(i+1);
        }
        return res;
    }
}
