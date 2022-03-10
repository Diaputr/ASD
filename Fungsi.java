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
public class Fungsi {
    static int[][] royal = {{10,5,15,7},
			    {6,11,9,12},
                            {2,10,10,5},
			    {5,7,12,9}};
    static void tampilTabel(){
        System.out.println("\t\t     Aglonema\t\t      Keladi\t\t     Alocasia\t\t      Mawar");
        for (int i = 0; i < royal.length; i++){
            System.out.print("RoyalGarden"+ (i+1) );
                for (int j = 0; j < royal[0].length; j++){
                    System.out.print("\t\t"+royal[i][j]+"\t");     
                }
            System.out.println();
        }       
    }     
    static void hitungStok(){
        for (int i = 0; i < royal.length; i++){
            int x = 0;
            for (int j = 0; j < royal[0].length; j++){
                x += royal[j][i];
            }
            System.out.print("\t\t\t"+x);
        }       
    }   
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t  STOK BUNGA ROYAL GARDEN\n");
        tampilTabel(); 
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.print("Jumlah");
        hitungStok();
    }
}