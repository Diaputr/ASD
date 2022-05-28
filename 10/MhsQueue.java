package minggu10;
public class MhsQueue {
    Mahasiswa[] antrian;
    int front, rear, size, max;
    
    MhsQueue(int n){
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    
    boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }
    
    boolean isFull(){
        if(size == max) return true;
        else return false;
    }
    
    void Enqueue(Mahasiswa antri){
        if(isFull()) System.out.println("Antrian sudah penuh!");
        else {
            if(isEmpty()) front = rear = 0;
            else {
                if(rear == max-1) rear = 0;
                else rear++;
            }
            antrian[rear] = antri;
            size++;
        }
    }   
    
    Mahasiswa Dequeue(){
        Mahasiswa antri = new Mahasiswa();
        if(isEmpty()) System.out.println("Antrian masih kosong!");
        else {
            antri = antrian[front];
            size--;
            if(isEmpty()) front = rear = -1;
            else {
                if(front == max -1) front = 0;
                else front++;
            }
        }
        return antri;
    }
    
    void print(){
        if(isEmpty()) System.out.println("Antrian masih kosong!");
        else {
            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nim+" | "+antrian[i].nama+" | "+antrian[i].absen+" | "+antrian[i].ipk);
                i = (i+1) % max;
            }
            System.out.println(antrian[i].nim+" | "+antrian[i].nama+" | "+antrian[i].absen+" | "+antrian[i].ipk);
            System.out.println("Jumlah data pada antrian : "+size);
        }
    }
    
    void peek(){
        if(!isEmpty()){
            System.out.println("Antrian terdepan : "+antrian[front].nim+" | "+antrian[front].nama+" | "+antrian[front].absen+" | "+antrian[front].ipk);
        } else System.out.println("Antrian masih kosong!");
    }
    
    void peekRear(){
        if(!isEmpty()){
            System.out.println("Antrian terakhir : "+antrian[rear].nim+" | "+antrian[rear].nama+" | "+antrian[rear].absen+" | "+antrian[rear].ipk);
        } else System.out.println("Antrian masih kosong!");
    }
    
    void peekPosition (String nim){
        boolean cari = false;
        if(isEmpty()){
            System.out.println("Antrian masih kosong!"); cari = true;
        } else {
            System.out.printf("Posisi indeks >> ");
            for(int i = 0; i < max; i++){
                if(!antrian[i].nim.equals(nim)){
                } else {
                    System.out.printf("%d ", i);
                    System.out.println("\nDATA : "+antrian[i].nim+" | "+antrian[i].nama+" | "+antrian[i].absen+" | "+antrian[i].ipk);
                    cari = true;
                }
            }
        } if(!cari) System.out.printf("tidak ada!\n");
    }
    
    void printMhs (int posisi){
        if(isEmpty()){
            System.out.println("Antrian masih kosong!");
        } else {
            if(posisi < max){
                if(!antrian[posisi].nim.equals("")){
                    System.out.println("DATA : "+antrian[posisi].nim+" | "+antrian[posisi].nama+" | "+antrian[posisi].absen+" | "+antrian[posisi].ipk);
                } else {
                    System.out.println("Data kosong!");
                }
            } else {
                System.out.println("Indeks melebihi kapasitas!");
            }
        }
    }
}