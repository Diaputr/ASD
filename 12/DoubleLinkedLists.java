package minggu12;
public class DoubleLinkedLists {
    Node head; int size;

    DoubleLinkedLists() {
        head = null;
        size = 0;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(int item){
        if(isEmpty()){
            head = new Node(item, null, null);
        } else {
            Node newNode = new Node(item, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        } else {
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        Node newNode = new Node(item, current, null);
        current.next = newNode;
        size++;
        }
    }
    
    void add(int item, int idx) throws Exception{
        if(isEmpty()){
            addFirst(item);
        } else if (idx < 0 || idx > size){
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            Node current = head;
            int i = 0;
            while (i<idx){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(item, null, current);
                head = newNode;
            } else {
                Node newNode = new Node(item, current.prev, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    int size(){
        return size;
    }
    
    void clear(){
        head = null;
        size = 0;
    }
    
    void print(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi!");
        } else {
            System.out.println("Linked lists kosong!");
        }
    }

    void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    void remove(int idx) throws Exception{
        if(isEmpty() || idx >= size){
            throw new Exception("Nilai indeks di luar batas!");
        } else if(idx == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < idx){
                current = current.next;
                i++;
            }
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
    
    int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong!");
        } 
        return head.data;
    }
    
    int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong!");
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    int get(int idx) throws Exception{
        if(isEmpty() || idx >= size){
            throw new Exception("Nilai indeks di luar batas!");
        }
        Node tmp = head;
        for(int i = 0; i < idx; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
}