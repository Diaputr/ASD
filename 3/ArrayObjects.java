/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Diah Putri Nofianti
 */
import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang : ");
        int jml = input.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jml];
            for(int i = 0; i<ppArray.length; i++){
                ppArray[i] = new PersegiPanjang();
                System.out.println("Persegi Panjang ke-"+i);
                System.out.print("Panjang = ");
                ppArray[i].panjang = input.nextInt();
                System.out.print("Lebar = ");
                ppArray[i].lebar = input.nextInt();
            }
            System.out.println();
                for(int i=0; i<ppArray.length; i++){
                    System.out.println("Persegi panjang ke-"+i);
                    System.out.println("Panjang = "+ppArray[i].panjang+", lebar = "+ppArray[i].lebar);
        }
    }
}