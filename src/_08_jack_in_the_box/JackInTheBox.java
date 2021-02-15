package _08_jack_in_the_box;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JackInTheBox implements ActionListener{

public void Surprise(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500,500);
	JButton button = new JButton();
	frame.add(button);
	button.setText("Surprise");
	button.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
