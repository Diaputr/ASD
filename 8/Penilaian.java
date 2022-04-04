package minggu8;
public class Penilaian {
    String nama;
    int nilaiA, nilaiB, nilaiC, total;

    Penilaian(String nama, int nilaiA, int nilaiB, int nilaiC) {
        this.nama = nama;
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }
    
    void print(){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai A : "+nilaiA);
        System.out.println("Nilai B : "+nilaiB);
        System.out.println("Nilai C : "+nilaiC);
        System.out.println("Total : "+total);
    }
    
    int menotal(){
        total = nilaiA+nilaiB+nilaiC;
        return total;
    }

}