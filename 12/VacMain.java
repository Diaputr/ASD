package minggu12;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class VacMain {
    
    static void menu(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("\t --- MENU ---");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(" PENGANTRI VAKSIN EXTRAVAGANZA");
        VacDLL vaksinasi = new VacDLL();
        int pilih;
        do{
            menu();
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.print("Nomor Antrian : ");
                    int no = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Penerima : ");
                    String nama = input.nextLine();
                    Vaccine vk = new Vaccine(no, nama);
                    vaksinasi.enqueue(vk);
                    break;
                case 2:
                    System.out.println("------------------------------");
                    vaksinasi.dequeue();
                    break;
                case 3:
                    System.out.println("------------------------------");
                    vaksinasi.printAll();
                    break;
                case 4:
                    input.close();
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    break;
            }
        } while (pilih >= 1 && pilih <= 3 || pilih != 4);
    }
}