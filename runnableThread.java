public class runnableThread implements Runnable {
    public static void main(String[] args) {
        runnableThread r = new runnableThread();
        Thread t = new Thread(r);
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
