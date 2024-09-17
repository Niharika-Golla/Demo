package niha;

class MyRunnable implements Runnable {
	 public static void main(String[] args) {
	        MyRunnable runnable = new MyRunnable();
	        Thread thread = new Thread(runnable);
	        thread.start();
	    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Implementing Runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



   
}