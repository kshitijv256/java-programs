class ParentClass{
    void compute(int a,int b){
        System.out.println(a+b);
    }
}

class overriding extends ParentClass{

    @Override
    void compute(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        overriding obj = new overriding();
        obj.compute(3,4);
    }
}
