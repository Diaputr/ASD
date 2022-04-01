package minggu7;
public class PencarianMhs {
    Mhs listMhs[];
    int idx;

    PencarianMhs(int e) {
        listMhs = new Mhs[e];
        System.out.println("---------------------------------------");
    }
    
    void tambah(Mhs m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    void bubbleSort(){ //1
        for (Mhs m : listMhs) {
            for(int j=0; j<listMhs.length-1; j++){
                if(listMhs[j].nim > listMhs[j+1].nim){
                    Mhs tmp = listMhs[j];
                    listMhs[j] = listMhs[j+1];
                    listMhs[j+1] = tmp;
                }
            }
        }
    }
    
    void tampil(){
        for(Mhs m : listMhs){
        m.tampil();
        System.out.println("---------------------------------------");
        }
    }
    
    int findSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+right)/2;
            if(cari==listMhs[mid].nim){
                return mid;
            }else if(listMhs[mid].nim > cari){
                return findBinarySearch(cari, left, mid-1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
    void tampilPosisi(int x, int pos){
        if(pos!=-1){
            System.out.printf("Data %d ditemukan di indeks %d\n", x, pos);
        } else {
            System.out.printf("Data %d tidak ditemukan!",x);
        }
    }
    
    void tampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("NIM : "+x);
            System.out.println("Nama : "+listMhs[pos].nama);
            System.out.println("Umur : "+listMhs[pos].umur);
            System.out.println("IPK : "+listMhs[pos].ipk);
        } else {
            System.out.println();
        }
    }
    
    int findSeqName(String panggil){//2
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equals(panggil)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }    
        
    void tampilPos(String x, int pos){
        if(pos!=-1){
            System.out.printf("%s ditemukan di indeks %d\n", x, pos);
        } else {
            System.out.printf("%s tidak ditemukan!",x);
        }
    }
    
    void tampilNama(String x, int pos){
        if(pos!=-1){
            System.out.println("NIM : "+listMhs[pos].nim);
            System.out.println("Nama : "+x);
            System.out.println("Umur : "+listMhs[pos].umur);
            System.out.println("IPK : "+listMhs[pos].ipk);
        } else {
            System.out.println();
        }
    }
}