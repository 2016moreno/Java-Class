package lab17;

class Account {
	
	private int balance;
	public Account(int b) {
		balance = b;
	}
	public synchronized void deposit(int b) {
		balance += b;
	}
	
	public synchronized int getBalance(){
		return balance;	
		}
}
class MyThread implements Runnable {
		
		public Account a;
		public int t;
		public MyThread(Account a, int t) {
			this.a = a;
			this.t = t;
		}
		public void run() {
			System.out.println(t + " here");
			for(int i =0; i < 100; i++) {
				a.deposit(1);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(t + " " + a.getBalance());
		}
	}


public class Main {

	public static void main(String[] args) {
		
			Account  a = new Account(100);
			Thread  t1 = new Thread(new MyThread(a, 1)); // This is the way to instantiate a thread implementing runnable interface
			Thread  t2 = new Thread(new MyThread(a, 2)); // This is the way to instantiate a thread implementing runnable interface
			
			t1.start(); // starts the thread by running the run method
			t2.start(); // starts the thread by running the run method
			
			Thread  t3 = new Thread(new MyThread(a, 3)); // This is the way to instantiate a thread implementing runnable interface
			Thread  t4 = new Thread(new MyThread(a, 4)); // This is the way to instantiate a thread implementing runnable interface
			
			t3.start(); // starts the thread by running the run method
			t4.start(); // starts the thread by running the run method
		}
}
		



