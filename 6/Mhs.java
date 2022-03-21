package minggu6;
public class Mhs {
    String nama;
    int thMasuk, umur;
    double ipk;
    
    Mhs(String n, int t, int u, double i){
        nama = n;
        thMasuk = t;
        umur = u;
        ipk = i;
    }
    
    void tampil(){
        System.out.println("Nama : "+nama);
        System.out.println("Tahun Masuk : "+thMasuk);
        System.out.println("Umur : "+umur);
        System.out.println("IPK : "+ipk);
    }
}