package Thread_pack;

public class InterThread implements Runnable{
	@Override
	public void run(){
		for (int i = 1; i < 6; i++){
			System.out.println("Num is: " + i);
		}
	}
}