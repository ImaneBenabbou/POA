public class ThreadAlphabet implements Runnable{
    private char x;
    private char y;

    public ThreadAlphabet(char x, char y) {
        this.x = x;
        this.y = y;
    }
    public void run() {
        for(char c=x; c<=y; c++){
            System.out.print(c+" ");
        }
    }

}
