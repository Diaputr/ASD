package minggu6;
public class MainTiket {
    public static void main(String[] abcd) {
    TiketService pesan = new TiketService();
    Tiket t1 = new Tiket("Lion Air", 474000, "Bali", "Jakarta");
    Tiket t2 = new Tiket("Garuda Indonesia", 543000, "Palembang", "Madiun");
    Tiket t3 = new Tiket("Air Asia", 528000, "Tangerang", "Mataram");
    Tiket t4 = new Tiket("Ciilink", 649000, "Ambon", "Singapura");
    Tiket t5 = new Tiket("Batik Air", 453000, "Malang", "Yogyakarta");
    
    pesan.tambah(t1);
    pesan.tambah(t2);
    pesan.tambah(t3);
    pesan.tambah(t4);
    pesan.tambah(t5);
    
    System.out.println("=== Tiket pesanan sebelum sorting ===");
    pesan.tampilAll();
    
    System.out.println("=== Tiket pesanan sorting harga (desc) ===");
    pesan.bubble();
    pesan.tampilAll();
    
    System.out.println("=== Tiket pesanan sorting harga (asc) ===");
    pesan.selection();
    pesan.tampilAll();
    }
}