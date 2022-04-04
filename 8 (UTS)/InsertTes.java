package minggu8;
import java.util.Scanner;
public class InsertTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        Insertion urut = new Insertion(a, a.length);
        System.out.println("Contoh Array");
        urut.tampil();
        System.out.println("Array yang diurutkan");
        System.out.println("Ascending");
        urut.InsertSortA();
        urut.tampil();
        System.out.println("Descending");
        urut.InsertSortD();
        urut.tampil();
        
        System.out.print("\nMasukkan jumlah  data : ");
        int n = input.nextInt();
        int b[] = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.printf("Masukkan data %d : ",(i+1));
            b[i] = input.nextInt();
        }
        
        System.out.println("\nData yang diurutkan");
        Insertion inputan = new Insertion(b, n);
        System.out.println("Ascending");
        inputan.InsertSortA();
        inputan.tampil();
        System.out.println("Descending");
        inputan.InsertSortD();
        inputan.tampil();
    }
}