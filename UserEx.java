class WrongAge extends Exception {
    public WrongAge(String msg) {
        super(msg);
    }
}

public class UserEx {

    static void checker(int age) throws WrongAge {
        if (age<18){
            throw new WrongAge("Cannot Access");
        }
        else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        try{
            checker(15);
        }
        catch (WrongAge e){
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
