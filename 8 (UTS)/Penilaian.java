package minggu8;
public class Penilaian {
    String nama;
    int nilaiA, nilaiB, nilaiC, total;

    Penilaian(String name, int a, int b, int c) {
        name = nama;
        nilaiA = a;
        nilaiB = b;
        nilaiC = c;
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
