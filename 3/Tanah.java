package minggu3;
import java.util.Scanner;
public class Tanah { 
    int panjang, lebar;
    int hitungLuas(){
        return panjang*lebar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("PROGRAM MENGHITUNG LUAS TANAH");
        System.out.println("-----------------------------");
        System.out.print("Masukkan jumlah tanah : ");
        int jml = input.nextInt();
        Tanah[] tnArray = new Tanah[jml];
        System.out.println();
            for(int i = 0; i<tnArray.length; i++){
                tnArray[i] = new Tanah();
                System.out.println("===TANAH "+(i+1)+"===");
                System.out.print("Panjang : ");
                tnArray[i].panjang = input.nextInt();
                System.out.print("Lebar : ");
                tnArray[i].lebar = input.nextInt();
            }
        System.out.println();
        int max=0, count=0;
        for(int i=0; i<tnArray.length; i++){
            int hitung = tnArray[i].hitungLuas();
            System.out.println("Luas tanah "+(i+1)+" : "+hitung);
            if (hitung>max){
                max=hitung;
                count = (i+1);
            }
        }     
        System.out.println("Tanah terluas >> tanah "+count);
    }
}