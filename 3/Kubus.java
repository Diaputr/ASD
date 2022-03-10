package minggu3;
public class Kubus {
    double sisi;
    
    Kubus(double s){
        sisi = s;
    }

    double hitungVolume(){
        return Math.pow(sisi, 3);
    }
    
    double hitungLuasPermukaan(){
        return 6*Math.pow(sisi, 2);
    }
    
    void tampil(){
        System.out.println("Volume : "+hitungVolume());
        System.out.println("Luas permukaan : "+hitungLuasPermukaan());
        System.out.println("=================================");
    }
}