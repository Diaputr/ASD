package minggu8;
import java.util.Scanner;
public class MainShell {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah data : ");
    int x = input.nextInt();
    int data[] = new int[x];
    
    for(int i = 0; i < x; i++){
        System.out.printf("Data %d : ",(i+1));
        data[i] = input.nextInt();
    }
    
    System.out.println("Pengurutan Shell Sort (ASC)");
    Shell sorting = new Shell(data, x);
    sorting.shellSort();
    sorting.tampil();
    }
}