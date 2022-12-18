package multiThreadingExamples;
class CA{
	
}
class MyTask extends CA implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("implements:"+i);
		
	}
	
}
public class App {

	
	//main method represents mainthread
	public static void main(String[] args) {
		// whatever we write in main is executed by main thread
		// thread always execute jobs in sequence
		
		MyTask m1=new MyTask();
		//Runnable r=new MyTask();
		Thread task=new Thread(m1);
		task.start();
		for(int i=0;i<10;++i)
		System.out.println("implemented:"+i);
	}

}
