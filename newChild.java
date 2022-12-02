class newParent {
    void method() {
        System.out.println("Parent's method()");
    }
}
class middleChild extends newParent {}

public class newChild extends middleChild {
    void method() {
        System.out.println("Child's method()");
        super.method();
    }
    public static void main(String[] args) {
        newChild obj = new newChild();
        obj.method();
    }    
}
