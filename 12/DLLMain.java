package minggu12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        try {
            dll.add(40, 1);
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        
        //3
        try {
            System.out.println("Data awal pada linked lists : "+dll.getFirst());
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Data akhir pada linked lists : "+dll.getLast());
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Data indeks ke-1 pada linked lists : "+dll.get(1));
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("==========================================");
        
        //2
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        try {
            dll.removeFirst();
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        try {
            dll.removeLast();
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==========================================");
        try {
            dll.remove(1);
        } catch (Exception ex) {
            Logger.getLogger(DLLMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+dll.size());
    }
}