import javax.swing.*;


public class Pizzeria extends JFrame{
    private JPanel mainPanel = new JPanel(new BoxLayout());
    private JPanel outPanel = new JPanel();
    private JLabel sizeLabel = new JLabel();
    private JLabel toppingsLabel = new JLabel();
    private JLabel crustLabel = new JLabel();
    private JLabel withTag = new JLabel(" with ");
    private JRadioButton smallButton = new JRadioButton("Small");
    private JRadioButton mediumButton = new JRadioButton("Medium");
    private JRadioButton largeButton = new JRadioButton("Large");
    private JPanel toppingsPanel = new JPanel();
    private JComboBox pizzaType = new JComboBox();

    public Pizzeria(){
        this.add(mainPanel);
        mainPanel.add(outPanel);
        outPanel.add(sizeLabel);
        outPanel.add(crustLabel);
        outPanel.add(withTag);
        outPanel.add(toppingsLabel);
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallButton);
        sizeGroup.add(mediumButton);
        sizeGroup.add(largeButton);
        mainPanel.add(sizeGroup);
        String[] toppingsArray = {
            "Pepperoni",
            "Mushroom",
            "Extra cheese",
            "Sausage",
            "Onion",
            "Black olives",
            "Green pepper",
            "Fresh garlic",
            "Tomato",
            "Fresh basil",
            "Pineapple"
        };
        JCheckBox[] toppingsCheckBoxes = new JCheckBox[toppingsArray.length];
        for(int i = 0; i < toppingsArray.length; i++){
            toppingsCheckBoxes[i] = new JCheckBox(toppingsArray[i]);
            toppingsPanel.add(toppingsCheckBoxes[i]);
        }
        mainPanel.add(pizzaType);
        pizzaType.addItem("deep dish");
        pizzaType.addItem("thin crust");
        pizzaType.addItem("stuffed crust");

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
