package minggu9;
public class StruckStack {
    int size, top;
    StrukBelanja[] data;

    StruckStack(int size) {
        this.size = size;
        data = new StrukBelanja[size];
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
    
    void push(StrukBelanja sb){
        if(!IsFull()){
            top++;
            data[top] = sb;
        } else{
            System.out.println("ISI LACI SUDAH PENUH!\n");
        }
    }
    
    void pop(int take){
        if(!IsEmpty()){
            for(int i = top; i >= size-take; i--){
                StrukBelanja x = data[top];
                top--;
                System.out.println(x.noTrans+" | "+x.tgl+" | "+x.jmlBarang+" | "+x.totalBayar);
            }
            System.out.println();
        } else {
            System.out.println("Laci masih kosong!\n");
        }
    }
    
    void peek(){
        System.out.println("Struk belanja teratas : "+data[top].noTrans+" | "+data[top].tgl+" | "+data[top].jmlBarang+" | "+data[top].totalBayar+"\n");
    }
    
    void print(){
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].noTrans+" | "+data[i].tgl+" | "+data[i].jmlBarang+" | "+data[i].totalBayar);
        }
        System.out.println();
    }
    
    void clear(){
        if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Laci sudah dikosongkan!\n");
        } else {
        System.out.println("Laci masih kosong!\n");
        }
    }
    
    void menu(){
        System.out.println("== MENU ==");
        System.out.println("1. Tambah");
        System.out.println("2. Ambil");
        System.out.println("3. Cek Isi");
        System.out.println("4. Struk Teratas");
        System.out.println("5. Buang");
        System.out.println("0. Keluar");
    }
}