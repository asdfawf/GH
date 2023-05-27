package practice;

import java.awt.*;
import javax.swing.*;

public class FlowLayout1 extends JFrame {	
	public FlowLayout1(){
		setTitle("Ten Color Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane=getContentPane();
		contentPane.setLayout(new GridLayout(1,10));

		Color [] color= {Color.RED,Color.ORANGE,Color.GREEN,Color.
				CYAN,Color.BLUE,Color.MAGENTA,
				Color.GRAY,Color.DARK_GRAY,
				Color.PINK,Color.LIGHT_GRAY};

		for(int i=0;i<10;i++) {
			JButton button=new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			contentPane.add(button);
		}
		setSize(500,200);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new FlowLayout1();
	}
}