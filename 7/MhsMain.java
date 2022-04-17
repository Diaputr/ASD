package minggu7;
import java.util.Scanner;
public class MhsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputl = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("\tInput Data Mahasiswa (NIM Ascending)");
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah data : ");
        int jml = input.nextInt();
        PencarianMhs data = new PencarianMhs(jml);
        
        for(int i=0; i<jml; i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM : ");
            int nim = input.nextInt();
            
            System.out.print("Nama : ");
            String nama = inputl.nextLine();
            
            System.out.print("Umur : ");
            int umur = input.nextInt();
            
            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            
            System.out.println("----------------------------------------------------");
            Mhs m = new Mhs(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("\t     Urutan Data Seluruh Mahasiswa");
        System.out.println("----------------------------------------------------");
        data.bubbleSort(); //1
        data.tampil();
        
        System.out.println("\t\t   Pencarian data");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukkan NIM mahasiswa yang dicari : "); 
        int cari = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Nama mahasiswa yang dicari : "); //2
        String temu = inputl.nextLine();
        
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t  Sequential Search");
        System.out.println("----------------------------------------------------");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t    Binary Search");
        System.out.println("----------------------------------------------------");
        posisi = data.findBinarySearch(cari, 0, jml-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
        System.out.println("----------------------------------------------------");
        System.out.println("\t       Name Sequential Search");
        System.out.println("----------------------------------------------------");
        posisi = data.findSeqName(temu);
        data.tampilPos(temu, posisi);
        data.tampilNama(temu, posisi);
    }
}
