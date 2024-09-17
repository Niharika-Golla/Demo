package Threading;

class RunThread extends Thread {
    private String message;

    public RunThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        RunThread thread = new RunThread("Thread started....");
        thread.start();  
    }
}
