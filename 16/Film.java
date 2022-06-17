package minggu16;
public class Film {
    int id, th;
    String judul, dir;

    public Film() {
    }

    public Film(int id, String judul, int th, String dir) {
        this.id = id;
        this.judul = judul;
        this.th = th;
        this.dir = dir;
    }
    
     @Override
    public String toString(){
        return "ID : "+id+" | Judul : "+judul+" | Tahun : "+th+" | Director : "+dir;
    }
}