class Calculator{
    int addition(int a, int b){
        return a+b;
    }
    int addition(int a, int b, int c){
        return a+b+c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition with 2 operands: "+c.addition(1, 2));
        System.out.println("Addition with 3 operands: "+c.addition(1, 2, 3));   
    }
}
