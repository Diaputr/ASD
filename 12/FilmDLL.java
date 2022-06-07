package minggu12;
public class FilmDLL {
    FilmNode head; 
    int size;

    FilmDLL() {
        head = null;
        size = 0;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(Film item){
        if(isEmpty()){
            head = new FilmNode(null, item, null);
        } else {
            FilmNode newNode = new FilmNode(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("\nPenambahan berhasil!");
        size++;
    }   
    
    void addLast(Film item){
        if(isEmpty()){
            addFirst(item);
        } else {
        FilmNode current = head;
        while (current.next != null){
            current = current.next;
        }
        FilmNode newNode = new FilmNode(current, item, null);
        current.next = newNode; 
        System.out.println("\nPenambahan berhasil!");
        size++;
        }
    }
    
    void add(Film item, int idx) throws Exception{
        if(isEmpty()){
            addFirst(item);
        } else if (idx < 0 || idx > size){
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            FilmNode current = head;
            int i = 0;
            while (i<idx){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                FilmNode newNode = new FilmNode(null, item, current);
                head = newNode;
            } else {
                FilmNode newNode = new FilmNode(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
            System.out.println("\nPenambahan berhasil!");
        }
        size++;
    }
    
    
    void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Data kosong!");
        } else {
            System.out.println("Hapus Data Awal\n");
            head.data.tampil();
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Data kosong!");
        } else if(head.next == null){
            System.out.println("Hapus Data Akhir\n");
            head.data.tampil();
            head = null;
            size--;
            return;
        }
        FilmNode current = head;
        while (current.next.next != null){
            current = current.next;
        }
        System.out.println("Hapus Data Akhir\n");
        current.data.tampil();
        current.next = null;
        size--;
    }
    
    void remove(int idx) throws Exception{
        if(isEmpty() || idx >= size){
            throw new Exception("Nilai indeks di luar batas!");
        } else if(idx == 0){
            head.data.tampil();
            head = head.next;
            head.prev = null;
            size--;
        } else {
            FilmNode current = head;
            int i = 0;
            while (i < idx){
                current = current.next;
                i++;
            }
            current.data.tampil();
            if (current.next == null){
                current.prev.next = null;
            } else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
        
    void print(){
        if(!isEmpty()){
            FilmNode tmp = head;
            while (tmp != null){
                tmp.data.tampil();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Data kosong!\n");
        }
    }
    
        
    void find(int key){
        FilmNode tmp = head;
        int idx = 0;
        while (tmp != null && tmp.data.id != key){
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) System.out.println("Data tidak ditemukan!");
        else {
            System.out.println("Data ID "+key+" ditemukan pada node ke-"+idx);
            System.out.println("\nIDENTITAS");
            tmp.data.tampil();
        }
    }
        
    void sorting(){
        FilmNode current = head, index = null;
        Film temp;
        if (isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            System.out.println("Pengurutan Rating Film\n");
            while (current != null) {
                index = current.next;
                 while (index != null) {
                    if (current.data.rating < index.data.rating) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            } print();
        }
    }
}