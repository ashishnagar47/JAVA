package Binary_tree;

import com.sun.source.tree.BinaryTree;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class binaryTree {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        binaryTree bt=new binaryTree();
        BinaryTree tree1=bt.new BinaryTree();
        BinaryTree tree2=bt.new BinaryTree();
        System.out.println(tree1.identical(tree2));
    }
    private class BinaryTree {
        private Node root;
        private int size;
        private class Node {
             Node left;
             Node right;
             int data;
        }

        public BinaryTree() {
            this.root = takeInput(null, false);
        }

        private Node takeInput(Node parent, boolean ilc) {
            int cdata = s.nextInt();
            Node child = new Node();
            child.data=cdata;
            this.size++;

            boolean left = s.nextBoolean();
            if (left) {
                child.left = takeInput(child, true);
            }
            boolean right = s.nextBoolean();
            if (right) {
                child.right = takeInput(child, false);
            }
            return child;
        }
        public boolean identical(BinaryTree other){
            return identical(this.root,other.root);
        }
        private boolean identical(Node tnode,Node onode){
            if(tnode==null&&onode==null){
                return true;
            }
            if (tnode != null && onode != null)
                return (tnode.data == onode.data
                        && identical(tnode.left, onode.left)
                        && identical(tnode.right, onode.right));

            /* 3. one empty, one not -> false */
            return false;
        }
        }
    }