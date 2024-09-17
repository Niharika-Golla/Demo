package Threading;

import java.io.IOException;

class Mytrd extends Thread {
    boolean stop = false;

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (stop)
                return;
        }
    }
}

public class ThreadMain {
    public static void main(String args[]) {
        Mytrd obj = new Mytrd();
        Thread t = new Thread(obj);
        t.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        obj.stop = true;
    }
}
