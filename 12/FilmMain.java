package minggu12;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FilmMain {
    static Scanner input = new Scanner(System.in);
    public static Film f;
    public static int id; 
    static String judul; 
    static double rating;
    
    static void menu(){
        System.out.println("======================================="); 
        System.out.println("\t      *** MENU ***");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film (DESC)");
        System.out.println("0. Keluar");
        System.out.println("======================================="); 
    }
    
    static Film insert(){
        System.out.println("======================================="); 
        System.out.print("ID : ");
        id = input.nextInt();
        input.nextLine();
        System.out.print("Judul : ");
        judul = input.nextLine();
        System.out.print("Rating : ");
        rating = input.nextDouble();
        return f = new Film(id, judul, rating);
    }
            
            
    public static void main(String[] args) {
        FilmDLL  film = new FilmDLL();
        System.out.println("======================================="); 
        System.out.println("\tDAFTAR FILM LAYAR LEBAR");
        int pilih, idx;
        do {
        menu();
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            System.out.println("======================================="); 
            switch(pilih){
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    insert();
                    film.addFirst(f);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    insert();
                    film.addLast(f);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Posisi Tertentu");
                    insert();
                    System.out.print("Indeks : ");
                    idx = input.nextInt();
                    try {
                        film.add(f, idx);
                    } catch (Exception ex) {
                        Logger.getLogger(FilmMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 4:
                    try {
                        film.removeFirst();
                    } catch (Exception ex) {
                        Logger.getLogger(FilmMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 5:
                    try {
                        film.removeLast();
                    } catch (Exception ex) {
                        Logger.getLogger(FilmMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 6:
                    System.out.print("Hapus data node ke-");
                    idx = input.nextInt();
                    System.out.println("======================================="); 
                    try {
                        film.remove(idx);
                    } catch (Exception ex) {
                        Logger.getLogger(FilmMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 7:
                    System.out.println();
                    film.print();
                    break;
                case 8:
                    System.out.print("Cari ID : ");
                    idx = input.nextInt();
                    System.out.println("======================================="); 
                    film.find(idx);
                    break;
                case 9:
                    film.sorting();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    break;
            }
        } while(pilih >= 1 && pilih <=9 || pilih != 0);
    }
}