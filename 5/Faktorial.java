package minggu5;
import java.util.Scanner;
public class Faktorial {
    int nilai;
    
    int faktorialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto *=i;
        }
        return fakto;
    }
    
    int faktorialDC(int n){
        if(n==1){
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
    System.out.println("========================================");
    System.out.print("Masukkan jumlah elemen : ");
    int elemen = input.nextInt();
    
    Faktorial[] fk = new Faktorial[elemen];
    
    for(int i=0; i<elemen; i++){
        fk[i] = new Faktorial();
        System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
        fk[i].nilai = input.nextInt();
    }

    System.out.println("========================================");
    System.out.println("Hasil faktorial dengan Bruce Force");
    for(int i=0; i<elemen; i++){
        System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
    }
    
    System.out.println("========================================");
    System.out.println("Hasil faktorial dengan Divide & Conquer");
    for(int i=0; i<elemen; i++){
        System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
    }
    System.out.println("========================================");
    }
}