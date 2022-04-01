package minggu7;
public class Kumpulan {
    int bil[] = {12,17,2,1,70,50,90,17,2,90};
                 //500,4,28,53,12,4,23,500,463,56,2,4,3,500,3};
 
    void bubbleSort(){
        for (int i=0; i<bil.length; i++) {
            for(int j=0; j<bil.length-1; j++){
                if(bil[j] > bil[j+1]){
                    int tempo = bil[j];
                    bil[j] = bil[j+1];
                    bil[j+1] = tempo;
                }
            }
        }
    }
    
        void printAwal(){
        for(int i=0; i<bil.length; i++){
        System.out.printf("%d ",bil[i]);
        }
        System.out.println();
    }    
        
    int binary(int max, int left, int right){
        for(int i=0; i<bil.length; i++){
        if(right >= left){
            int mid = (left+right)/2;
            if(max==bil[mid]){
                return mid;
            }else if(bil[mid] > max){;
                return binary(max, left, mid-1);
            }else{
                System.out.println("a");
                return binary(max, mid+1, right);
            }
          } 
        }
        return -1;
    }
    
    void printAkhir(int posisi){
        int jml = bil.length;
        System.out.printf("Nilai %d pada indeks : | ", bil[jml-1]);
        int kondisi = jml-posisi;
        for(int i=0; i<kondisi; i++){
            if(posisi!=-1){
                System.out.printf("%d ", (posisi+i));
            }
            System.out.print("| ");
        } 
        System.out.println();
    }
    
    public static void main(String[] args) {
        Kumpulan k = new Kumpulan();
        k.printAwal();
        k.bubbleSort();
        System.out.println("   Pengurutan Ascending");
        k.printAwal();
        int x = k.bil.length;
        int p = k.binary(k.bil[x-1], 0, x-1);
        System.out.println(p);
        System.out.println("      Nilai MAX ada "+(x-p));
        k.printAkhir(p);
    }
}