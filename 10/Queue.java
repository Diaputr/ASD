package minggu10;
public class Queue {
    int[] data;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        data = new int[max];
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
        if(!isEmpty()) System.out.println("Elemen terdepan : "+data[front]);
        else System.out.println("Queue masih kosong!");
    }
    
    void print(){
        if(isEmpty()) System.out.println("Queue masih kosong!");
        else {
            int i = front;
            while (i != rear){
                System.out.print(data[i]+" ");
                i = (i+1) % max;
            }
            System.out.println(data[i]+" ");
            System.out.println("Jumlah elemen = "+size);
        }
    }
    
    void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan!");
        } else System.out.println("Queue masih kosong!");
    }
    
    boolean Enqueue(int dt){
        if(isFull()){ 
            System.out.println("Queue sudah penuh!");
            return true;
        } else {
            if(isEmpty()){
                front = rear = 0;
            } else {
                if(rear == max-1){
                   rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return false;
        }
    }
    
    int Dequeue(){
        int dt = 0;
        if(isEmpty()) System.out.println("Queue masih kosong!");
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
    
    void peekPosition (int dt){
        boolean cari = false;
        if(isEmpty()){
            System.out.printf("Queue masih kosong!"); cari = true;
        } else {
            System.out.printf("Posisi indeks data %d >> ", dt);
            for(int i = 0; i < max; i++){
                if(data[i] == dt){
                    System.out.printf("%d ", i);
                    cari = true;
                }
            }
        } if(!cari) System.out.printf("tidak ada!");
        System.out.println();
    }
        
    void peekAt (int pos){
        if(isEmpty()){
            System.out.println("Queue masih kosong!");
        } else {
            if(pos < max){
                if(data[pos] != 0){
                    System.out.println("Indeks "+pos+" berisi data "+data[pos]);
                } else {
                    System.out.println("Data kosong!");
                }
            } else {
                System.out.println("Indeks melebihi kapasitas!");
            }
        }
    }
}