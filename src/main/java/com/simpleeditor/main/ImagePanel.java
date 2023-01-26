package com.simpleeditor.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImagePanel extends JLabel {
	Image image;

	int x;

	int y;

	int width;

	int height;

	public void drawGra(ImageIcon icon, int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		if (icon != null)
			this.image = icon.getImage();
		setOpaque(false);
		repaint();
	}

	public void drawGra(BufferedImage image, int x, int y, int width, int height) {
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setOpaque(false);
		repaint();
	}

	public void drawGra(Image image, int x, int y, int width, int height) {
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setOpaque(false);
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (this.image != null)
			g.drawImage(this.image, this.x, this.y, this.width, this.height, null);
		if (this.image == null)
			g.drawImage(null, 0, 0, 0, 0, null);
	}

	public void setBackground(Color bg) {
		super.setBackground(bg);
	}
}
