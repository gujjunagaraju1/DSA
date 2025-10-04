package linkedlist;

class Node{
    private int data;
    private Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public void setData(int data){
        this.data=data;
    }

}
public class linkedlistCreation {
  private static  Node head;
    public static void insertatBegin(int data){
        Node newNode=new Node(data);
        if(head ==null){
            head=newNode;
            return;
        }
        newNode.setNext(head);
        head=newNode;

    }
    public static void insertatEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.getNext()!=null){
            currentNode=currentNode.getNext();
        }
        currentNode.setNext(newNode);

    }
    public static void display(){
        Node currentNode=head;
        while(head!=null){
            System.out.print(head.getData()+"---->");
            head=head.getNext();


        }
        System.out.println();
        head=currentNode;
    }
    public static void insertatPosition(int data,int position){

        Node newNode=new Node(data);
        Node current=head;
        if(position==1){
            insertatBegin(data);
            return;

        }
        int index=position-1;
        while(index>1){
            current=current.getNext();
            index--;

        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public static void main(String[] args) {
//        Node first=new Node(1);
//        Node second=new Node(3);
//        Node third=new Node(4);
//        first.setNext(second);
//        second.setNext(third);
//       head =first; //shallow copy
        insertatBegin(10);
        insertatBegin(20);
        insertatEnd(29);
        display();
        insertatBegin(30);
        insertatEnd(33);
        display();
        insertatPosition(3,3);
        display();
        insertatPosition(1,1);
        display();










    }


}
