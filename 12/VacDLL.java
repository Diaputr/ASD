package minggu12;
public class VacDLL {
    VacNode head;
    int size;
    
    VacDLL() {
        head = null;
        size = 0;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
        
    void enqueue(Vaccine item){
        if(isEmpty()){
            head = new VacNode(null, item, null);
        } else {
        VacNode current = head;
        while (current.next != null){
            current = current.next;
        }
        VacNode newNode = new VacNode(current, item, null);
        current.next = newNode;
        }
        size++;
        System.out.println("------------------------------");
        System.out.println("Berhasil ditambahkan!");
    }
    
    void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(head.data.nama+" telah selesai vaksin.");
            head = head.next;
            //head.prev = null;
            size--;
        }
    }
    
    void printAll(){
        if(!isEmpty()){
            VacNode tmp = head;
            System.out.println("No\t| \t Nama");
            System.out.println("------------------------------");
            while (tmp != null){
                tmp.data.print();
                tmp = tmp.next;
            }
            System.out.println("------------------------------");
            System.out.println("Sisa antrian : "+size);
        } else {
            System.out.println("Antrian kosong!");
        }
    }
}