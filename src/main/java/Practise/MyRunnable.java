package Practise;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
    }
}
