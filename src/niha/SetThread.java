package niha;

 class SetThread extends Thread
 {
	public void run() 
	{
		
	}
	public static void main(String args[]) {
		SetThread obj = new SetThread();
		obj.start();
		
		System.out.println("before setting the priority");
		System.out.println("thread 1 : " + obj.getPriority());
		obj.setPriority(MAX_PRIORITY);
		System.out.println("after setting the priority");
		System.out.println("thread 1 : " + obj.getPriority());
	}
	

}
