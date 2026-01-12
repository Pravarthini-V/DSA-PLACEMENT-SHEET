import java.util.Scanner;

public class setmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of elements");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean firstrow=false;
        boolean firstcolum=false;
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0){
                firstrow=true;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                firstcolum=true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if((matrix[i][0]==0)||(matrix[0][j]==0)){
                    matrix[i][j]=0;
                 }
            }
        }
        if(firstrow){
            for(int i=0;i<m;i++){
                 matrix[i][0]=0;
            }
        }
        if(firstcolum){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
