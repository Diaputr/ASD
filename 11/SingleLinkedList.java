package minggu11;
public class SingleLinkedList {
    Node head, tail;
    
    boolean isEmpty(){
        return head == null;
    }
    
    void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi linked list :\t");
            while(tmp!=null){
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else System.out.println("Linked list kosong!");
    }
    
    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node tmp = head;
        do {
            if(tmp.data == key){
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    void insertBefore(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
 	while (temp != null){
            if ((temp.data == key)&&(temp == head)){
 		this.addFirst(input);
 		break;
            } else if (temp.next.data == key){
 		ndInput.next = temp.next;
 		temp.next = ndInput;
 		break;
            }
            temp = temp.next;
 	}
    }
    
    void insertAt(int idx, int input){
        if(idx <0) System.out.println("Indeks salah!");
        else if(idx == 0) addFirst(input);
        else {
            Node tmp = head;
            for (int i = 0; i < idx-1; i++) tmp = tmp.next;
            tmp.next = new Node(input, tmp.next);
            if(tmp.next.next == null) tail = tmp.next;
        }
    }
    
    int getData(int idx){
        Node tmp = head;
        for(int i = 0; i < idx; i++) tmp = tmp.next;
        return tmp.data;
    }
    
    int indexOf(int key){
        Node tmp = head;
        int idx = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) return -1;
        else return idx;
    }
    
    void removeFirst(){
        if(isEmpty()){
           System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail) head = tail = null; 
        else head = head.next;
    }
    
    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if(head == tail) head = tail = null;
        else {
            Node tmp = head;
            while (tmp.next != tail) tmp = tmp.next;
            tmp.next = null;
            tail = tmp;
        }
    }
    
    void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else {
            Node tmp = head;
            while(tmp != null){
                if(tmp.data == key && tmp == head){
                    this.removeFirst();
                    break;
                } else if(tmp.next.data == key){
                    tmp.next = tmp.next.next;
                    if(tmp.next == null) tail = tmp;
                    break;
                } tmp = tmp.next;
            }
        }
    }
    
    void removeAt(int idx){
        if(idx == 0) removeFirst();
        else {
            Node tmp = head;
            for (int i = 0; i<idx-1; i++) tmp = tmp.next;
            tmp.next = tmp.next.next;
            if(tmp.next == null) tail = tmp;
        }
    }
}