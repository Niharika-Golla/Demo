package Threading;
class A extends Thread {
    public void run() {
        System.out.println("Thread A started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("thread A" + i);
        }
        System.out.println("exit from A");
    }
}
class B extends Thread {
    public void run() {
        System.out.println("Thread B started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("thread B" + i);
        }
        System.out.println("exit from B");
    }
}
class C extends Thread {
    public void run() {
        System.out.println("Thread C started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("thread C" + i);
        }
        System.out.println("exit from C");
    }
}
class threadPriority {
    public static void main(String args[]) {  	
    	Thread t = Thread.currentThread();
    	System.out.println("Current thread: " + t);
    	t.setName("My Thread");
    	System.out.println("After name change: " + t);
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        
        threadA.start();
        threadB.start();
        threadC.start();
    }
}

