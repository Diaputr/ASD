package minggu11;
public class MhsQLL {
    MhsNode head, tail;
       
    boolean isEmpty(){
        return head == null;
    }
        
    void print(){
        if(!isEmpty()){
            MhsNode tmp = head;
            System.out.println("Antrian Mahasiswa :");
            while(tmp!=null){
                tmp.data.tampilMhs();
                tmp = tmp.next;
            }
            System.out.println();
        } else System.out.println("Antrian kosong!");
    }
        
    void enqueue(Mhs input){
        MhsNode ndInput = new MhsNode(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    MhsNode dequeue(){
        if(isEmpty()){
           System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian yang keluar : ");
            head.data.tampilMhs();
        }
            
        if (head == tail) head = tail = null;
        else head = head.next;
        return head;
    }
        
    void peek(){
        MhsNode tmp = head;
        if(isEmpty()){
            System.out.println("Antrian kosong!");
        } else{
            System.out.print("Antrian terdepan : ");
            tmp.data.tampilMhs();
        }
    }
    
    void peekRear(){
        MhsNode tmp = tail;
        if(isEmpty()){
            System.out.println("Antrian kosong!");
        } else{
            System.out.print("Antrian terakhir : ");
            tmp.data.tampilMhs();
        }
    }
    
       void peekPosition(String key){
        MhsNode tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.nim.equals(key)){
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) System.out.println("Antrian tidak ditemukan!");
        else {
            tmp.data.tampilMhs();
            System.out.println("Data ditemukan pada indeks : "+idx);
        }
    }
        
    void getData(int idx){
        MhsNode tmp = head;
        if(isEmpty()) System.out.println("Antrian Kosong!");
        else{
            for(int i = 0; i < idx; i++){
                tmp = tmp.next;
            }
            if(tmp == null) System.out.println("Antrian tidak ditemukan!");
            else {
                System.out.print("Data : ");
                tmp.data.tampilMhs();
            }
        }
    }
}