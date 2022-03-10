/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Diah Putri Nofianti
 */
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        int nim = input.nextInt()%100;
		
        if (nim<10){
	    nim+=10;
        }
		
	System.out.println("=========================");
	System.out.println("n : "+nim);
		
        int hari = 1;
        for(int i=1; i<=nim; i++){
            switch (hari) {
                case 1:
                    System.out.print("Senin ");
                    break;
                case 2:
                    System.out.print("Selasa ");
                    break;
                case 3:
                    System.out.print("Rabu ");
                    break;
                case 4:
                    System.out.print("Kamis ");
                    break;
                case 5:
                    System.out.print("Jumat ");
                    break;
                case 6:
                    System.out.print("Sabtu ");
                    break;
                case 7:
                    System.out.print("Minggu ");
                    break;
                default:
                    break;
            }
		
        if(hari == 7){
            hari = 1;
        } else {
            hari++;
        }
      }
   }
}