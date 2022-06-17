package minggu16;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class DaftarFilm {
    Stack<Film> film = new Stack<>();
    
    void menu(){
        System.out.println("=================================================================");
        System.out.println("1. Input Judul Film");   
        System.out.println("2. Hapus Data Film Teratas");   
        System.out.println("3. Cek Judul Film Teratas");   
        System.out.println("4. Info Semua Judul Film");   
        System.out.println("5. Keluar"); 
        System.out.println("=================================================================");
        System.out.print("Pilih : ");
    }
    
    void input(Film data){
        film.push(data);
    }
    
    void hapus(){
        if(film.isEmpty()){
            System.out.println("Data Film Kosong!");
        } else {
            System.out.println(film.lastElement());
            film.pop();
        }
    }
    
    void cek(){
        if(film.isEmpty()){
            System.out.println("Data Film Kosong!");
        } else System.out.println(film.peek());
    }
    
    void tampil(){
        if(film.isEmpty()){
            System.out.println("Data Film Kosong!");
        } else {
            System.out.println("\t\tDAFTAR FILM");
            film.stream().forEach(f -> {
            System.out.println(f.toString());
        });}
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarFilm df = new DaftarFilm();
        System.out.println("=================================================================");
        System.out.println("\t\tDATA FILM LAYAR LEBAR SEPANJANG MASA");
        int pilih;
        do {
            df.menu();
            pilih = input.nextInt();
        System.out.println("=================================================================");
            switch(pilih){
                case 1 :
                    System.out.print("ID Film : ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Judul Film : ");
                    String judul = input.nextLine();
                    System.out.print("Tahun Tayang : ");
                    int th = input.nextInt();
                    input.nextLine();
                    System.out.print("Director : ");
                    String dir = input.nextLine();
                    Film daftar = new Film(id, judul, th, dir);
                    df.input(daftar);
                    break;
                case 2 :
                    df.hapus();
                    break;
                case 3 :
                    df.cek();
                    break;
                case 4 :
                    df.tampil();
                    break;
                case 5 :    
                    System.out.println("Terimakasih!");
                    break;
                default :
                    System.out.println("Pilihan salah!");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4 || pilih != 5);
    }
}