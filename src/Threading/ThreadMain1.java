package Threading;
class Thd extends Thread {
    String s;

    Thd(String s1) {
        s = s1;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(s);
        }
    }
}

public class ThreadMain1 {
    public static void main(String args[]) {
        Thd ob1 = new Thd("Thread1");
        Thd ob2 = new Thd("Thread2");

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}

