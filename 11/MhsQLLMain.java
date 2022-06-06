package minggu11;
import java.util.Scanner;
public class MhsQLLMain {
    static void menu(){
        System.out.println("-----------------------------------");
        System.out.println("\t--- PILIH MENU ---");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek semua antrian");
        System.out.println("4. Cek antrian terdepan");
        System.out.println("5. Cek antrian terakhir");
        System.out.println("6. Cari indeks dengan NIM");
        System.out.println("7. Cari antrian dengan indeks");
        System.out.println("8. Keluar");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("   Program Antrian TTD untuk KRS");
        MhsQLL antriMhs = new MhsQLL();
        int pilih;
        do {
           menu(); 
           System.out.print("Masukkan pilihan : ");
           pilih = input.nextInt();
           System.out.println("-----------------------------------");
           switch(pilih){
                case 1:
                   input.nextLine();
                   System.out.print("NIM : ");
                   String nim = input.nextLine();
                   System.out.print("Nama : ");
                   String nama = input.nextLine();
                   System.out.print("Absen : ");
                   int absen = input.nextInt();
                   System.out.print("IPK : ");
                   double ipk = input.nextDouble();
                   Mhs mhs = new Mhs(nim, nama, absen, ipk);
                   input.nextLine();
                   antriMhs.enqueue(mhs);
                   break;
                case 2:
                    MhsNode dt = antriMhs.dequeue();
                    break;
                case 3:
                    antriMhs.print();
                    break;
                case 4:
                    antriMhs.peek();
                    break;
                case 5:
                    antriMhs.peekRear();
                    break;
                case 6:
                    input.nextLine();
                    System.out.print("Masukkan NIM : ");
                    String n = input.nextLine();
                    antriMhs.peekPosition(n);
                    break;
                case 7:
                    System.out.print("Masukkan indeks : ");
                    int idx = input.nextInt();
                    antriMhs.getData(idx);
                    break;
                case 8:
                    System.out.println("Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    break;
           }
        } while (pilih >= 1 && pilih <= 7 || pilih != 8);
    }    
}