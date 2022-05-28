package minggu10;
import java.util.Scanner;
public class NasabahMain {
    
    static void menu(){
        System.out.println("--- PILIH MENU ---");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Hapus antrian");
        System.out.println("6. Cek antrian terakhir");
        System.out.println("-----------------------------------");
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian : ");
        int jml = input.nextInt();
        input.nextLine();
        NasabahQueue antri = new NasabahQueue(jml);
        int pilih = 0;
        do {
           menu(); 
           System.out.print("Masukkan pilihan : ");
           pilih = input.nextInt();
           switch(pilih){
                case 1:
                   input.nextLine();
                   System.out.print("No. rekening : ");
                   String norek = input.nextLine();
                   System.out.print("Nama : ");
                   String nama = input.nextLine();
                   System.out.print("Alamat : ");
                   String alamat = input.nextLine();
                   System.out.print("Umur : ");
                   int umur = input.nextInt();
                   System.out.print("Saldo : ");
                   double saldo = input.nextDouble();
                   Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                   input.nextLine();
                   antri.Enqueue(nb);
                   break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("Antrian yang dikeluarkan : "+data.norek+" | "+data.nama+" | "+data.alamat+" | "+data.umur+" | "+data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.clear();
                    break;
                case 6:
                    antri.peekRear();
                    break;
           }
        } while (pilih >= 1 && pilih <= 6);
    }
}