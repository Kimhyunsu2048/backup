package day19;

import java.awt.*;
import javax.swing.*;

public class Ex02 extends JFrame {
	public Ex02() {
		super("����02");
		setVisible(true); //â ���̱�
		setSize(300,400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//FlowLayout -> �帣���� ��ġ (��� ��ġ�� �⺻)
		//setLayout
		//FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		
		/*
		//add(Component c)
		for(int i=0;i<6;i++) {
			add(new JButton("��ư"+i));
		}
		
		//BorderLayout - ��������, ���
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		add("North",new JButton("��"));
		add("South",new JButton("��"));
		add("West",new JButton("��"));
		add("East",new JButton("��"));
		add("Center",new JButton("���"));
		*/
		
		//GridLayout -��, ��
		GridLayout layout = new GridLayout(3,3);
		setLayout(layout);
		
		for(int i =1;i<9;i++) {
			add(new JButton(String.valueOf(i)));			
		}
		
		
	}

	public static void main(String[] args) {
		new Ex02();
		
	}
}