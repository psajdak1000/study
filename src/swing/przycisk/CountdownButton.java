package swing.przycisk;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CountdownButton {
    private JButton button;              // Przycisk
    private JPanel parentPanel;          // Panel, do którego przycisk zostanie dodany
    private int countdownValue = 10;     // Wartość początkowa odliczania
    private Thread countdownThread;      // Wątek, który tworzy odliczanie
    private boolean isRunning = false;   // Flaga wskazująca, czy trwa odliczanie
    private int clickCount = 0; //zlicza klikniecia na przycisk
    // Konstruktor klasy CountdownButton
    public CountdownButton(JPanel parentPanel, int x, int y) {
        this.parentPanel = parentPanel;

        // Inicjalizacja przycisku z początkową wartością odliczania
        button = new JButton(String.valueOf(countdownValue));
        button.setBounds(x, y, 60, 30); // Ustawienie pozycji i rozmiaru przycisku


        button.setBackground(generateRandomColor());
        parentPanel.add(button);       // Dodanie przycisku do panelu
        parentPanel.repaint();         // Odświeżenie panelu

        // Dodanie obsługi kliknięcia na przycisk
        button.addActionListener(e -> handleClick()); // Po kliknięciu resetuj odliczanie
    }

    //Funkcja do obslugi klikniecia na przycisk
    private void handleClick(){
        clickCount++;//zwieksz licznik klikniec na przycisk

        if (clickCount == 1) {
            restartCountdown(); // Odśwież odliczanie przy pierwszym kliknięciu
        } else if (clickCount == 2) {
            // Zmień kolor przycisku na nowy, losowy po drugim kliknięciu
            button.setBackground(generateRandomColor());
        } else if (clickCount >= 3) {
            // Usuń przycisk po trzech kliknięciach
            parentPanel.remove(button);
            parentPanel.repaint();
        }

    }

    private Color generateRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return new Color(red, green, blue);
    }

    // Funkcja odpowiedzialna za odświeżenie odliczania
    private void restartCountdown() {
        // Jeśli wątek odliczania działa, przerywamy go
        if (isRunning && countdownThread != null) {
            countdownThread.interrupt();
        }
        // Ustawienie wartości początkowej i uruchomienie nowego wątku odliczania
        countdownValue = 10;
        startCountdown();
    }

    // Funkcja odpowiedzialna za odliczanie
    public void startCountdown() {
        countdownThread = new Thread(() -> {
            isRunning = true; // Odliczanie jest aktywne

            try {
                for (int i = countdownValue; i >= 0; i--) {
                    countdownValue = i; // Aktualizacja wartości odliczania
                    int finalI = i;

                    // Aktualizacja tekstu przycisku w wątku graficznym
                    SwingUtilities.invokeLater(() -> button.setText(String.valueOf(finalI)));
                    Thread.sleep(1000); // Odczekanie 1 sekundy
                }

                // Po zakończeniu odliczania usuń przycisk
                SwingUtilities.invokeLater(() -> {
                    parentPanel.remove(button);
                    parentPanel.repaint();
                });
            } catch (InterruptedException ex) {
                // Wątek przerwany - kończymy bieżące odliczanie
            } finally {
                isRunning = false; // Odliczanie zakończone
            }
        });

        countdownThread.start();
    }
}