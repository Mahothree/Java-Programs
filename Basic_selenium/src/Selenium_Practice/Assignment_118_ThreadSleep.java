package Selenium_Practice;

public class Assignment_118_ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			System.out.println("for loop with thread sleep of 2sec="+i);
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException a){
				System.out.println("delay");
			}
		}

	}

}
