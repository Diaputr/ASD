package minggu10;
import java.util.Scanner;
public class MhsQueueMain {
    
    static void menu(){
        System.out.println("-----------------------------------");
        System.out.println("\t--- PILIH MENU ---");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek semua antrian");
        System.out.println("4. Cek antrian terdepan");
        System.out.println("5. Cek antrian terakhir");
        System.out.println("6. Cek posisi tertentu");
        System.out.println("7. Cek antrian dengan indeks");
        System.out.println("-----------------------------------");
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("   Program Antrian TTD untuk KRS");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan kapasitas antrian : ");
        int jml = input.nextInt();
        input.nextLine();
        MhsQueue antriMhs = new MhsQueue(jml);
        int pilih;
        do {
           menu(); 
           System.out.print("Masukkan pilihan : ");
           pilih = input.nextInt();
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
                   Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                   input.nextLine();
                   antriMhs.Enqueue(mhs);
                   break;
                case 2:
                    Mahasiswa data = antriMhs.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0){
                        System.out.println("Antrian yang dikeluarkan : "+data.nim+" | "+data.nama+" | "+data.absen+" | "+data.ipk);
                    }
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
                    antriMhs.printMhs(idx);
                break;
           }
        } while (pilih >= 1 && pilih <= 7);
    }    
}