
package BoardGraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

import control.PlayChess;
import BoardGraphics.Tile;
import ChessPiece.ChessPieceSprite;
import ChessPiece.ImagePanel;
import ChessPiece.ChessPieceSprite.ChessPieceSpriteType;

import java.awt.event.*;

public class ChessMain extends JFrame{
	//체스판 띄우기
	public ChessMain() {		
		JFrame frame= new JFrame("ChessMenu");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(720, 720);
		  frame.setLayout(null);
		  JLabel name = new JLabel("CHESS");
		  name.setFont(new Font("Serif", Font.BOLD, 30));
		  name.setLocation(300, 100);
		  name.setSize(200, 40);
		  frame.add(name);
		  JButton a = new JButton("1 VS 1");
		  a.setFont(new Font("Serif", Font.BOLD, 30));
		  a.setLocation(250, 250);
		  a.setSize(200, 80);
		  a.setBackground(new Color(160, 160, 225));
		  a.setForeground(Color.WHITE);
		  frame.add(a);
		  JButton b = new JButton("2 VS 2");
		  b.setFont(new Font("Serif", Font.BOLD, 30));
		  b.setLocation(250, 350);
		  b.setSize(200, 80);
		  b.setBackground(new Color(160, 160, 225));
		  b.setForeground(Color.WHITE);
		  frame.add(b);
		  JButton c = new JButton("EXIT");
		  c.setFont(new Font("Serif", Font.BOLD, 30));
		  c.setLocation(250, 450);
		  c.setSize(200, 80);
		  c.setBackground(new Color(160, 160, 225));
		  c.setForeground(Color.WHITE);
		  frame.add(c);
		  
		  a.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  
					  frame.dispose();
					  new SetBoardGraphic(); //1대1 소환
			  }
		  });
		
		  b.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  frame.dispose();
				  new SetBoardGraphic2();
			  }
		  });
		  
		  c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
				}
			});
		  
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
		
	}
	

		
	  public static void main(String[] args) throws IOException {
		  new ChessMain();
	  }
}
	  
	

	
	