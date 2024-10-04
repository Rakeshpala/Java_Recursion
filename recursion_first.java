public class recursion_first{
    
    static int factorial(int n){
        if (n == 0) {
            return 1;
        } 
        int fact = factorial(n-1);
        int fact_2 =  n*fact;
        return fact_2;
    }

    static int fibonacci(int n){
         if(n==0){
            return 0;
         }
         else if(n==1){
            return 1;
         }

         else{
          return  fibonacci(n-1)+fibonacci(n-2);
         }
    }

public static void main(String[] args){
        //  int result = recursion_first.factorial(5);
        //  System.out.println(result);

        
        int count =10;
        for(int i=0;i<=count;i++){
            System.out.print(fibonacci(i)+" ");
        }
    
}
}