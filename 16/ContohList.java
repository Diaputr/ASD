package minggu16;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ContohList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        //System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %d\n", l.get(0), l.size(), l.get(l.size()-1));
        System.out.println("Elemen 0 : "+l.get(0)+"\nTotal elemen : "+l.size()+"\nElemen terakhir : "+l.get(l.size()-1)+"\n");
        l.add(4);
        l.remove(0);
        System.out.println("Elemen 0 : "+l.get(0)+"\nTotal elemen : "+l.size()+"\nElemen terakhir : "+l.get(l.size()-1)+"\n");
        
        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleena");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.println("Elemen 0 : "+names.get(0)+"\nTotal elemen : "+names.size()+"\nElemen terakhir : "+names.get(l.size())+"\n");
        names.set(0, "My Kid");
        System.out.println("Elemen 0 : "+ names.get(0) +"\nTotal elemen : "+names.size()+"\nElemen terakhir : "+names.get(l.size())+"\n");
        System.out.println("Names : "+names.toString());
        
        LinkedList<String> nama = new LinkedList<>();
        nama.add("Koko");
        nama.add("Fizi");
        nama.set(1, "Susanti");
        nama.push("Mei-Mei");
        System.out.println("\nNama : "+nama.toString());
    }
}