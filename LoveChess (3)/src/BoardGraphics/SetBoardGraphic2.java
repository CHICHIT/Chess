package BoardGraphics;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SetBoardGraphic2 extends JFrame {

	// private static final long serialVersionUID = 5701437994811736232L;
	int n = 0,m= 0;
	
	public SetBoardGraphic2() {
		Board bd = new Board();
		bd.mode =2;
		JFrame frame = new JFrame("CHESS 2vs2");
		frame.setSize(840, 840);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		
		JPanel CHBoard = new JPanel(new GridLayout(14,14));
				
		for (int i = 0; i < bd.squares2.length; i++) {
			for (int j = 0; j < bd.squares2[i].length; j++) {
				bd.squares2[i][j] = new Tile2(i,j);
				
				
			}
		} 
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		for (int i = 0; i<14; i++) {
			for (int j = 0; j<14; j++) {
				
					CHBoard.add(bd.squares2[i][j]);
					bd.squares2[i][j].setLayout(null);
					
			}
		}
		
		frame.add(CHBoard);
		
		PrintPiece printpiece2 = new PrintPiece();
	      printpiece2.PrintPiece2(bd.squares2);
	}
}