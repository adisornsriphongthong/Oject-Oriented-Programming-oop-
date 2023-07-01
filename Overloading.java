public class Overloading {
                   //paramiter
    public int add(int a, int b){
        return a + b;
    }
    public int add(){
        return 5;
    }

    public static void main(String[] args) {
        Overloading over = new Overloading();

        System.out.println(over.add(5, 5)); //output : [10]
        System.out.println(over.add());         //output : [5]
    }
}
