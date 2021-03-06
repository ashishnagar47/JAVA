package BST;

//public class BstWithGenerics {
//    private BstWithGenerics.
//            private Node root;
//
//    public void insert(int val){
//        this.root= insert(root,val);
//    }
//
//    private BST.BST.Node insert(BST.BST.Node node, int val) {
//
//        if(node==null){
////            Node node1 =new Node(value);
//            return new BST.BST.Node(val);
//        }
//
//        if(node.value>val){
//            node.left=insert(node.left,val);
//        }
//
//        else{
//            node.right=insert(node.right,val);
//        }
//
//        node.height= Math.max(height(node.left),height(node.right))+1;
//
//        node=balancefactor(node);
//        return node;
//    }
//
//    private BST.BST.Node balancefactor(BST.BST.Node node) {
//
//        if(height(node.left)-height(node.right)>1){
//
//            if(height(node.left.left)-height(node.left.right)<0){
//
//                node.left=leftrotation(node.left);
//            }
//
//            return rightrotation(node);
//        }
//
//        if (height(node.left) - height(node.right) < -1) {
//
//            if(height(node.right.left)-height(node.right.right)>0){
//
//                node.right=rightrotation(node.right);
//            }
//
//            return leftrotation(node);
//        }
//
//        return node;
//    }
//
//    public void preorder(){
//        preorder(root,"");
//    }
//
//    private void preorder(BST.BST.Node node, String indent){
//
//        if(node==null){
//            return;
//        }
//
//        System.out.println(indent+node.value);
//
//        preorder(node.left,indent+"\t");
//        preorder(node.right,indent+"\t");
//
//    }
//
//
//    private BST.BST.Node leftrotation(BST.BST.Node y){
//
//        BST.BST.Node x =y.right;
//        BST.BST.Node temp= x.left;
//
//        x.left=y;
//        y.right=temp;
//
//        y.height=Math.max(height(y.left),height(y.right))+1;
//        x.height=Math.max(height(x.left),height(x.right))+1;
//
//        return x;
//    }
//
//    private BST.BST.Node rightrotation(BST.BST.Node x){
//        BST.BST.Node y= x.left;
//        BST.BST.Node temp=y.right;
//
//        y.right=x;
//        x.left=temp;
//
//        x.height=Math.max(height(x.left),height(x.right))+1;
//        y.height=Math.max(height(y.left),height(y.right))+1;
//
//        return y;
//    }
//
//    private int height(BST.BST.Node node){
//
//        if(node==null){
//            return 0;
//        }
//
//        return node.height;
//    }
//
//    public boolean isbalanced(){
//        return isbalanced(this.root);
//    }
//
//    private boolean isbalanced(BST.BST.Node node) {
//
//        if(node==null){
//            return true;
//        }
//
//        int diff= Math.abs(height(node.left)-height(node.right));
//
//        if(diff>1){
//            return false;
//        }
//
//        boolean left=isbalanced(node.left);
//        boolean right=isbalanced(node.right);
//
//        return left && right;
//    }
//
//
//    private class Node{
//
//        int value;
//        BST.BST.Node left;
//        BST.BST.Node right;
//        int height;
//
//        public Node(int value) {
//            this.value = value;
//            this.height=1;
//        }
//    }
//}

