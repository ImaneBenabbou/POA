public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadAlphabet('r','z'));
        Thread t2=new Thread(new ThreadAlphabet('A','Q'));
        Thread t3=new Thread(new EvenNumbersThread(1,60));

        t1.start();
        t2.start();
        t3.start();
    }
}
