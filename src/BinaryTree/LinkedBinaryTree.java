
package BinaryTree;

import java.lang.reflect.Method;

public class LinkedBinaryTree extends ExtendedLinkedBinaryTree{
    BinaryTreeNode root;
    
    static Method visit;
    static Object[] visiArgs = new Object[1];
    
    static int count;
    static Class [] paramType = {BinaryTreeNode.class};
    
    static Method theAdd1;
    static Method theOutput;
    
    static {
        try {
            Class lbt = LinkedBinaryTree.class;
            theAdd1 = lbt.getMethod("add1", paramType);
            theOutput = lbt.getMethod("output", paramType);
        } catch (Exception e) {
            //not possible
        }
    }
    
    public static void output(BinaryTreeNode t){   
        System.out.println(t.element + " ");    }
    
    public static void add1(BinaryTreeNode t){
        count++;}
    public void makeTree(Object root, Object left, Object right){
        this.root = new BinaryTreeNode(root, ((LinkedBinaryTree) left).root, ((LinkedBinaryTree) right).root);
    }
    public BinaryTree removeLeftSubtree(){
        LinkedBinaryTree leftSubtree = new LinkedBinaryTree();
        leftSubtree.root = root.leftChild;
    return(BinaryTree) leftSubtree;
    }
    
    public int size(){
        count = 0;
        preorder(theAdd1);
        return count;
    }
    
    public int height(){
        return theHeight(root);
    }
    
    static int theHeight(BinaryTreeNode t){
        if(t == null) return 0;
        int hl = theHeight(t.leftChild);
        int hr = theHeight(t.rightChild);
        if(hl > hr) return ++hl;
        else return ++hr;
    }
    
    public void preorder(Method visit){
        this.visit = visit;
        thepreorder(root);
    }
    static void thepreorder(BinaryTreeNode t){
        if(t != null){
            visiArgs[0] = t;
            try {
                visit.invoke(null, visiArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
            thepreorder(t.leftChild);
            thepreorder(t.rightChild);
        }
    }
    public void preorderoutput(){
        preorder(theOutput);
    }
    
    public void inorder(Method visit){
        this.visit = visit;
        theinorder(root);
    }
    static void theinorder(BinaryTreeNode t){
        if(t != null){
            theinorder(t.leftChild);
            visiArgs[0] = t;
            try {
                visit.invoke(null, visiArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
            theinorder(t.rightChild);
        }
    }
    public void inorderoutput(){
        inorder(theOutput);
    }
    
    public void postorder(Method visit){
        this.visit = visit;
        thepostorder(root);
    }
    static void thepostorder(BinaryTreeNode t){
        if(t != null){
            thepostorder(t.leftChild);
            thepostorder(t.rightChild);
            visiArgs[0] = t;
            try {
                visit.invoke(null, visiArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void postorderoutput(){
        postorder(theOutput);
    }
    
    
}
