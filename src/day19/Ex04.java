package day19;

import java.awt.*;
import javax.swing.*;

public class Ex04 extends JFrame {
	public Ex04() {
		super("예제04");
		setVisible(true); 
		setSize(500,400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		String[] hobbies = {"수영","야구","축구","피아노","테니스"};
		
		JComboBox<String> box = new JComboBox<String>(hobbies);
		add(box);
		
		/*
		ButtonGroup bg = new ButtonGroup();
		JRadioButton[] buttons = new JRadioButton[hobbies.length];
		for(int i=0;i<hobbies.length;i++) {
			boolean selected = i==0?true:false;
			buttons[i] = new JRadioButton(hobbies[i], selected);
			bg.add(buttons[i]);
			add(buttons[i]);
		}		
		
		JCheckBox[] checkboxes = new JCheckBox[hobbies.length];
		
		for(int i=0;i<hobbies.length;i++) {
			checkboxes[i] = new JCheckBox(hobbies[i], true);
			add(checkboxes[i]);
		}
		*/
	}

	public static void main(String[] args) {
		new Ex04();
	}
}
