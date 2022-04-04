package minggu8;
public class NilaiMethod {
    Penilaian nilaiMhs[] = new Penilaian[5];
    int index;
    
    void isiData(Penilaian mhs){
        if(index < nilaiMhs.length){
            nilaiMhs[index] =  mhs;
            index++;
        }
    }
    
    void tampil(){
        for(Penilaian mhs : nilaiMhs){
            mhs.print();
            System.out.println("----------------------------");
        }
    }
    
    void insertionDesc(){
        for (int i=0; i<nilaiMhs.length; i++) {
            Penilaian temp = nilaiMhs[i];
            int j = i;
            while (j>=0 && nilaiMhs[j-1].total < temp.total) {
                nilaiMhs[j] = nilaiMhs[j-1];
                j--;
            }
            nilaiMhs[j] = temp;
        }
    }
    
    void terbaik(){
        System.out.println("Mahasiswa nilai terbaik : ");
        for(int i=0; i<3; i++){
            System.out.println((i+1)+" "+nilaiMhs[i].nama);
        }
    }
}