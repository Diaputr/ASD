package minggu2;
public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        
        b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        
        int harga = b1.hitungTotal(4);
        System.out.println("Harga 4 buah Rp. " + harga);
        
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
        
        Barang b3 = new Barang("Lenovo Ideapad", "Laptop", 5, 5000000);
        b3.tampilBarang();
        System.out.println("Harga 2 buah Rp. " + b3.hitungTotal(2));
    }
}
