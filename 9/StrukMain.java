package minggu9;
import java.util.Scanner;
public class StrukMain {
       
    static void menu(){
        System.out.println("== MENU ==");
        System.out.println("1. Tambah");
        System.out.println("2. Ambil");
        System.out.println("3. Cek Isi");
        System.out.println("4. Struk Teratas");
        System.out.println("5. Buang");
        System.out.println("0. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("\t\tSTRUK BELANJA DEWI");
        System.out.println("====================================================");
        System.out.print("Masukkan kapasitas penyimpanan laci : ");
        int jml = input.nextInt();
        input.nextLine(); System.out.println();
        StrukStack ss = new StrukStack(jml);
        int menu; char pilih;
        do {
            menu();
            System.out.print("Pilih : ");
            menu = input.nextInt(); input.nextLine(); System.out.println();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("STRUK BELANJA "+(ss.top+2));
                        System.out.print("Nomor Transaksi : ");
                        String no = input.nextLine();
                        System.out.print("Tanggal : ");
                        String tgl = input.nextLine();
                        System.out.print("Jumlah Barang : ");
                        int jm = input.nextInt();
                        System.out.print("Total Harga Bayar : ");
                        int hrg = input.nextInt();
                        StrukBelanja sb = new StrukBelanja(no, tgl, jm, hrg);
                        System.out.print("Tambah struk baru ke laci? (n = stop) : ");
                        pilih = input.next().charAt(0);
                        input.nextLine(); System.out.println();
                        ss.push(sb);
                    } while (pilih != 'n');
                    break;
                case 2:
                    System.out.print("Masukkan jumlah struk yang akan diambil : ");
                    int ambil = input.nextInt();
                    ss.pop(ambil);
                    System.out.println("Struk yang tersisa : ");
                    ss.print();
                    break;
                case 3:
                    System.out.println("Daftar struk belanja : ");
                    ss.print(); 
                    break;
                case 4:
                    ss.peek();
                    break;
                case 5:
                    ss.clear(); 
                    break;
                case 0:
                    System.out.println("Terimakasih! ^^");
                    break;
                default:
                    System.out.println("Pilihan salah!\n");
                    break;
            }
        } while (menu != 0);
    }    
}
