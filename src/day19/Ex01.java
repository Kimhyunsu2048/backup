package day19;

import javax.swing.*;

public class Ex01 extends JFrame {	
	public Ex01() {
		super("연습01");
		setVisible(true);
		setSize(300,400);
		add(new JButton("테스트!"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex01();

	}
}
