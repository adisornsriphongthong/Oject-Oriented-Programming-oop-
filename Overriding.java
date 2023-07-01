public class Overriding {
    public void display(){
        System.out.println("hello world");
    }
    
}

class OverridingTest extends Overriding{
    @Override
    public void display(){
        System.out.println("hello girl");
    }

    public static void main(String[] args) {
        OverridingTest over = new OverridingTest();
        over.display();  /*  output : ["hello girl"]    if not has the @Override on display() method in the subclass it shows "hello world"
                                                        as it overrides the method then shows "hello girl*/
    }
}      
