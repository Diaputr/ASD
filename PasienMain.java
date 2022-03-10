package latihan;
import java.util.Scanner;
public class PasienMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pasien[] hargaObat = new Pasien[5];
        
        System.out.print("Masukkan jumlah pasien : ");
        int jml = input.nextInt();
        
        Pasien[] data = new Pasien[jml];
        for (int i=0; i<data.length; i++){
            
            data[i] = new Pasien();
            System.out.println("----------------------------");
            data[i].tampil();
            System.out.print("Harga obat 1 : Rp.");
            int a = input.nextInt();
            System.out.print("Harga obat 2 : Rp.");
            int b = input.nextInt();
            System.out.print("Harga obat 3 : Rp.");
            int c = input.nextInt();
            System.out.print("Harga obat 4 : Rp.");
            int d = input.nextInt();
            System.out.print("Harga obat 5 : Rp.");
            int e = input.nextInt();
            hargaObat[i] = new Pasien();
            /*double hitung = hargaObat[i].hitungTotalObat(a, b, c, d, e);
            System.out.println("Total harga Rp. "+hitung);
            System.out.println("----------------------------");
            
            if(data[i].umur > 50){
                double n=0, m=0;
                m+=i;
                n+= hitung/m;
                System.out.println("Rata-rata Rp."+n);
                
                int p = 0;
                if(p<hitung){
                    System.out.println("Harga terkecil Rp."+hitung);
                }
            }*/
        }
    }
}