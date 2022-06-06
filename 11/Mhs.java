package minggu11;
public class Mhs {
    String nim, nama;
    int absen;
    double ipk;
    
    Mhs(String nim, String nama, int absen, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    
    void tampilMhs(){
        System.out.println(nim + (" | ") + nama + (" | ") + absen + (" | ") + ipk);
    }
}