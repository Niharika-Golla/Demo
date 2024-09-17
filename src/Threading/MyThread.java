package Threading;

class MyThrd extends Thread {
    String s = null;

    MyThrd(String s1) {
        s = s1;
        start(); 
    }

    public void run() {
        System.out.println(s);
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThrd m1 = new MyThrd("Thread started....");
    }
}