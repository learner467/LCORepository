package com.dsa.recursion;
public class TowerOfHanoi{

    public static void main(String[] args) {
        towerOfHanoiWithRecusrion(4,'A','C','B');
    }

    public static void towerOfHanoiWithRecusrion(int noOfDisks,char fromRod, char toRod, char tempRod){
       
        
        if(noOfDisks==1){  
           
            System.out.println("Move disk "+noOfDisks+" from rod "+fromRod+" to rod "+toRod);             
        }else{
            towerOfHanoiWithRecusrion(noOfDisks-1, fromRod,tempRod,toRod);
            System.out.println("Move disk "+noOfDisks+" from rod "+fromRod+" to rod "+toRod);       
            towerOfHanoiWithRecusrion(noOfDisks-1, tempRod,toRod,fromRod); 
        }
    }

    public static void towerOfHanoiWithOutRecusrion(){
        
    }
}