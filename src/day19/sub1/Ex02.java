package day19.sub1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex02 extends JFrame {
	
	private JTextField tf;
	
	public Ex02() {
		super("¿¹Á¦02");
		setSize(300,400); 
		setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		tf = new JTextField(30);
		add(tf);
		
		tf.addKeyListener(new KeyEventHandle());	
	}

	public static void main(String[] args) {
		new Ex02();
	}
	
	class KeyEventHandle extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int code = e.getKeyCode();
			String key = KeyEvent.getKeyText(code);
			System.out.println("code="+code+"key="+key);
			
		}	
	}
}
