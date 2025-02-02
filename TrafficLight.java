import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLight extends JPanel implements ActionListener {
	private JRadioButton rl;
	private JRadioButton r2;
	private JRadioButton r3;
	private Color red_c;
	private Color green_c;
	private Color orange_c;

	public TrafficLight() {
		setBounds(0, 0, 600, 480);
		rl = new JRadioButton("Red");
		r2 = new JRadioButton("Green");
		r3 = new JRadioButton("Orange");
		ButtonGroup group = new ButtonGroup();
		rl.setSelected(true);
		group.add(rl);
		group.add(r2);
		group.add(r3);
		add(rl);
		add(r2);
		add(r3);
		red_c = Color.red;
		green_c = getBackground();
		orange_c = getBackground();
		rl.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (rl.isSelected()) {
			red_c = Color.red;
			green_c = getBackground();
			orange_c = getBackground();
		} else if (r2.isSelected()) {
			red_c = getBackground();
			green_c = Color.green;
			orange_c = getBackground();
		} else if (r3.isSelected()) {
			red_c = getBackground();
			green_c = getBackground();
			orange_c = Color.orange;
		}
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50, 50, 50, 50);
		g.drawOval(50, 110, 50, 50);
		g.drawOval(50, 170, 50, 50);
		g.setColor(red_c);
		g.fillOval(50, 50, 50, 50);
		g.setColor(orange_c);
		g.fillOval(50, 110, 50, 50);
		g.setColor(green_c);
		g.fillOval(50, 170, 50, 50);
	}

	public static void main(String args[]) {
		JFrame fl = new JFrame();
		fl.setVisible(true);
		fl.setSize(600, 480);
		fl.setLayout(null);
		TrafficLight t = new TrafficLight();
		fl.add(t);
	}
}