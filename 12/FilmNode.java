package minggu12;
public class FilmNode {
    Film data;
    FilmNode prev, next;

    FilmNode(FilmNode prev, Film data, FilmNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}