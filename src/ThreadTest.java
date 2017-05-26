/**
 * Created by mpietrewicz on 2017-05-26.
 */
public class ThreadTest implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.run();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("run");
        }
    }
}
