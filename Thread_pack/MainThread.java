package Thread_pack;


public class MainThread extends Thread{
	public void run(){
		for (int i = 1; i < 6; i++){
			System.out.println("Num is: " + i);
		}
	}
}