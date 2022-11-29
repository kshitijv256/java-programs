public class GCDsoln {

    int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        GCDsoln obj = new GCDsoln();
        System.out.println(obj.gcd(4,6));
    }
}
