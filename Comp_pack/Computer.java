package Comp_pack;

public class Computer{
	public class Proccessor{
		private boolean running = false;

		public void start(){
			running = true;
		}

		public void shutdown(){
			running = false;
		}

		public String status(){
			return "Proccessor running status is " + running;
		}
	}

	public class RAM{
		private boolean running = false;

		public void start(){
			running = true;
		}

		public void shutdown(){
			running = false;
		}

		public String status(){
			return "RAM running status is " + running;
		}
	}

	public Proccessor i7 = new Proccessor();
	public RAM transfer = new RAM();


}