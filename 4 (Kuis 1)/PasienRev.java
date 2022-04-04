package latihan;
import java.util.Scanner;
public class PasienRev {
    Scanner input = new Scanner(System.in);
    String nama[];
    int umur[];
    int[] hargaObat = new int[5];

    PasienRev() {
    }
 
    PasienRev(String n[], int u[], int[] o){
        nama = n;
        umur = u;
        hargaObat = o;
    }
    
    int hitungTotalObat(){
        int count=0;
        for(int i=0; i<hargaObat.length; i++){
            count += hargaObat[i];
        }
        return count;
    }
    
    void hitungRata(){
        System.out.println("\nRata-rata harga obat >50 th");
        System.out.println("------------------------------");
        for(int i=0; i<umur.length; i++){
            if (umur[i] > 50){
                double rata = (double) hargaObat[i] / hargaObat.length;
                System.out.printf("%s dengan Rp.%.2f",nama[i], rata);
                System.out.println();
            }
        }
    }
    
    void tampilKecil(){
        int idx = 0;
        int min = hargaObat[idx];
        for(int i=1; i<hargaObat.length; i++){
            if(hargaObat[i] < min){
                min = hargaObat[i];
                idx = i;
            }
        }
        System.out.printf("\nHarga terkecil Rp.%d atas nama %s", min, nama[idx]);
        System.out.println();
    }
    
    void tampil(){
        for(int i=0; i<hargaObat.length; i++){
            System.out.println("Nama : "+nama[i]);
            System.out.println("Umur : "+umur[i]);
            System.out.printf("Total harga : Rp.%d\n",hargaObat[i]);
            System.out.println("------------------------------");
        }
    }
}