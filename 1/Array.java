package latihan;
public class Array {
    public static void main(String[] args) {
       
        int[][] royal = {{10,5,15,7},
			 {6,11,9,12},
                         {2,10,10,5},
			 {5,7,12,9}};
        
	int ag = 0, ke = 0, al = 0, ma = 0;
		
        //1
            for (int i = 0; i < royal.length; i++){
		for (int j = 0; j < royal[0].length; j++)
                    if (j==0){
                        ag += royal[i][0];
                    } else if (j==1){
			ke += royal[i][1];
                    } else if (j==2){
			al += royal[i][2];
                    } else {
                        ma += royal[i][3];
                    }
		}
			
            System.out.println("\nSTOK BUNGA ROYAL GARDEN");
            System.out.println("=========================================================");
            System.out.println("Stok bunga Aglonema = "+ag);
            System.out.println("Stok bunga Keladi = "+ke);
            System.out.println("Stok bunga Alocasia = "+al);
            System.out.println("Stok bunga Mawar = "+ma);
            System.out.println("=========================================================");
		
            /*2 Aglonema -1, Keladi -2, Alocasia -0, Mawar -5
            Aglonema = 75.000 , Keladi = 50.000, Alocasia = 60.000, Mawar = 10.000*/
		
            royal[0][0]-=1; royal[0][1]-=2; royal[0][3]-=5;

            for (int i = 0; i < royal[0].length; i++){
                if (i==0){
                    ag = royal[0][i] * 75000;
                } else if (i==1){
                    ke = royal[0][i] * 50000;
                } else if (i==2){
                    al = royal[0][i] * 60000;
                } else {
                    ma = royal[0][i] * 10000;
                }
            }
	int rp = ag + ke + al + ma;
	System.out.println("Jumlah penjualan Royal Garden 1 adalah Rp. "+ rp);
    }
}
