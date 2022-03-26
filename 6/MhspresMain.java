package minggu6;
//import java.util.Scanner;
public class MhspresMain {
    public static void main(String[] args) {
    //Scanner input = new Scanner(System.in);    
    Mapres list = new Mapres();
    Mhs m1 = new Mhs("Silvi", 2017, 25, 3);
    Mhs m2 = new Mhs("Erisa", 2012, 19, 4);
    Mhs m3 = new Mhs("Cici", 2018, 19, 3.5);
    Mhs m4 = new Mhs("Mifta", 2017, 23, 2);
    Mhs m5 = new Mhs("Anas", 2019, 21, 3.75);
    
    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);
    
    System.out.println("Data mahasiswa sebelum sorting : ");
    list.tampil();
    
    System.out.println("Data mahasiswa setelah bubblesort desc berdasarkan IPK");
    list.bubbleSort();
    list.tampil();
    
    System.out.println("Data mahasiswa setelah selectionsort asc berdasarkan IPK");
    list.selectionSort();
    list.tampil();
    
    System.out.println("Data mahasiswa setelah insertionsort asc berdasarkan IPK");
    list.insertionAsc();
    list.tampil();
    
    System.out.println("Data mahasiswa setelah insertionsort desc berdasarkan IPK");
    list.insertionDesc();
    list.tampil();
    }
}