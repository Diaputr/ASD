package minggu6;
public class Tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    
    void tampilAll(){
        System.out.println("Maskapai : "+maskapai);
        System.out.println("Harga : Rp."+harga);
        System.out.println("Asal : "+asal);
        System.out.println("Tujuan : "+tujuan);
    }
}