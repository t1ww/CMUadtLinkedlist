public class lList {
    // var init
    private Node head;
    private Node tail;
    // head
    public void setHead(Node head){
        this.head = head;
    }
    public Node getHead() {
        return this.head;
    }
    // tail
    public void setTail(Node tail){
        this.tail = tail;
    }
    public Node getTail(){
        return this.tail;
    }
    //
    //constructor
    lList(){
        setHead(null);
        setTail(null);
    }
    lList(Node head, Node tail){
        setHead(head);
        setTail(tail);
    }
    // add
    public void add(covidVaccine data){
        if(isEmpty()){
            Node temp = new Node(data);
            temp.setNext(getHead());
            setHead(temp);
        }else{
            add(getHead(),data);
        }
    }
    private void add(Node cur, covidVaccine data){ //add helper
        //if current node is the last one or in correct order, insert node
        if(cur.getNext() == null || cur.getNext().getData().getId() > data.getId()){
            Node temp = new Node(data);
            temp.setNext(cur.getNext());
            cur.setNext(temp);
            if(cur.getNext() == null){
                setTail(temp);
            }
        }else{
            add(cur.getNext(),data); // not the right target, move to next i
        }
    }
    // delete
    public void delete(int n){ // n = target node id
        if(isEmpty()){
            //cant find the node to delete
            System.out.println("node not found to delete");
        }else{
            if(getHead().getData().getId() == n){
                setHead(getHead().getNext());
            }else{
                delete(getHead(),n);
            }
        }
    }
    public void delete(Node cur, int n){ // delete helper
        if(cur.getNext() != null){
            if(cur.getNext().getData().getId() == n){
                cur.setNext(cur.getNext().getNext());
            }else{
                delete(cur.getNext(), n);
            }
        }
    }
    public void clear(){ // delete all
        setHead(null);
    }
    // checking methods
    public boolean isEmpty(){
        if(getHead() == null)
            return true;
        return false;
    } 
    // print list
    public void traversal() {
        //create a temp node pointing to head
        Node temp = new Node();
        temp = this.head;
        if(temp != null) { // not empty
        //   displaying the content and move to the 
        //   next node till the temp becomes null
          System.out.print("The list contains: ");
          while(temp != null) {
            System.out.println("\n//next node//");
            System.out.print(temp.data.toStrings() + " ");
            temp = temp.next;
          }
          System.out.println();
        } else {//  the list is empty
          System.out.println("The list is empty.");
        }
      } 
// main //
      public static void main(String[] args) {
        lList list = new lList();
        list.add(new covidVaccine(123456,"firstname",new String[] {"pfizer","moderna","corona"}));
        list.add(new covidVaccine(155746,"john",new String[] {"pfizer","moderna","corona","vaccine","idkanymore"}));
        list.add(new covidVaccine(258553,"xi",new String[] {"pfizer","moderna","corona"}));
        list.add(new covidVaccine(163556,"cam",new String[] {"pfizer","corona"}));
        list.add(new covidVaccine(158156,"audii",new String[] {"pfizer","moderna","corona"}));
        list.add(new covidVaccine(254843,"nabe",new String[] {"pfizer","moderna","corona"}));
        list.traversal();
        //random delete 2 nodes
        System.out.println("\nafter deletion/////////////////////////////////////////\n");
        list.delete(158156);
        list.delete(254843);
        list.traversal();
        System.out.println("\nafter delete all///////////////////////////////////////\n");
        list.clear();
        list.traversal();
        System.out.println("\n//End program\n");
    }
    public void randomDelete(){

    }
       
}