package minggu6;
public class TiketService {
    Tiket tikets[] = new Tiket[5];
    int idx;
    
    void tambah(Tiket t){
        if(idx<tikets.length){
            tikets[idx]=t;
            idx++;
        } else {
            System.out.println("Pesanan sudah maksimal!");
        }
    }
    
    void tampilAll(){
        for(Tiket t : tikets){
            t.tampilAll();
            System.out.println("----------------------------");
        }
    }
    
       
    void bubbleDesc(){
        for(int i=0; i<tikets.length-1; i++){
            for(int j=1; j<tikets.length-i; j++){
                if(tikets[j].harga > tikets[j-1].harga){
                    Tiket temp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = temp;
                }
            }
        }
    }
    
    void bubbleAsc(){
        for (int i =0; i<tikets.length-1; i++) {
            for (int j=0; j<tikets.length-i-1; j++) {
                if (tikets[j].harga > tikets[j+1].harga){
                    Tiket temp = tikets[j];
                    tikets[j] = tikets[j+1];
                    tikets[j+1] = temp;
                }  
            }
        }
    }
    
    void selectionAsc(){
        for(int i=0; i<tikets.length-1; i++){
            int idMin = i;
            for(int j=i+1; j<tikets.length; j++){
                if(tikets[j].harga < tikets[idMin].harga){
                    idMin = j;
                }
            }
            Tiket temp = tikets[idMin];
            tikets[idMin] = tikets[i];
            tikets[i] = temp;
        }
    }
}