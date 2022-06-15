package minggu14;
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        
        bta.add(10);
        bta.add(23);
        bta.add(16);
        bta.print();
        
        System.out.print("Pre Order : ");
        bta.traversePreOrder(0);
        
        System.out.print("\nIn Order : ");
        bta.traverseInOrder(0);
        
        System.out.print("\nPost Order : ");
        bta.traversePostOrder(0);
    }
}