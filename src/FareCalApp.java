import view.MainFrame;

import javax.swing.*;

public class FareCalApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame f = new MainFrame();
            }
        });
    }
}