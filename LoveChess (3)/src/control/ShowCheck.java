package control;

import javax.swing.JButton;
import javax.swing.JFrame;

import BoardGraphics.ChessMain;

import java.awt.event.*;
import java.io.IOException;

public class ShowCheck extends JFrame{

	public static void CheckFrame() {
	    JFrame inf = new JFrame("Information");
	    JButton showcheck = new JButton("Check");
	    inf.add(showcheck);
	    //JLabel check = new JLabel("             CHECK!");
	    inf.setSize(120, 90);
	    showcheck.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		inf.dispose();
	    	}
	    });
	    inf.setLocationRelativeTo(null);
	    inf.setVisible(true);
	  }
	public static void CheckmateFrame() {
	    JFrame inf = new JFrame("Information");
	    inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JButton ckmate = new JButton("CheckMate / Click x to finish Program");
	    inf.add(ckmate);
	    ckmate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		inf.dispose();
	    		new ChessMain();
	    	}
	    });
	    //JLabel check = new JLabel("             CHECK!");
	    inf.setSize(220, 90);
	    inf.setLocationRelativeTo(null);
	    inf.setVisible(true);
	  }
	public static void StalemateFrame() {
	    JFrame inf = new JFrame("Information");
	    inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JButton stmate = new JButton("Stalemate / Click x to finish Program");
	    
	    inf.add(stmate);
	    stmate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		inf.dispose();
	    		new ChessMain();
	    	}
	    });
	    //JLabel check = new JLabel("             CHECK!");
	    inf.setSize(220, 90);
	    inf.setLocationRelativeTo(null);
	    inf.setVisible(true);
	  }
}
