package UTS;
public class RekeningMethod {
    Rekening nasabah[] = new Rekening[3];
    int index;
    
    void isiData(Rekening rek){
        if(index < nasabah.length){
            nasabah[index] =  rek;
            index++;
        }
        
    }
    
    void tampil(){
        for(Rekening rek : nasabah){
            rek.tampil();
            System.out.println("----------------------------");
        }
    }
    
    void tampilan(){
        for(Rekening rek : nasabah){
            rek.tampil();
            System.out.println("----------------------------");
        }
        
        System.out.println("Rekening dengan saldo kurang dari Rp.5000");
        for (Rekening nasabah1 : nasabah) {
            if (nasabah1.saldo < 5000) {
                System.out.println(nasabah1.noRek);
            }
        }
    }
    
    void menu(){
        System.out.println("<<  MENU  >>");
        System.out.println("1. Penambahan data nasabah");
        System.out.println("2. Tampilan data nasabah");
        System.out.println("3. Pengurutan data nasabah");
        System.out.println("4. Pencarian data nasabah");
        System.out.println("5. Tarik saldo rekening");
        System.out.println("6. Setor saldo rekening");
        System.out.println("0. Keluar");
    }

    void bubbleDesc(){
        for(int i=0; i<nasabah.length-1; i++){
            for(int j=1; j<nasabah.length-i; j++){
                if(nasabah[j].saldo > nasabah[j-1].saldo){
                    Rekening temp = nasabah[j];
                    nasabah[j] = nasabah[j-1];
                    nasabah[j-1] = temp;
                }
            }
        }
    }
    
    int findSeqName(String panggil){
        int posisi = -1;
        for(int j=0; j<nasabah.length; j++){
            if(nasabah[j].nama.equals(panggil)){
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
            System.out.println("No Rekening : "+nasabah[pos].noRek);
            System.out.println("Nama Nasabah: "+x);
            System.out.println("Telp : "+nasabah[pos].telp);
            System.out.println("Email : "+nasabah[pos].email);
            System.out.println("Saldo : "+nasabah[pos].saldo);
        } else {
            System.out.println();
        }
    }
    
    int setorSaldo(int i, int uang){
        System.out.println("Saldo Rp."+nasabah[i].saldo);
        nasabah[i].saldo += uang;
        System.out.println("Saldo setelah transaksi Rp."+nasabah[i].saldo);
        return nasabah[i].saldo;
    }
    
    int tarikSaldo(int i, int uang){
        System.out.println("Saldo Rp."+nasabah[i].saldo);
        nasabah[i].saldo -= uang;
        System.out.println("Saldo setelah transaksi Rp."+nasabah[i].saldo);
        return nasabah[i].saldo;
    }
}