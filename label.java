import javax.swing.*;
import java.awt.*;


public class label extends JLabel {
    label(){
        this.setVisible(true);
        this.setVerticalAlignment(CENTER);
        this.setHorizontalAlignment(CENTER);
        this.setFont(new Font("JetBrains mono",Font.BOLD,25));
    }
}