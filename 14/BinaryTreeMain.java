package minggu14;
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        bt.insert(10);
        bt.insert(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        
        System.out.println("Cari "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println();
        
        bt.findMinMax();
        System.out.print("  Leaf : ");
        bt.printLeaf(bt.root);
        System.out.println("");
    }
}