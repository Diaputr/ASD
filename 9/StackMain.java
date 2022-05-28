package minggu9;
import java.util.Scanner;
public class StackMain {
        
    static void menu(){
        System.out.println("== MENU ==");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Clear");
        System.out.println("6. Get Minimal");
        System.out.println("0. Quit");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("\t\tGUDANG TUMPUKAN PAKAIAN");
        System.out.println("=========================================================");
        System.out.print("Berapa kapasitas penyimpanan yang Anda inginkan? : ");
        int sv = input.nextInt();
        input.nextLine(); System.out.println();
        Stack stk = new Stack(sv);
        int menu; char pilih;
        do {
            menu();
            System.out.print("Pilih : ");
            menu = input.nextInt(); input.nextLine(); System.out.println();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("PAKAIAN "+(stk.top+2));
                        System.out.print("Jenis : ");
                        String jns = input.nextLine();
                        System.out.print("Warna : ");
                        String wrn = input.nextLine();
                        System.out.print("Merk : ");
                        String mr = input.nextLine();
                        System.out.print("Ukuran : ");
                        String sz = input.nextLine();
                        System.out.print("Harga : ");
                        double hrg = input.nextDouble();
                        Pakaian p = new Pakaian(jns, wrn, mr, sz, hrg);
                        System.out.print("Apakah Anda akan menambahkan pakaian baru ke tumpukan (y/n)? : ");
                        pilih = input.next().charAt(0);
                        input.nextLine(); System.out.println();
                        stk.push(p);
                    } while (pilih == 'y');
                    break;
                case 2:
                    stk.pop(); 
                    break;
                case 3:
                    stk.peek(); 
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.clear(); 
                    break;
                case 6:
                    stk.getMin(); 
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
