package minggu12;
public class Vaccine {
    int no;
    String nama;

    Vaccine(int no, String nama) {
        this.no = no;
        this.nama = nama;
    }
    
    void print(){
        System.out.println(no+"\t|\t "+nama);
    }
}