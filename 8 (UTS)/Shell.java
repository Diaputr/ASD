package minggu8;
public class Shell {
    int data[];
    int jml;

    public Shell(int[] data, int jml) {
        this.data = data;
        this.jml = jml;
    }
    
    void tampil(){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    void shellSort(){
        int interval;
        for(interval = jml / 2; interval > 0; interval /= 2){
            for(int i = interval; i < jml; i += 1){
                int temp = data[i];
                int j;
                for(j = i; j >= interval && data[j-interval] > temp; j -= interval){
                    data[j] = data[j-interval];
                }
                data[j] = temp;
            }
        }
    }
}
