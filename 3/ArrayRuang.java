package minggu3;
import java.util.Scanner;
public class ArrayRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("PROGRAM PERHITUNGAN BANGUN RUANG");
        System.out.println("=================================");
        Kubus kbs[] = new Kubus[3];
        Tabung tbg[] = new Tabung[3];
        Kerucut krt[] = new Kerucut[3];
        
        OUTER:
        for (int i = 0; true; i++) {
            double s, r, t;
            System.out.println("<< MENU >>");
            System.out.println("1. Kubus\n2. Tabung\n3. Kerucut\n4. Keluar");
            System.out.print("Masukkan pilihan : ");
            int in = input.nextInt();
            System.out.println("=================================");
            switch (in) {
                case 1:
                    System.out.println("< KUBUS >");
                    System.out.print("Masukkan sisi : ");
                    s = input.nextInt();
                    kbs[i] = new Kubus(s);
                    kbs[i].tampil();
                    break;
                case 2:
                    System.out.println("< TABUNG >");
                    System.out.print("Masukkan jari-jari : ");
                    r = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    t = input.nextInt();
                    tbg[i] = new Tabung(r, t);
                    tbg[i].tampil();
                    break;
                case 3:
                    System.out.println("< KERUCUT >");
                    System.out.print("Masukkan jari-jari : ");
                    r = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    t = input.nextInt();
                    krt[i] = new Kerucut(r, t);
                    krt[i].tampil();
                    break;
                case 4:
                    System.out.println("Terimakasih~! ^^");
                    break OUTER;
                default:
                    System.out.println("Maaf, nomor pilihan salah!");
                    break;
            }
        }
    }
}
