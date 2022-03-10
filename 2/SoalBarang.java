package minggu2;
public class SoalBarang {
    String nama;
    int jumlah, hargaSatuan;
    int hitungHargaTotal(){
        return jumlah*hargaSatuan;
    }
    double hitungDiskon(){
        int harga = hitungHargaTotal();
        double diskon;
        if (harga > 100000){
            return diskon = harga*0.1;
        } else if(harga >= 50000 && harga <=100000) {
            return diskon = harga*0.05;
        } else {
            return harga;
        }
    }
    int hitungHargaBayar(){
        return (int) (hitungHargaTotal() - hitungDiskon());
    }
    void tampil(){
        System.out.println("Nama barang : " + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga Satuan : " + hargaSatuan);
    }
    public static void main(String[] args) {
        SoalBarang brg = new SoalBarang();        
        brg.nama = "Snack";
        brg.jumlah = 25;
        brg.hargaSatuan = 5000;
        brg.hitungHargaTotal();
        brg.hitungDiskon();
        brg.tampil();
        int total = brg.hitungHargaBayar();
        System.out.println("Bayar Rp. " + total);
    }
}