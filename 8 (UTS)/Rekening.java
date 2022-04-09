package UTS;
public class Rekening {
    String noRek, nama, telp, email;
    int saldo;

    Rekening(String noRek, String nama, String telp, String email, int saldo) {
        this.noRek = noRek;
        this.nama = nama;
        this.telp = telp;
        this.email = email;
        this.saldo = saldo;
    }

    void tampil(){
        System.out.println("No Rekening : "+noRek);
        System.out.println("Nama Nasabah : "+nama);
        System.out.println("Telp : "+telp);
        System.out.println("Email : "+email);
        System.out.println("Saldo : Rp."+saldo);
    }
}