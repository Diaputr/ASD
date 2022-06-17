package minggu16;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        for(String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n"+fruits.toString());
        
        System.out.println("Peek : "+fruits.peek());
        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
        System.out.print("\nKosong : "+fruits.isEmpty());
        
        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println();
        
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ",fruit);
        }
        
        System.out.println();
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println();
        for(int i = 0; i < fruits.size(); i++){
            System.out.printf("%s ",fruits.get(i));
        }
        System.out.println("\nSize : "+fruits.size());
        fruits.insertElementAt("Strawberry", 0);
        //fruits.push("Strawberry(-)");
        System.out.println("----------------------");
        System.out.println("Size : "+fruits.size());
        System.out.println("Last : "+fruits.lastElement());
        System.out.println("Peek : "+fruits.peek());
        System.out.println("Bottom : "+fruits.get(0));
        
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        Collections.sort(fruits);
        System.out.println(fruits.toString());
    } 
}