package mypack;

import pack.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}

// To run
// javac -d . B.java
// java mypack.B
