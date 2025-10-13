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
    public static void deletefrombegin(){

        head=head.getNext();
        if(head==null){
            return;
        }

    }
    public static void deletefromend(){
        Node currentNode=head;
        if(head==null){
              return;
        }
        if(head.getNext()==null){
            head=null;
            return;
        }

        while (currentNode.getNext().getNext()!=null){
            currentNode=currentNode.getNext();
        }
        currentNode.setNext(null);
    }
    public static void deleteatPosition(int position){
        Node currentNode=head;
        if(head==null){
            return;
        }
        if(position==1){
          deletefrombegin();
          return;
        }
        Node prev=null;
        for(int i=1;i<position && currentNode!=null;i++){
            prev=currentNode;
            currentNode=currentNode.getNext();


        }
        if(currentNode.getNext()==null){
            prev.setNext(null);
            return;
        }
        prev.setNext(currentNode.getNext());

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


        insertatEnd(29);
        display();
        insertatBegin(30);
        display();
        deleteatPosition(2);
        display();

    }


}
