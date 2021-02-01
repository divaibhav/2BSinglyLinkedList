package implementation;

public class Node {
    private int data;
    private Node next;

    //create getter and setter
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        next = null;
    }
}
