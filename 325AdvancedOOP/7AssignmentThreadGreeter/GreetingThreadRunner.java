import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.ResponseCache;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.ScrollPaneConstants;



/**
   This program runs two greeting threads in parallel.
*/
public class GreetingThreadRunner extends JFrame
{

   public static final String MESSAGE = "Hello from thread #";

   public static JTextArea outputArea;
   public static int delay;
   public static int reps;

   public JScrollPane scrollPane;
   public JPanel mainPanel;
   public JPanel optionsPanel;
   public JPanel quantityPanel;
   public JPanel delayPanel;
   public JPanel repsPanel;
   public JButton startButton;
   public JLabel quantityLabel;
   public JLabel delayLabel;
   public JLabel repsLabel;
   public static JTextField quantityTF;
   public static JTextField delayTF;
   public static JTextField repsTF;


   public GreetingThreadRunner(){
      //Thread[] threadArr = new Thread[10]
      //each indevidual thread can be a "new Thread(GreetingRunnable, i);"

      setSize(640,480);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainPanel = new JPanel(new BorderLayout());
      optionsPanel = new JPanel(new GridLayout(4,1));
      quantityPanel = new JPanel(new GridLayout(2,1));
      delayPanel = new JPanel(new GridLayout(2,1));
      repsPanel = new JPanel(new GridLayout(2,1));

      startButton = new JButton("Start");

      outputArea = new JTextArea();
      outputArea.setEditable(false);

      scrollPane = new JScrollPane(outputArea);
      scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

      quantityLabel = new JLabel("How many Threads");
      delayLabel = new JLabel("How much Delay");
      repsLabel = new JLabel("How many Repetitions");

      quantityTF = new JTextField();
      delayTF = new JTextField();
      repsTF = new JTextField();

      quantityPanel.add(quantityLabel);
      quantityPanel.add(quantityTF);

      delayPanel.add(delayLabel);
      delayPanel.add(delayTF);

      repsPanel.add(repsLabel);
      repsPanel.add(repsTF);

      optionsPanel.add(quantityPanel);
      optionsPanel.add(delayPanel);
      optionsPanel.add(repsPanel);
      optionsPanel.add(startButton);

      mainPanel.add(optionsPanel, BorderLayout.WEST);
      mainPanel.add(scrollPane, BorderLayout.CENTER);

      startButton.addActionListener(new StartListener());


      add(mainPanel);

      setVisible(true);
   }

   public static void main(String[] args)
   {
      new GreetingThreadRunner();

   }
}

class  StartListener implements ActionListener{
   @Override
   public void actionPerformed(ActionEvent e) {

      GreetingThreadRunner.outputArea.setText("");
      GreetingThreadRunner.delay = Integer.valueOf(GreetingThreadRunner.delayTF.getText());

      int listenerDelay = Integer.valueOf(GreetingThreadRunner.delayTF.getText());
      int listenerRep = Integer.valueOf(GreetingThreadRunner.repsTF.getText());
      int listenerQuantity = Integer.valueOf(GreetingThreadRunner.quantityTF.getText());

      GreetingThreadRunner.reps = listenerRep;

      Thread[] allThreads = new Thread[listenerQuantity];
      for(int i = 0; i < listenerQuantity; i++){
         allThreads[i] = new Thread(new GreetingRunnable(GreetingThreadRunner.MESSAGE, i));
      }

      for(Thread t : allThreads){
         t.start();
         try{
            Thread.sleep(listenerDelay/listenerQuantity);
         }
         catch (InterruptedException ex){}
      }
   }
}
