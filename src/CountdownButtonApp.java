import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CountdownButtonApp {
    public static void main(String[] args) {
        // Tworzenie głównej ramki
        JFrame frame = new JFrame("Countdown Button App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Tworzenie głównego panelu
        JPanel panel = new JPanel();
        panel.setLayout(null); // Ustawienie układu na null, aby można było ręcznie ustawiać pozycje
        frame.add(panel);

        // Obsługa kliknięcia na panel
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Tworzenie nowego przycisku poprzez wywołanie osobnej klasy
                CountdownButton countdownButton = new CountdownButton(panel, e.getX(), e.getY());
                countdownButton.startCountdown(); // Rozpoczęcie odliczania
            }
        });

        frame.setVisible(true);
    }
}