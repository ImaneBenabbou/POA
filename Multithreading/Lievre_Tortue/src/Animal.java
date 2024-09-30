public class Animal extends Thread {

    private static String vainqueur;
    private static int distanceTotale = 100;
    private int pas;

    public Animal(int pas) {
        super();
        this.pas = pas;
    }

    public void run() {
        courir();
    }

    private void courir() {
        String threadName = Thread.currentThread().getName();
        for (int dist = 1; dist <= distanceTotale; dist++) {
            System.out.println(threadName + ": " + dist + "m");

            if (threadName.equals("Lievre") && dist == 25) {
                try {
                    Thread.currentThread();
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (dist >= distanceTotale) {
                declareVainqueur(threadName);
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
        private synchronized void declareVainqueur (String threadName){
            if (vainqueur == null) {
                vainqueur = threadName;
                System.out.println("Le vainqueur est : " + vainqueur);
            }
        }
        public static void main (String[] args){
            Animal lievre = new Animal(10);
            Animal tortue = new Animal(1);
            lievre.setName("Lievre");
            tortue.setName("Tortue");
            lievre.start();
            tortue.start();
        }
}
