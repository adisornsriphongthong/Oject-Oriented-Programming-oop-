import java.util.LinkedList;

public class Linked_List{
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        //******************************************
        
        linkedlist.push("A");
        //push is push value on top
        
        //****************************************** 

        linkedlist.add("B");
        //add able to add in any element by define like this add(4 , "H");
        //or add last element such as 0 1 2 3 add("h") h = 5;
 
        linkedlist.addFirst("0");
        //add first before element

        linkedlist.addLast("G");
        //add last bafter element

        //****************************************** 

        linkedlist.remove("B");
        //remove an element that's defined

        linkedlist.removeFirst();
        //remove frist an element

        linkedlist.removeLast();
        //remove last an element

        //****************************************** 

        linkedlist.poll();
        //remove frist an element

        linkedlist.pop();
        //remove last an element

        //******************************************
    }
    
}

class LinkedListMethod{
    LinkedList<String> linkedlist = new LinkedList<>();
}