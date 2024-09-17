package Threading;

class Share {
    String s;

    synchronized void readData(String s) {
        this.s = s;
        System.out.println("Reading " + s);
    }

    synchronized void writeData(String s) {
        this.s = s;
        System.out.println("Writing " + s);
    }
}

class Y extends Thread {
    Share s1, s2;

    Y(Share s1, Share s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run() {
        synchronized (s1) {
            s1.readData("Y");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            synchronized (s2) {
                s2.writeData("Y");
            }
        }
    }
}

class Z extends Thread {
    Share s1, s2;

    Z(Share s1, Share s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run() {
        synchronized (s1) { 
            synchronized (s2) { 
                s2.writeData("Z");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                s1.readData("Z");
            }
        }
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Share s1 = new Share();
        Share s2 = new Share();
        Y ob1 = new Y(s1, s2);
        Z ob2 = new Z(s1, s2);
        ob1.start();
        ob2.start();
    }
}
