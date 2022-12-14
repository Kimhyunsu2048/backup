package day19;

import java.awt.*;
import javax.swing.*;

public class Ex05 extends JFrame {
	public Ex05() {
		super("연습05");
		setVisible(true); 
		setSize(300,200); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add("North",new JLabel("테이블",SwingConstants.CENTER));
				
		String[] headers = {"항목1", "항목2", "항목3"};
		Integer[][] rowData = {{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9}};
		JTable table = new JTable(rowData,headers); 
		JScrollPane jsp = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add("Center",table);		
	}
	
	public static void main(String[] args) {
		new Ex05();		
	}	
}
