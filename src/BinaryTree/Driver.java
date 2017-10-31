
package BinaryTree;

public class Driver {
    public static void main(String[] args) {
        BinaryTreeTraverse bt = new BinaryTreeTraverse();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        System.out.print("\nPre order : ");
        bt.preOrder();
        System.out.print("\nIn order : ");
        bt.inOrder();
        System.out.print("\nPost order : ");
        bt.postOrder();
        System.out.print("\nClone Post order : ");
        bt.clonepostorder();
        System.out.print("\nInfix : ");
        bt.infix();
        System.out.print("\nPostfix : ");
        bt.postfix();
        BinaryTreeTraverse btt = new BinaryTreeTraverse();
        //btt.clone(bt);
        
//        bt.Swap(bt.root);
//        System.out.println(bt.compare(bt.root, btt.root));
//        
        System.out.println("");
        System.out.println("Data 1");
        LinkedBinaryTree lb = new LinkedBinaryTree();
        lb.root = new BinaryTreeNode(1);
        lb.root.leftChild = new BinaryTreeNode(2);
        lb.root.rightChild = new BinaryTreeNode(3);
        System.out.println("\nPre order : ");
        lb.preorderoutput();
        System.out.println("\nIn order : ");
        lb.inorderoutput();
        System.out.println("\nPost order : ");
        lb.postorderoutput();
        
        System.out.println("");
        System.out.println("Data 2");
        LinkedBinaryTree lbt = new LinkedBinaryTree();
        lbt.root = new BinaryTreeNode(1);
        lbt.root.leftChild = new BinaryTreeNode(2);
        lbt.root.rightChild = new BinaryTreeNode(3);
        System.out.println("\nPre order : ");
        lbt.preorderoutput();
        System.out.println("\nIn order : ");
        lbt.inorderoutput();
        System.out.println("\nPost order : ");
        lbt.postorderoutput();
        System.out.println("Compare = " + lb.compare(lb.root, lbt.root));
        
        
        System.out.println("Data 3");
        System.out.print("Setelah Clone dari data 2");
        LinkedBinaryTree lbtt = (LinkedBinaryTree) lbt.clone();
        System.out.println("\nPre order : ");
        lbtt.preorderoutput();
        System.out.println("\nIn order : ");
        lbtt.inorderoutput();
        System.out.println("\nPost order : ");
        lbtt.postorderoutput();
        
        System.out.println("Setelah di Swap Data 3");
        lbtt.Swap(lbtt.root);
        System.out.println("\nPre order : ");
        lbtt.preorderoutput();
        System.out.println("\nIn order : ");
        lbtt.inorderoutput();
        System.out.println("\nPost order : ");
        lbtt.postorderoutput();
//        ba.postOrder();
//        System.out.println("");
//        ba.preOrder();
    }
}
