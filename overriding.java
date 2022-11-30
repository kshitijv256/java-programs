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
    void computeParent(int a, int b){
        super.compute(a,b);
    }
    public static void main(String[] args){
        overriding obj = new overriding();
        obj.compute(3,4);
        obj.computeParent(3,4);
    }
}
