package Threading;

class Table1{
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyyThread1 extends Thread {
    Table1 t;

    MyyThread1(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyyThread2 extends Thread {
    Table1 t;

    MyyThread2(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(9);
    }
}

public class TestSynchronization2 {
    public static void main(String args[]) {
        Table1 obj = new Table1(); 
        MyyThread1 t1 = new MyyThread1(obj);
        MyyThread2 t2 = new MyyThread2(obj);
        t1.start();
        t2.start();
    }
}
