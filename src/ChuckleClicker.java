import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("joke");
	JButton button2 = new JButton("punchline");

	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}

	void makeButtons() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		button.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hi");
		if (e.getSource() == button) {
			String string = JOptionPane.showInputDialog("whats black, white, and red all over?");
			if (string.equalsIgnoreCase("a sunburnt penguin!")) {
				JOptionPane.showMessageDialog(null, "good job you got it!");
			} else {
				JOptionPane.showMessageDialog(null, "sorry, the answer was 'a sunburnt penguin' ");
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Why do teachers call it a spring break when they could more positively say its a Spring fix!");
		}
	}
}
