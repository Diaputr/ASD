
import java.util.Scanner;

public class Hitung {
    static Scanner input = new Scanner(System.in);

    static double hitungBagi (double a, double b){
	double c = a/b;
	return c;
    }
		
    static double hitungKali (double x, double y){
	double z = x*y;
	return z;
    }
    
    static int menu (){
        int pil;
        System.out.println("==========================");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.println("4. Keluar");
        System.out.print("Pilih : ");
        pil = input.nextInt();
        return pil;
    }
		
    public static void main (String[] args){
    double s,v,t;
    
    System.out.println("==========================");
    System.out.println("PROGRAM PERHITUNGAN");
        OUTER:
        for (int i = 0; true; i++) {
            int pilih = menu();
            switch (pilih) {
                case 1:
                    System.out.println("==========================");
                    System.out.println("Menghitung Kecepatan");
                    System.out.println("==========================");
                    System.out.print("Masukkan jarak (m) : ");
                    s = input.nextDouble();
                    System.out.print("Masukkan waktu (s) : ");
                    t = input.nextDouble();
                    System.out.println(s + " / " + t);
                    System.out.println("Hasil kecepatan (m/s) = "+ hitungBagi(s,t));
                    break;
                case 2:
                    System.out.println("==========================");
                    System.out.println("Menghitung Jarak");
                    System.out.println("==========================");
                    System.out.print("Masukkan kecepatan (m/s) : ");
                    v = input.nextDouble();
                    System.out.print("Masukkan waktu (s) : ");
                    t = input.nextDouble();
                    System.out.println(v + " x " + t);
                    System.out.println("Hasil jarak (m) = "+ hitungKali(v,t));
                    break;
                case 3:
                    System.out.println("==========================");
                    System.out.println("Menghitung Waktu");
                    System.out.println("==========================");
                    System.out.print("Masukkan jarak (m) : ");
                    s = input.nextDouble();
                    System.out.print("Masukkan kecepatan (m/s) : ");
                    v = input.nextDouble();
                    System.out.println(s + " / " + v);
                    System.out.println("Hasil waktu (s) = "+ hitungBagi(s,v));
                    break;
                case 4:
                    break OUTER;	
                default:
                    System.out.println("Input yang Anda masukkan salah!");
                    break;
            }
        }
    } 
}
