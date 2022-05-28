package minggu10;
public class NasabahQueue {
    Nasabah[] data;
    int front, rear, size, max;
    
    NasabahQueue(int n) {
        max = n;
        data = new Nasabah[max];
        front = rear = -1;
        size = 0;
    }
        
    boolean isEmpty(){
        if (size == 0) return true;
        else return false;
    }
    
    boolean isFull(){
        if (size == max) return true;
        else return false;
    }
    
    void peek(){
        if(!isEmpty()) System.out.println("Antrian terdepan :\n"+data[front].norek+" | "+data[front].nama+" | "+data[front].alamat+" | "+data[front].umur+" | "+data[front].saldo);
        else System.out.println("Antrian masih kosong!");
    }
    
    void peekRear(){
        if(!isEmpty()){
            System.out.println("Antrian terakhir :\n"+data[rear].norek+" | "+data[rear].nama
            +" | "+data[rear].alamat+" | "+data[rear].umur+" | "+data[rear].saldo);
        } else { 
            System.out.println("Antrian masih kosong!");
        }
    }
    
    void print(){
        if(isEmpty()) System.out.println("Antrian masih kosong!");
        else {
            int i = front;
            while (i != rear){
                System.out.println(data[i].norek+" | "+data[i].nama+" | "+data[i].alamat+" | "+data[i].umur+" | "+data[i].saldo);
                i = (i+1) % max;
            }
            System.out.println(data[i].norek+" | "+data[i].nama+" | "+data[i].alamat+" | "+data[i].umur+" | "+data[i].saldo);
            System.out.println("Jumlah data pada antrian : "+size);
        }
    }
    
    void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan!");
        } else System.out.println("Antrian masih kosong!");
    }
    
    void Enqueue(Nasabah dt){
        if(isFull()) System.out.println("Antrian sudah penuh!");
        else {
            if(isEmpty()) front = rear = 0;
            else {
                if(rear == max-1) rear = 0;
                else rear++;
            }
            data[rear] = dt;
            size++;
        }
    }
    
    Nasabah Dequeue(){
        Nasabah dt = new Nasabah();
        if(isEmpty()) System.out.println("Antrian masih kosong!");
        else {
            dt = data[front];
            size--;
            if(isEmpty()) front = rear = -1;
            else {
                if(front == max -1) front = 0;
                else front++;
            }
        }
        return dt;
    }
}