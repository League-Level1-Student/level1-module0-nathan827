package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie  implements ActionListener{
public void showButton() {
	
JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500,500);
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	
		int rand = new Random().nextInt(5);
if(rand == 0) {
	JOptionPane.showMessageDialog(null, "You will live a long life");
}
else if (rand == 1) {
	JOptionPane.showMessageDialog(null, "You will be very rich");
}
else if (rand == 2) {
	JOptionPane.showMessageDialog(null, "You will have a healthy family");
}
else if (rand == 3) {
	JOptionPane.showMessageDialog(null, "You will very happily");
}
else {
	JOptionPane.showMessageDialog(null, "You will be very smart");
}
}
}
