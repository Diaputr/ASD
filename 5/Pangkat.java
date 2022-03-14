package minggu5;
import java.util.Scanner;
public class Pangkat {
    int nilai, pangkat;
    
    int pangkatBF(int a, int n){
    int hasil=1;
        for (int i=0; i<n; i++){
            hasil*=a;
        }
        return hasil;
    }
    
    int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        } else {
            if (n%2==1){
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            } else {
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
    System.out.println("========================================");
    System.out.print("Masukkan jumlah elemen : ");
    int e = input.nextInt();
    
    Pangkat[] png = new Pangkat[e];
    for(int i=0; i<e; i++){
        png[i] = new Pangkat();
        System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
        png[i].nilai = input.nextInt();
        
        System.out.print("Masukkan pangkat ke-"+(i+1)+" : ");
        png[i].pangkat = input.nextInt();
    }
    
    System.out.println("========================================");
    System.out.println("Hasil pangkat dengan Brute Force");
    for(int i=0; i<e; i++){
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
    }
    System.out.println("========================================");
    System.out.println("Hasil pangkat dengan Divide & Conquer");
    for(int i=0; i<e; i++){
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
    }
    System.out.println("========================================");
    }
}