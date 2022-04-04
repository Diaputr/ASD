package minggu8;
import java.util.Scanner;
public class MainNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NilaiMethod nilaiMhs = new NilaiMethod();
        for (int i=0; i < 5; i++){
            System.out.println("Mahasiswa "+(i+1));
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Nilai A : ");
            int a = input.nextInt();
            System.out.print("Nilai B : ");
            int b = input.nextInt();
            System.out.print("Nilai C : ");
            int c = input.nextInt();
            System.out.println("----------------------------");
            input.nextLine();
            Penilaian mahasiswa = new Penilaian(nama, a, b, c);
            nilaiMhs.isiData(mahasiswa);
            mahasiswa.menotal();
        }
        System.out.println("Pengurutan total nilai mahasiswa");
        nilaiMhs.insertionDesc();
        nilaiMhs.tampil();
        nilaiMhs.terbaik();
    }
}