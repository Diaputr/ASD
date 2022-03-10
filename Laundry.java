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

public class Laundry {
    public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
            System.out.println("=====================================");
            System.out.println("\t   SMILE LAUNDRY");
            System.out.println("=====================================");
            int x = 0;
            for(int i=0; true; i++){
		System.out.print("Nama pelanggan : ");
		String nama = input.nextLine();
		
		System.out.print("Berat pakaian (kg) : ");
		int kg = input.nextInt();
		input.nextLine();
		int y;
                int harga = 4500;
		int diskon = kg * harga * 5/100;
                
		if (kg > 10 ){
                    y = kg * harga - diskon;
                    kg *= harga;
                    System.out.println(nama + " memperoleh diskon 5%");
                    System.out.println("Total awal Rp. "+kg);
		} else {
                    y = kg * harga;
		}
            x += y;
            System.out.println("Total bayar Rp. "+ y);
            System.out.println("-------------------------------------");
            System.out.print("Apakah ada pelanggan lain? (Y/T) >> ");
            String apa = input.nextLine();
		
            if (apa.equalsIgnoreCase ("t")){
                System.out.println("=====================================");
		break;
            } else if(apa.equalsIgnoreCase ("y")){ 
		System.out.println("-------------------------------------");
            } else {
		System.out.println("Eror");
		break;
            }
	}  
	System.out.println("Total pendapatan Rp. "+ x);
   }
}