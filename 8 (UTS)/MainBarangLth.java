package minggu8;
public class MainBarangLth {
    public static void main(String[] args) {
        BarangLth Barang[] = new BarangLth[4];
        Barang[0] = new BarangLth("Pensil", 35, 1000);
        Barang[1] = new BarangLth("Buku", 20, 5000);
        Barang[2] = new BarangLth("Penggaris", 50, 1500);
        Barang[3] = new BarangLth("Pulpen", 25, 2000);
        
        tampilan(Barang);
        System.out.println("--------------------------");
        insertionDesc(Barang);
        tampilan(Barang);
    }
  
    static void insertionDesc(BarangLth[] Barang){
        for (int i=1; i<Barang.length; i++) {
            BarangLth temp = Barang[i];
            int j = i-1;
            while (j>=0 && Barang[j].stok > temp.stok) {
                Barang[j+1] = Barang[j];
                --j;
            }
            Barang[j+1] = temp;
        }
    }
   
    static void tampilan(BarangLth[] Barang){
        for(BarangLth b : Barang){
            b.tampil();
        }
    }    
}