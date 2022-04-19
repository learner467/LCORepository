public class AA_Recursion {
    
   public static void main(String[] args) {
    AA_Loggging.lineBreak();   
    AA_Loggging.log("AA_Recursion", "main", "START");
    AA_Loggging.lineBreak();

    AA_Loggging.log("AA_Recursion", "main", "Before Calling testRecursionTop :::::::::::::::::::");
    testRecursionTop(3);
    AA_Loggging.log("AA_Recursion", "main", "After Calling testRecursionTop ::::::::::::::::::::");

    AA_Loggging.lineBreak(2);
    
    AA_Loggging.log("AA_Recursion", "main", "Before Calling testRecursionBottom ::::::::::::::::");
    testRecursionBottom(3);
    AA_Loggging.log("AA_Recursion", "main", "After Calling testRecursionBottom :::::::::::::::::");

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
}
