import javax.swing.*;
public class PreQuizThreePractice extends JFrame{
        private JPanel panel = new JPanel();
        private JTextArea textArea = new JTextArea(10,50);
        private JScrollPane scrollPane = new JScrollPane(textArea);
    public PreQuizThreePractice(){
        this.setSize(400,400);
        this.add(panel);
        panel.add(scrollPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        PreQuizThreePractice pqtp = new PreQuizThreePractice();
    }

}
