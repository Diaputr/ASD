package minggu8;
public class Insertion {
    int[] data;
    int jml;

    Insertion(int[] data, int jml) {
        this.data = data;
        this.jml = jml;
        }
    
    void tampil(){
        for(int i=0; i<jml; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    
    void InsertSortA(){
        for(int i=1; i<=data.length-1; i++){
            int temp = data[i];
            int j = i-1;
            while (j>=0 && data[j] > temp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
    }
    
    void InsertSortD(){
        for(int i=0; i<data.length; i++){
            int temp = data[i];
            int j = i;
            while (j>0 && data[j-1] < temp){
                data[j] = data[j-1];
                j--;
            }
            data[j] = temp;
        }
    }
    
}