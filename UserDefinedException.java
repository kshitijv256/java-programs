class NotEqualException extends Exception{

    public NotEqualException(String message) {
        super(message);
    }
}

public class UserDefinedException {

    public static void checker(Float f1) throws NotEqualException{
        if (f1 != 3.14f){
            throw new NotEqualException("Float not Equal to 3.14");
        }
    }
    public static void main(String[] args){
        try{
            checker(3.12f);
        } catch (NotEqualException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
    }
}
