package minggu11;
public class StackLL{
    StackLLNode top;

    boolean isEmpty(){
        return top == null;
    }
    
    void push(String in){
        StackLLNode input = new StackLLNode(in, null);
        if (isEmpty()){
            top = input;
        } else {
            input.next = top;
            top = input;
        }
    }
    
    StackLLNode pop(){ 
        StackLLNode temp = null;
        if (isEmpty()){
            System.out.println("Stack kosong!\n");
        } else {
            temp = top;
            top = top.next;
        }
        return temp;
    }
    
    void peek(){
        StackLLNode tmp = top;
        if(isEmpty()){
            System.out.println("Stack kosong!\n")
        } else {
            System.out.println("TOP Data : "+tmp.data);
        }
    }
    
    void print(){
        StackLLNode current = top;
        System.out.println("Data :");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
