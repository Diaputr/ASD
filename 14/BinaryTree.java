package minggu14;
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }
    
    boolean isEmpty(){
        return root == null;
    }
    
    void addNode(int data){
        if(isEmpty()) root = new Node(data);
        else{
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    } 
                } else if (data > current.data){
                    if(current.right != null){
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else break;
            }
        }
    }
    

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            } else if (data < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }
    
    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    
    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }
    
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree kosong!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            } else if (data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if(current == null){
            System.out.println("Data tidak ditemukan!");
            return;
        } else {
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                } else {
                    if(isLeftChild){
                        parent.left = null;
                    } else{
                        parent.right = null;
                    }
                }
            } else if (current.left == null){
                if(current == root){
                    root = current.right;
                } else{
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null){
                if(current == root){
                    root = current.left;
                } else{
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    
    void insert(int dt){ 
        root = add(root, dt); 
    }   Node add(Node root, int dt){ 
        if (root == null) { 
            root = new Node(dt); 
            return root; 
        }
        if (dt < root.data)
            root.left = add(root.left, dt); 
        else if (dt > root.data)
            root.right = add(root.right, dt);
        return root; 
    } 

    void findMinMax() {
       if(isEmpty()){
           System.out.println("Tree Kosong!");
       }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Nilai min : "+current.data);
        
        current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Nilai max : "+current.data);
    }

    void printLeaf(Node n){
        if (isEmpty()){
            System.out.println("Tree kosong!");
        }
        if (n.left == null && n.right == null){
            System.out.print(n.data+" ");
        }
        if (n.left != null){
            printLeaf(n.left);
        }
        if (n.right != null){
            printLeaf(n.right);
        }
    }
}