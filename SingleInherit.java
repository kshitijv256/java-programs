class SuperClass{
    SuperClass(){
        System.out.println("SuperClass Constructor");
    }
}
public class SingleInherit extends SuperClass{
    SingleInherit(){
        System.out.println("ChildClass Constructor");
    }
    public static void main(String[] args) {
        new SingleInherit();
    }
}
