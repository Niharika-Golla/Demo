package Threading;

class Thr1 implements Runnable
{ Thread t; String s=null; 
Thr1(String s1)
{ s=s1;
 t=new Thread(this); 
t.start(); }
 public void run()
{ System.out.println(s); } }
 public class Runable
{ public static void main(String args[])
{ Thr1 m1=new Thr1("Thread started...."); } } 

