package minggu11;
public class StackLLMain {
    public static void main(String[] args) {
        StackLL stLL = new StackLL();
        System.out.printf("POP ");
        stLL.pop();
        stLL.push("Bahasa");
        stLL.push("Android");
        stLL.push("Komputer");
        System.out.printf("PUSH ");
        stLL.print();
        stLL.push("Basis Data");
        stLL.push("Matematika");
        stLL.push("Algoritma");
        stLL.push("Statiska");
        stLL.push("Multimedia");
        System.out.printf("PUSH ");
        stLL.print();
        stLL.peek();
        System.out.printf("\nPOP ");
        stLL.pop();
        stLL.print();
        stLL.peek();
        System.out.printf("\nPOP ");
        stLL.pop();
        stLL.print();
    }
}