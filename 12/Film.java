package minggu12;
public class Film {
    int id;
    String judul;
    double rating;

    Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
    
    void tampil(){
        System.out.println("ID : "+id);
        System.out.println("Judul Film : "+judul);
        System.out.println("Rating : "+rating);
        System.out.println();
    }
}