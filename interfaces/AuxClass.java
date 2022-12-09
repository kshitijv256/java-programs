package interfaces;

public class AuxClass extends HiddenClass implements MyInterface{
    public void printer(){
        System.out.println("Working implementation");
    }

    @Override
    void myMethod() {
        System.out.println("My Hidden Method");
    }
}
