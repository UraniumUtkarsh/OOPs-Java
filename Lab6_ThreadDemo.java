import java.lang.*;
class ThreadDemo extends Thread{
    public void run(){
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo()
    }
}