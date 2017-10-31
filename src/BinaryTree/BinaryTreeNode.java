
package BinaryTree;

public class BinaryTreeNode {
    Object element;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;

    public BinaryTreeNode() {
    }
    
    public BinaryTreeNode(Object n)
     {
         leftChild = null;
         rightChild = null;
         element = n;
     }

    public BinaryTreeNode(Object element, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.element = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
