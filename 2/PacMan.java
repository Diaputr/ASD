package minggu2;
import java.util.Scanner;
public class PacMan {
    static Scanner input = new Scanner(System.in);
    int x, y, width, height;
    
    void moveleft(int v){
        if (x>=0 || x<=width){
        x--;
        }
    }
    
    void moveRight(int v){
        if (x>=0 || x<=width){
        x++;
        }
    }
    
    void moveUp(int v){
        if (y>=0 || y<=height){
        y--;
        }
    }
    
    void moveDown(int v){
        if (y>=0 || y<=height){
        y++;
        }
    }
    
    void menu(){
        System.out.println("============PACMAN============");
        System.out.println("------------------------------");
        System.out.print("Masukkan lebar area : ");
        width = input.nextInt();
        System.out.print("Masukkan tinggi area : ");
        height = input.nextInt();
        System.out.println("------------------------------");
        do {
        System.out.print("Masukkan x : ");
        x = input.nextInt();
        System.out.print("Masukkan y : ");
        y = input.nextInt();
        System.out.println("------------------------------");
        } while(x<0 || x>height && y<0 || y>width);
    }
    
    void printPosition(){
        for (int i=1; i<=height; i++){
            for (int j=1; j<width; j++){
                if(i==y && j==x){
                    System.out.print("   O");
                    continue;
                }
            System.out.print("   -");
            } 
            if (i==y && i==x){
                System.out.println("   O");
                continue;     
            }
        System.out.println("   -");
        }
    }
    
    public static void main(String[] args) {
        PacMan pac = new PacMan();
        
        pac.menu();
        pac.printPosition();

        for(int x=0; true;){
        System.out.println("------------------------------");
        System.out.println("Pilih");
        System.out.println("------------------------------");
        System.out.println("1. Atas\n2. Kanan\n3. Kiri\n4. Bawah\n0. Keluar");
        System.out.print("Input : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                pac.moveUp(1);
                pac.printPosition();
                break;
            case 2:
                pac.moveRight(1);
                pac.printPosition();
                break;
            case 3:
                pac.moveleft(1);
                pac.printPosition();
                break;
            case 4:
                pac.moveDown(1);
                pac.printPosition();
                break;
            default:
                System.out.println("none");
                break;
            }
            if (pilih==0)
                break;
        }
    } 
}