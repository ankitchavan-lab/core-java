package corejava.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Calla implements Callable<String> {

	// ReentrantLock rl = new ReentrantLock();
	// Condition c = rl.newCondition();

	@Override
	public String call() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello I'm From Call";
	}

	public static void main(String[] args) {

		ExecutorService exc = Executors.newFixedThreadPool(2);
		// Future f=exc.submit(new Calla());
		Future f = exc.submit(new Calla());
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exc.shutdown();
	}
}
