package com.simpleeditor.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class BWButton extends JButton {
	Font font1 = new Font("Book Antiqua", 1, 18);

	public BWButton() {
		setBackground(Color.black);
		setForeground(Color.white);
		setFocusPainted(false);
		setFont(this.font1);
	}
}
