package latihan;
import java.util.Scanner;
public class PasienRevMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PasienRev daftar = new PasienRev();
        int x = 5;
        int[] data = new int[x];
        int[] total = new int[x]; 
        String[] n = new String[x];
        int u[] = new int[x];
        
        for (int i=0; i<data.length; i++){
            System.out.println("PASIEN "+(i+1));
            System.out.print("Nama : ");
            n[i] = input.nextLine();
            System.out.print("Umur : ");
            u[i] = input.nextInt();
            for (int j=0; j<data.length; j++){
                System.out.printf("Harga obat %d : Rp.",(j+1));
                data[j] = input.nextInt();
                total[i] += data[j];
            }
            input.nextLine();
            daftar = new PasienRev(n, u, total);
            //daftar.total[i] = daftar.hitungTotalObat();
            total[i] = daftar.hargaObat[i];
            System.out.println("------------------------------");
        }
        System.out.println("\nSEMUA PASIEN");
        System.out.println("------------------------------");
        daftar.tampil();
        daftar.hitungRata();
        daftar.tampilKecil();
    }
}