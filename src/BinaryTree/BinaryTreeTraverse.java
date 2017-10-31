
package BinaryTree;

public class BinaryTreeTraverse implements Cloneable{
    BinaryTreeNode root;
    
    public static void visit(BinaryTreeNode t) {
        System.out.print(t.element+" ");
    }
    
    public void insert(Object data)
     {
         root = insert(root, data);
     }
    
    private BinaryTreeNode insert(BinaryTreeNode node, Object data)
     {
         if (node == null)
             node = new BinaryTreeNode(data);
         else
         {
             if (node.rightChild == null)
                 node.rightChild = insert(node.rightChild, data);
             else
                 node.leftChild = insert(node.leftChild, data);             
         }
         return node;
     }     
    
    public void preOrder(){
        preOrder(root);
    }
    public static void preOrder(BinaryTreeNode t) {
        if(t != null){
            visit(t);
            preOrder(t.leftChild);
            preOrder(t.rightChild);
        }
    }
    
    public void inOrder(){
        preOrder(root);
    }
    public static void inOrder(BinaryTreeNode t) {
        if(t != null){
            inOrder(t.leftChild);
            visit(t);
            inOrder(t.rightChild);
        }
    }
    
    public void postOrder(){
        postOrder(root);
    }
    public static void postOrder(BinaryTreeNode t) {
        if(t != null){
            postOrder(t.leftChild);
            postOrder(t.rightChild);
            visit(t);
        }
    }
    
    public Object clone(){
         try {         
             return super.clone();
         } catch (CloneNotSupportedException ex) {
             throw new Error("Error");
         }
    }    
    
    public void clonepostorder(){
        clone();
        postOrder();
    }
    
    public void infix(){
        infix(root);
    }
    public static void infix(BinaryTreeNode t){
        if(t != null){
            infix(t.leftChild);
            System.out.print(t.element);
            infix(t.rightChild);
        }
    }
    
    public void postfix(){
        postfix(root);
    }
    public static void postfix(BinaryTreeNode t){
        if(t != null){
            infix(t.leftChild);
            infix(t.rightChild);
            System.out.print(t.element);
        }
    }
    
    
//    public static void infix(BinaryTreeNode t) {
//        if(t != null){
//            System.out.println("(");
//            infix(t.leftChild);
//            System.out.println(t);
//            infix(t.leftChild);
//            System.out.println(")");
//        }
//    }
}
