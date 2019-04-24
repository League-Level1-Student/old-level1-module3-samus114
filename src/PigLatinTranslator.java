import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator {
	static JPanel panel = new JPanel();
	static JFrame frame = new JFrame();
	static JTextField field = new JTextField(10);
	static JTextField field2 = new JTextField(10);
public static void main(String[] args) {
frame.add(panel);
frame.setVisible(true);
panel.add(field);
panel.add(field2);
}

}