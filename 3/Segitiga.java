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
public class Segitiga {
    double alas, tinggi;

    Segitiga(double a, double t) {
        alas=a;
        tinggi=t;
    }
    
    double hitungLuas(){
        return alas*tinggi/2;
    }
    
    double hitungKeliling(){
        double miring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return alas+tinggi+miring;
    }
    
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga(10,4);
        sgArray[1] = new Segitiga(20,10);
        sgArray[2] = new Segitiga(15,6);
        sgArray[3] = new Segitiga(25,10);
        
        for (int i=0; i<sgArray.length; i++){
            System.out.println("Luas segitiga ke-"+i+" : "+sgArray[i].hitungLuas());
            System.out.println("Keliling : "+sgArray[i].hitungKeliling());
        }
    }
}