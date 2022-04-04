package minggu8;
public class BarangLth {
    String nama;
    int stok, harga;

    BarangLth(String n, int s, int h) {
        nama = n;
        stok = s;
        harga = h;
    }
    
    void tampil(){
        System.out.println("Nama Barang : "+nama);
        System.out.println("Stok : "+stok);
        System.out.println("Harga : "+harga);
    }
    
}