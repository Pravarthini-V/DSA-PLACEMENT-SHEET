public class prims {
    public static void main(String[] args) {
       int num=40;
       if(num<=2){
           System.out.println("prime");
       }
       int dis=1;
       while(true){
        if(isprime(num-dis)){
            System.out.println(num-dis+" ");
        }
        if(isprime(num+dis)){
            System.out.println(num-dis+" ");
            return;
        }
           dis++;
       }

    }
    public static boolean isprime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
