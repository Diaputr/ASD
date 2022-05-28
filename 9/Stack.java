package minggu9;
public class Stack {
    int size, top;
    Pakaian[] data;

    Stack(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }
    
    boolean IsEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    boolean IsFull(){
        if(top == size-1){
            return true;
        } else{
            return false;
        }
    }
    
    void push(Pakaian pkn){
        if(!IsFull()){
            top++;
            data[top] = pkn;
        } else{
            System.out.println("ISI STACK SUDAH PENUH!\n");
        }
    }
    
    void pop(){
        if(!IsEmpty()){
            Pakaian x = data [top];
            top--;
            System.out.println("Data yang keluar : "+x.jenis+" "+x.warna+" "+x.merk+" "+x.ukuran+" "+x.harga+"\n");
        } else {
            System.out.println("Stack masih kosong!\n");
        }
    }
    
    void peek(){
        System.out.println("Elemen teratas : "+data[top].jenis+" "+data[top].warna+" "+data[top].merk+" "+data[top].ukuran+" "+data[top].harga+"\n");
    }
    
    void print(){
        System.out.println("Isi stack : ");
        for(int i = top; i>=0; i--){
            System.out.println(data[i].jenis+" "+data[i].warna+" "+data[i].merk+" "+data[i].ukuran+" "+data[i].harga);
        }
        System.out.println();
    }
    
    void clear(){
        if(!IsEmpty()){
            for(int i = top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan!\n");
        } else {
        System.out.println("Stack masih kosong!\n");
        }
    }
    
    void getMin(){
        double min = data[top].harga;
        int m = top;
        for(int i = top; i >= 0; i--){
            if(data[i].harga < min) m = i;
        }
        System.out.println("Data pakaian dengan harga terendah");
        System.out.println(data[m].jenis+" "+data[m].warna+" "+data[m].merk+" "+data[m].ukuran+" "+data[m].harga+"\n");
    }
}
