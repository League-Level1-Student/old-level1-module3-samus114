import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		new WhackAMole().start();
	}

	void start() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1500,1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int random = new Random().nextInt(165);
		System.out.println(random);
		for (int i = 0; i < 165; i++) {
			JButton j = new JButton();
	j.setPreferredSize(new Dimension(120, 60));
			panel.add(j);
		}
		
	}
}