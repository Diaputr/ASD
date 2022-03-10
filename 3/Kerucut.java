package minggu3;
public class Kerucut {
    double jari, tinggi;

    Kerucut(double r, double t) {
        jari = r;
        tinggi = t;
    }
    
    double hitungVolume(){
        return Math.PI*Math.pow(jari, 2)*tinggi/3;
    }
    
    double hitungLuasPermukaan(){
        double luasAlas = Math.PI*Math.pow(jari, 2);
        double LuasSelimut = Math.sqrt(Math.pow(jari, 2) + Math.pow(tinggi,2));
        return luasAlas+LuasSelimut;
    }
    
    void tampil(){
        System.out.println("Volume : "+hitungVolume());
        System.out.println("Luas permukaan : "+hitungLuasPermukaan());
        System.out.println("=================================");
    }
}