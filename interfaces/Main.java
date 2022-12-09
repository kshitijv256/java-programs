package interfaces;

public class Main {
    public static void main(String[] args) {
        MyInterface a = new AuxClass();
        a.printer();
        HiddenClass b = new AuxClass();
        b.myMethod();
    }
}
