public class Node {
    // var
    covidVaccine data; //data
    Node next; // pointer
    public Node(){
        this.data = new covidVaccine();
        this.next = null; // no other node yet
    }
    public Node(covidVaccine data){
        this.data = data;
    }
    public Node(covidVaccine data,int p){
        this.data = data;
    }
    public void setData(covidVaccine data){
        this.data = data;
    }
    public covidVaccine getData(){
        return this.data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public String toStrings(){
        return "node id : " + data.getId()
        + "\n" + data.toString();
    }
}