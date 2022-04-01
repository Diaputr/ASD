package minggu7;
import java.util.Scanner;
public class MhsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("  Input Data Mahasiswa (NIM Ascending)");
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah data : ");
        int jml = input.nextInt();
        PencarianMhs data = new PencarianMhs(jml);
        
        for(int i=0; i<jml; i++){
            System.out.print("NIM : ");
            int nim = input.nextInt();
            
            System.out.print("Nama : ");
            String nama = input.nextLine();
            input.nextLine();
            
            System.out.print("Umur : ");
            int umur = input.nextInt();
            
            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            
            System.out.println("---------------------------------------");
            Mhs m = new Mhs(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("    Urutan Data Seluruh Mahasiswa");
        System.out.println("---------------------------------------");
        data.bubbleSort(); //1
        data.tampil();
        
        System.out.println("\t    Pencarian data");
        System.out.print("Masukkan NIM mahasiswa yang dicari : "); 
        int cari = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Nama mahasiswa yang dicari : "); //2
        String temu = input.nextLine();
        
        System.out.println("---------------------------------------");
        System.out.println("\t   Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
        data.findSeqName(temu);
        data.tampilPos(temu, posisi);
        data.tampilNama(temu, posisi);
        
        System.out.println("---------------------------------------");
        System.out.println("\t    Binary Search");
        posisi = data.findBinarySearch(cari, 0, jml-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}