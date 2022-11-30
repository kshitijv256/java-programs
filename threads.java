class threads extends Thread {
    public static void main(String[] args) {
        threads t = new threads();
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("outside the thread");
        }

    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("In the thread");
        }
    }
}