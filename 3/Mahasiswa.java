package minggu3;
import java.util.Scanner;
public class Mahasiswa {
    String nama, nim, gender, ipk;
    void tampil(){
        System.out.println("Nama \t: "+nama);
        System.out.println("NIM \t: "+nim);
        System.out.println("Gender \t: "+gender);
        System.out.println("IPK \t: "+ipk);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("===INFORMASI MAHASISWA===");
        System.out.println("-------------------------");
        System.out.print("Jumlah data inputan : ");
        int n = input.nextInt();
        input.nextLine();
        Mahasiswa[] mhs = new Mahasiswa[n];
        for (int i=0; i<mhs.length; i++){
            mhs[i] = new Mahasiswa();
            System.out.println("\n------------------------------");
            System.out.println("Masukkan data Mahasiswa ke- "+(i+1));
            System.out.println("------------------------------");
            System.out.print("Masukkan nama \t: ");
            mhs[i].nama = input.nextLine();
            System.out.print("Masukkan NIM \t: ");
            mhs[i].nim = input.nextLine();
            System.out.print("Masukkan gender : ");
            mhs[i].gender = input.nextLine();
            System.out.print("Masukkan IPK \t: ");
            mhs[i].ipk = input.nextLine();
        }
        System.out.println();
        for (int j=0; j<mhs.length; j++) {
            System.out.println("Data Mahasiswa ke-"+(j+1));
            mhs[j].tampil();
        }
    }
}