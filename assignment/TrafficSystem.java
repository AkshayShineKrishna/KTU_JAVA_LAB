import java.awt.*;
import java.awt.event.*;

public class TrafficSystem extends Frame implements ItemListener {

    Font titleFont, messageFont;
    Color color;
    Label title, message;
    Checkbox red, yellow, green;
    CheckboxGroup cbg;

    public TrafficSystem() {
        // Fonts
        titleFont = new Font("Arial", Font.BOLD, 15);
        messageFont = new Font("Arial", Font.BOLD, 50);

        // Labels
        title = new Label("TRAFFIC LIGHT SYSTEM");
        message = new Label(" ");

        // Checkboxes
        cbg = new CheckboxGroup();
        red = new Checkbox("Red", cbg, false);
        yellow = new Checkbox("Yellow", cbg, false);
        green = new Checkbox("Green", cbg, false);

        // Set fonts for labels
        title.setFont(titleFont);
        message.setFont(messageFont);

        // Set positions for labels and checkboxes
        title.setBounds(145, 10, 200, 150);
        message.setBounds(200, 145, 250, 70);
        red.setBounds(50, 130, 100, 20);
        yellow.setBounds(50, 160, 100, 20);
        green.setBounds(50, 190, 100, 20);

        // Add components to the frame
        add(red);
        add(yellow);
        add(green);
        add(title);
        add(message);

        // Add item listeners
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);

        // Set frame properties
        setLayout(null);
        setSize(500, 250);
        setTitle("Traffic System");
        setVisible(true);

        // Window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Display appropriate message based on selected checkbox
    void displayMessage() {
        Checkbox selectedCheckbox = cbg.getSelectedCheckbox();
        if (selectedCheckbox != null) {
            String selectedLabel = selectedCheckbox.getLabel();
            if (selectedLabel.equals("Red")) {
                message.setText("STOP");
                color = Color.RED;
                message.setForeground(color);
            } else if (selectedLabel.equals("Yellow")) {
                message.setText("READY");
                color = Color.YELLOW;
                message.setForeground(color);
            } else if (selectedLabel.equals("Green")) {
                message.setText("GO");
                color = Color.GREEN;
                message.setForeground(color);
            }
        }
    }

    public void itemStateChanged(ItemEvent e) {
        displayMessage();
    }

    public static void main(String[] args) {
        TrafficSystem trafficSystem = new TrafficSystem();
    }
}
