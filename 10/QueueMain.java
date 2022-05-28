package minggu10;
import java.util.Scanner;
public class QueueMain {
    
    static void menu(){
        System.out.println("-----------------------------------");
        System.out.println("\t--- MENU OPERASI ---");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = input.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        boolean stop = false;
        do {
           menu(); 
           System.out.print("Masukkan pilihan : ");
           pilih = input.nextInt();
           switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = input.nextInt();
                    boolean tambah = Q.Enqueue(dataMasuk);
                    if(tambah == true){
                        stop = true;
                    }
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : "+dataKeluar);
                    } else {
                        stop = true;
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan data : ");
                    int dt = input.nextInt();
                    Q.peekPosition(dt);
                    break;
                case 7:
                    System.out.print("Masukkan indeks : ");
                    int idx = input.nextInt();
                    Q.peekAt(idx);
                    break;
           }
        } while((pilih >= 1 && pilih <= 7) && !stop);
    }
}