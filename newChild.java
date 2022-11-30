class newParent {
    void method() {
        System.out.println("Parent's method()");
    }
}
public class newChild extends newParent {
    void method() {
        System.out.println("Child's method()");
        super.method();
    }
    public static void main(String[] args) {
        newChild obj = new newChild();
        obj.method();
    }    
}
