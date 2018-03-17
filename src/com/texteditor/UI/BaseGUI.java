package com.texteditor.UI;

import javax.swing.JFrame;

public class BaseGUI {
	public BaseGUI() {
		init();
	}
	private void init() {
		JFrame window = new JFrame("Text Editor");
		window.setSize(700, 800);
		window.setVisible(true);
	}
}
