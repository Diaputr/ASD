package UTS;
import java.util.Scanner;
public class RekeningMain {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    RekeningMethod nsbh = new RekeningMethod();
    
    System.out.println("------------------------------------");
    System.out.println("--- SELAMAT DATANG DI BANK JATIM ---");
    System.out.println("------------------------------------");
    
        OUTER:
        for (int i = 0; true;) {
            nsbh.menu();
            System.out.print("Pilih : ");
            int p = input.nextInt();
            input.nextLine();
            String noRek, nama, telp, email;
            int saldo;
            switch (p) {
                case 1:
                    for (int j=0; j < 3; j++){
                        System.out.println("REKENING "+(j+1));
                        System.out.print("No Rekening : ");
                        noRek = input.nextLine();
                        System.out.print("Nama nasabah : ");
                        nama = input.nextLine();
                        System.out.print("Telp : ");
                        telp = input.nextLine();
                        System.out.print("Email : ");
                        email = input.nextLine();
                        System.out.print("Saldo : ");
                        saldo = input.nextInt();
                        input.nextLine();
                        System.out.println("------------------------------------");
                        Rekening rek = new Rekening(noRek, nama, telp, email, saldo);
                        nsbh.isiData(rek);
                    }       
                    //nsbh.tampil();
                    System.out.println("Penambahan data berhasil!");
                    break;
                case 2:
                    nsbh.tampilan();
                    break;
                case 3:
                    nsbh.bubbleDesc();
                    nsbh.tampil();
                    break;
                case 4:
                    System.out.print("Masukkan nama nasabah : ");
                    String cari = input.nextLine();
                    int posisi = nsbh.findSeqName(cari);
                    nsbh.tampilPos(cari, posisi);
                    nsbh.tampilNama(cari, posisi);
                    break;
                case 5:
                    System.out.print("Masukkan index no. REK : ");
                    int idx = input.nextInt();
                    System.out.print("Tarik uang sejumlah Rp.");
                    int tarik = input.nextInt();
                    nsbh.tarikSaldo(idx, tarik);
                    break;
                case 6:
                    System.out.print("Masukkan index no. REK : ");
                    idx = input.nextInt();
                    System.out.print("Setor uang sejumlah Rp.");
                    int setor = input.nextInt();
                    nsbh.setorSaldo(idx, setor);
                    break;
                case 0:
                    System.out.println("Terimakasih!");
                    break OUTER;
                default:
                    System.out.println("Pilihan yang Anda Masukkan salah!");
                    break;
            }
        }
    } 
}