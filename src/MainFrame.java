import javax.swing.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame window = new JFrame("Fresh project");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}