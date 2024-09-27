public class EvenNumbersThread extends Thread {
    private int n;
    private int m;

    public EvenNumbersThread(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public void run() {
        for(int i=n;i<=m;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
