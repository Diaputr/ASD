package latihan;

/**
 *
 * @author Diah Putri Nofianti
 */
import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("\nProgram Menghitung Nilai Akhir");
	System.out.println("==================================");
	
	System.out.print("Masukkan nilai TGS : ");
	double tgs = input.nextDouble();
	
	System.out.print("Masukkan nilai UTS : ");
	double uts = input.nextDouble();
	
	System.out.print("Masukkan nilai UAS : ");
	double uas = input.nextDouble();
	
	double nilai = (0.2*tgs) + (0.35*uts) + (0.45*uas);
	
	System.out.println("==================================");
	System.out.println("==================================");
	System.out.println("Nilai akhir : "+nilai);
	
	if (nilai > 80 && nilai <= 100) {
      System.out.println("Nilai huruf : A");

    } else if (nilai > 73 && nilai <= 80) {
      System.out.println("Nilai huruf : B+");

    } else if (nilai > 65 && nilai <= 73) {
      System.out.println("Nilai huruf : B");
	  
    } else if (nilai > 60 && nilai <= 65) {
      System.out.println("Nilai huruf : C+");
	 
    } else if (nilai > 50 && nilai <= 60) {
      System.out.println("Nilai huruf : C");	 
	  
    } else if (nilai > 39 && nilai <= 50) {
      System.out.println("Nilai huruf : D");
	  
    } else if (nilai >= 0 && nilai <= 39) {
      System.out.println("Nilai huruf : E");  
	  
    } else {
      System.out.println("Error");
    }
	
	System.out.println("==================================");
	String n = (nilai > 50) ? "SELAMAT ANDA LULUS!" : "MAAF, ANDA TIDAK LULUS!";
	System.out.println(n);	
    }
}
