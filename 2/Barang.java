package minggu2;
public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang() {
    }
    
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang() {
        System.out.println("\nNama : " + namaBarang);
        System.out.println("Jenis : " + jenisBarang);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan : Rp. " + hargaSatuan);
    }
    
    void tambahStok(int n) {
        stok+=n;
    }
    
    void kurangStok(int n){
        if(stok >= n){
        stok-=n;
        }
    }
    
    int hitungTotal(int jml){
        return jml*hargaSatuan;
    }
    
}
