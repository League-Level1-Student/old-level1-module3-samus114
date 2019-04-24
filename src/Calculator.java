import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField field = new JTextField(10);
	JTextField field2 = new JTextField(10);
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton addition = new JButton("add");
	JButton subtraction = new JButton("subtract");
	JButton divide = new JButton("divide");
	JButton multiply = new JButton("multiply");
	JLabel label = new JLabel();

	public static void main(String[] args) {
		new Calculator().start();
	}

	void start() {
		frame.add(panel);
		panel.add(addition);
		panel.add(divide);
		panel.add(multiply);
		panel.add(subtraction);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(0);
		panel.add(field);
		panel.add(field2);
		panel.add(label);
		frame.pack();
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
	}

	String multiply() {
		String field3 = field.getText();
		double field4 = Double.parseDouble(field3);
		String field5 = field2.getText();
		double field6 = Double.parseDouble(field5);
		return "" + (field4 * field6);
	}

	String add() {
		String add = field.getText();
		double add2 = Double.parseDouble(add);
		String add3 = field2.getText();
		double add4 = Double.parseDouble(add3);
		return "" + (add4 + add2);
	}

	String divide() {
		String divide = field.getText();
		double divide2 = Double.parseDouble(divide);
		String divide3 = field2.getText();
		double divide4 = Double.parseDouble(divide3);
		return "" + (divide2 / divide4);
	}

	String subtract() {
		String sub = field.getText();
		double sub2 = Double.parseDouble(sub);
		String sub3 = field2.getText();
		double sub4 = Double.parseDouble(sub3);
		return "" + (sub2 - sub4);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == addition) {
			label.setText(add());
		}
		if (arg0.getSource() == subtraction) {
			label.setText(subtract());
		}
		if (arg0.getSource() == divide) {
			label.setText(divide());
		}
		if (arg0.getSource() == multiply) {
			label.setText(multiply());
		}
	}
}