/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
/**
 *
 * @author Diah Putri Nofianti
 */
import java.util.Scanner;
public class Sum {
    int elemen;
    double total, keuntungan[];
    
    Sum(int e){
    this.elemen = e;
    this.keuntungan = new double[e];
    this.total = 0;
    }
    
    double TotalBF(double arr[]){
    for(int i=0; i<elemen; i++){
        total += arr[i];
    }
    return total;
    }
    
    double TotalDC(double arr[], int l, int r){
    if(l==r){
        return arr[1];
    } else if (l<r){
        int mid = (l+r)/2;
        double lsum = TotalDC(arr, l, mid-1);
        double rsum = TotalDC(arr, mid+1, r);
        return lsum+rsum+arr[mid];
    }
    return  0;
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
    System.out.println("========================================");
    System.out.println("Program Menghitung Keuntungan Total");
    System.out.print("Masukkan jumlah bulan : ");
    int elm = input.nextInt();
    Sum sm = new Sum(elm);
    System.out.println("========================================");
    for(int i=0; i<sm.elemen; i++){
        System.out.print("Masukkan untung bulan ke-"+(i+1)+" : ");
        sm.keuntungan[i] = input.nextDouble();
    }
    System.out.println("========================================");
    System.out.println("Algoritma Brute Force");
    System.out.println("Total keuntungan selama "+sm.elemen+" bulan adalah "+sm.TotalBF(sm.keuntungan));
    System.out.println("========================================");
    System.out.println("Algoritma Divide & Conquer");
    System.out.println("Total keuntungan selama "+sm.elemen+" bulan adalah "+sm.TotalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}