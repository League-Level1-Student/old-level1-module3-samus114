import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTudor implements KeyListener {
	JFrame frame = new JFrame("Type or Die");
	char currentLetter;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		new TypingTudor().start();
	}

	void start() {
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
label.setFont(label.getFont().deriveFont(750.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("you typed " + arg0.getKeyChar());
		if (arg0.getKeyChar() == currentLetter) {
			panel.setBackground(new Color(0, 255, 0));
		} else {
			panel.setBackground(new Color(255, 0, 0));
		}
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}