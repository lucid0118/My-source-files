package com.dmaps.study.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dmaps.study.listener.MouseManagementListener;

public class PhotoFrame extends JFrame{
	
	private int index = 0;
	
	private BufferedImage img;
	private ImageIcon image;

	private JPanel panel;

	public PhotoFrame() {
		createFrame();
	}
	
	public void createFrame() {
		
		index++;
		
		if(index == 4)
			return;
		
		image = new ImageIcon("C:\\Users\\DOGN\\Desktop\\" + index + ".png");
		
		panel = new JPanel() {
			
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);	
				
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		try {
			img = ImageIO.read(new File("C:\\Users\\DOGN\\Desktop\\" + index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		panel.addMouseListener(new MouseManagementListener(this, img));
		panel.addMouseMotionListener(new MouseManagementListener(this, img));
		
		this.add(panel);
		this.setSize(1200, 700);
		this.setVisible(true);
	}
	
}