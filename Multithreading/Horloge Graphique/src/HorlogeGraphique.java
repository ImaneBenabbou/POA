import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class HorlogeGraphique extends JLabel {

    public HorlogeGraphique() {
        setFont(new Font("Arial", Font.BOLD, 40));
        setHorizontalAlignment(SwingConstants.CENTER);

        demarrerHorloge();
    }
    private void demarrerHorloge() {
        Runnable thread=new Runnable(){

            @Override
            public void run() {
                while(true){
                    LocalTime time=LocalTime.now();
                    setText(String.format("%02d:%02d",time.getMinute(),time.getSecond()));

                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(thread).start();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Horloge Graphique");
        frame.setSize(200, 200);
        frame.setContentPane(new HorlogeGraphique());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

