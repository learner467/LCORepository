public class AA_Recursion {
    
    static boolean stopExec=false;
   public static void main(String[] args) {
    AA_Loggging.lineBreak();   
    AA_Loggging.log("AA_Recursion", "main", "START");
    AA_Loggging.lineBreak();

    if(stopExec){
        AA_Loggging.log("AA_Recursion", "main", "Before Calling testRecursionTop :::::::::::::::::::");
        testRecursionTop(3);
        AA_Loggging.log("AA_Recursion", "main", "After Calling testRecursionTop ::::::::::::::::::::");
    
        AA_Loggging.lineBreak(2);
        
        AA_Loggging.log("AA_Recursion", "main", "Before Calling testRecursionBottom ::::::::::::::::");
        testRecursionBottom(3);
        AA_Loggging.log("AA_Recursion", "main", "After Calling testRecursionBottom :::::::::::::::::");
    
        AA_Loggging.lineBreak(2);

        AA_Loggging.log("AA_Recursion", "main", "Fatorial of 5 is ::"+getFactorial(5));
  
        AA_Loggging.lineBreak(2);
    
        int n=10;
        System.out.print("AA_Recursion:main::Fibonacci Till "+n+"th place is: 0, 1, ");
        fibonacci(n-2,0,1);

        AA_Loggging.lineBreak(2);
    
        int base=3;
        int power =5;
        System.out.print("AA_Recursion:main:: "+base +" to the power "+power+" is : "+getPower(base,power));

        AA_Loggging.lineBreak(2);
    
        int n1=6;
        int r=3;
        System.out.print("AA_Recursion:main:: Combination of "+n1+" C "+r+" is : "+getCombination(n1,r));
    }
    
    AA_Loggging.lineBreak(2);



    AA_Loggging.lineBreak();
    AA_Loggging.log("AA_Recursion", "main", "END");
    AA_Loggging.lineBreak();

   }

   public static void testRecursionTop(int n){
        if(n>0){
            testRecursionTop(n-1);
            AA_Loggging.log("AA_Recursion", "testRecursionTop", " "+n);        
        }
   }

   public static void testRecursionBottom(int n){
    if(n>0){
        AA_Loggging.log("AA_Recursion", "testRecursionBottom", " "+n);
        testRecursionBottom(n-1);
    }
   }
   
    public static int getFactorial(int n){
            if(n==1){
                return 1;
            }else{
                return n*getFactorial(n-1);   
            }       
    }

    public static void fibonacci(int numberOfElements, int n, int m){
        if(numberOfElements>0){
            System.out.print(n+m+", ");
            fibonacci(numberOfElements-1,m, n+m);
        }
    }
    //Power Program
    public static int getPower(int base,int power) {
        
        if(power==0)
            return 1;
        else
            return getPower(base,power-1)*base;

    }

    public static int getCombination(int n,int r){
        return getFactorial(n)/(getFactorial(r)*getFactorial(n-r));
    }

    //Tower of Hanoi Problem

    public static void towerOfHanoi(int n,int r){
       
    }

}
