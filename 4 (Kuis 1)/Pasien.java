package latihan;
import java.util.Scanner;
public class Pasien {
    Scanner input = new Scanner(System.in);
    String nama;
    int umur;
    int[] hargaObat;
    
    Pasien(String n, int u){
        nama = n;
        umur = u;
    }
    
    Pasien(){
        for (int i=0; i<5; i++){
        
        }
    }
    
    /*double hitungTotalObat(){
        return;
    }*/
    
    void tampil(){
        System.out.print("Nama pasien : ");
        nama = input.nextLine();
        
        System.out.print("Umur : ");
        umur = input.nextInt();
        input.nextLine();
    }
}