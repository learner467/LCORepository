package com.dsa.binarysearchtree;

public class BinarySearchTree {
    
    Node root=null;

    class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data=data;
        }
    }

    public void insert(int data){
        insertNode(data,root);
    }

    public void insert(int[] data){
        for(int d:data){
            insertNode(d,root);
        }
        
    }


    private void insertNode(int data, Node baseNode){
        
        if(root==null){
            Node newNode=new Node(data);
            root=newNode;
            return;
        }

        if(data < baseNode.data ){
            if(baseNode.left==null){
                Node newNode=new Node(data);
                baseNode.left=newNode;
            }else{
                insertNode(data, baseNode.left);
            }
        }else if(data >= baseNode.data ){
            if(baseNode.right==null){
                Node newNode=new Node(data);
                baseNode.right=newNode;
            }else{
                insertNode(data, baseNode.right);
            }
        }
    }

    public void printBSTree(){
        if(root==null){
            System.out.println("Tree is empty.");
            return;
        }
        System.out.println("Tree is : ");
        printBSTree(root);
        System.out.println(" \n");
    }

    private void printBSTree(Node currNode){
      
        System.out.print(" "+currNode.data);

        if(currNode.left!=null){
            printBSTree(currNode.left);
        }
        if(currNode.right!=null){
            printBSTree(currNode.right);
        }
       
    }

    public void printInOrder(Node currNode){
        if(currNode==null){
            return;
        }
        if(currNode.left!=null){
            printInOrder(currNode.left);
        }

        System.out.print(" "+currNode.data);

        if(currNode.right!=null){
            printInOrder(currNode.right);
        }
    }

    public void printInOrder(){
        if(root==null){
            System.out.println("Tree is empty.");
            return;
        }
        System.out.println("Tree in InOrder is : ");
        printInOrder(root);
        System.out.println(" \n ");
    }

    public void printPreOder(Node currNode){
        if(currNode==null){
            return;
        }
        System.out.print(" "+currNode.data);

        if(currNode.left!=null){
            printPreOder(currNode.left);
        }

        if(currNode.right!=null){
            printPreOder(currNode.right);
        }
    }

    public void printPreOder(){
        if(root==null){
            System.out.println("Tree is empty.");
            return;
        }
        System.out.println("Tree in Preorder is : ");
        printPreOder(root);
        System.out.println(" \n ");
    }

    public void printPostOder(Node currNode){
        if(currNode==null){
            return;
        }

        if(currNode.left!=null){
            printPostOder(currNode.left);
        }

        if(currNode.right!=null){
            printPostOder(currNode.right);
        }

        System.out.print(" "+currNode.data);
    }

    public void printPostOder(){
        if(root==null){
            System.out.println("Tree is empty.");
            return;
        }
        System.out.println("Tree in Post Order is : ");
        printPostOder(root);
        System.out.println(" \n ");
    }

    public void deleteByIP(int data ){
        deleteByIP(data,root);
    }
    private void deleteByIP(int data,Node currNode){
        
        if(root==null){
            System.out.println("Tree is empty.Can not proceed with deletion of "+data+" .");
            return;
        }


        if(currNode.data==data){
            Node replacementNode=getLargestElementOnRight(currNode.left);

        }else if(data<currNode.data){
            deleteByIP(data,currNode.left);
        }else if(data>currNode.data){
            deleteByIP(data,currNode.right);
        }
    }

    public Node getLargestElementOnRight(Node currNode){
        if(currNode.right==null){
            return currNode;
        }
        
        return getLargestElementOnRight(currNode.right);
    }

    public Node getLargestElementOnLeft(Node currNode){
        if(currNode.left==null){
            return currNode;
        }  
        return getLargestElementOnLeft(currNode.left);

    }

    public void deleteByIS(int data){

    }

    public static void main(String[] args) {
        
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.printBSTree();

        int[] data= {40,20,50,15,30,45,60,46,43,70,55,80,51,41,10,18,35,29,37,34,39};
        binarySearchTree.insert(data);
        binarySearchTree.printBSTree();

        binarySearchTree.printInOrder();
        binarySearchTree.printPreOder();
        binarySearchTree.printPostOder();

        
       
    }
}

//In Order Predecessor : Choose largest value from left
//In Order Successor : Choose smallest value from right