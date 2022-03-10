package minggu3;
public class Tabung {
    double jari, tinggi;
    
    Tabung(double r, double t){
        jari = r;
        tinggi = t;
    }
    
    double hitungVolume(){
        return Math.PI*Math.pow(jari,2)*tinggi;
    }
    
    double hitungLuasPermukaan(){
        double luasAlas = Math.PI*Math.pow(jari, 2);
        double luasSelimut = 2*Math.PI*jari*tinggi;
        return 2*luasAlas+luasSelimut;
    }
    
    void tampil(){
        System.out.println("Volume : "+hitungVolume());
        System.out.println("Luas permukaan : "+hitungLuasPermukaan());
        System.out.println("=================================");
    }
}