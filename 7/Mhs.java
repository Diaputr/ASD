package minggu7;
public class Mhs {
    int nim, umur;
    String nama;
    double ipk;
    
    Mhs(int ni, String na, int u, double i){
        nim = ni;
        nama = na;
        umur = u;
        ipk = i;
    }
    
    void tampil(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("IPK : "+ipk);
    }
}