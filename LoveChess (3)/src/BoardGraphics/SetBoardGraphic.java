package BoardGraphics;
import java.awt.BorderLayout;
/*
 * >>>> 그래픽
 *       초기 화면을 셋팅하는 클래스
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import BoardGraphics.Tile;
import ChessPiece.ChessPieceSprite;
import ChessPiece.ImagePanel;
import ChessPiece.Location;
import ChessPiece.ChessPieceSprite.ChessPieceSpriteType;

public class SetBoardGraphic extends JFrame{

  
 
   public SetBoardGraphic() {
     
	   
      JFrame frame = new JFrame("CHESS 1vs1");
      Board bd = new Board();
      Board.mode=1;
      Location.setArray(Board.mode);
      frame.setSize(640,640);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      
     
      
      JPanel CHBoard = new JPanel(new GridLayout(8, 8));
      
      for (int i = 0; i < bd.squares.length; i++) {
         for (int j = 0; j < bd.squares[i].length; j++) {            
            bd.squares[i][j] = new Tile(i,j);      
            
                 }
             }
      frame.setResizable(false);
      frame.setVisible(true);
      
      
      // fill the black non-pawn piece row
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
           
               CHBoard.add(bd.squares[i][j]);
               bd.squares[i][j].setLayout(null);
            
         }
      }
      frame.show();
      frame.add(CHBoard);
      
      PrintPiece printpiece = new PrintPiece();
      printpiece.PrintPiece1(bd.squares);
      



   }
}