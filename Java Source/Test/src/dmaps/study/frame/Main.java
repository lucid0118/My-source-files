package dmaps.study.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main 
	implements ActionListener {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		Button changeColorButton = new Button("���򺯰�");
		
		jFrame.setLayout(new GridLayout(2, 1));
		
		Panel panel = new Panel();
		Label label = new Label();
		label.setText("������");
		panel.add(label);
		
		Panel btnPanel = new Panel();
		btnPanel.setLayout(new GridLayout(1, 3));
		btnPanel.add(changeColorButton);
		btnPanel.add(new Button());
		btnPanel.add(new Button());
	
		Button button[] = new Button[10];
		
		for(int i = 0; i < 10; i++) {
			button[i] = new Button(i + "");
		}
		
		changeColorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		jFrame.add(panel);
		jFrame.add(btnPanel);
		
		jFrame.setSize(500, 500
				);
		jFrame.setVisible(true);
	}
}