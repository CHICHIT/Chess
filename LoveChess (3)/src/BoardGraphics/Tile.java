package BoardGraphics;

import javax.swing.*;
import BoardGraphics.SetBoardGraphic;
import ChessPiece.GameEnd;
import ChessPiece.Location;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import control.PlayChess;
import control.ShowCheck;


public class Tile extends JPanel{
   
   
   public Tile(int i, int j){
      
      Board board = new Board();
      
   setPreferredSize(new Dimension(80, 80));
   if((i+j)%2 !=0) {
      setBackground(Color.LIGHT_GRAY);
      
   }
   else
      setBackground(Color.white);
   
   
   
   addMouseListener(new MouseAdapter() {
      
      public void mouseClicked(MouseEvent e) {
         JPanel p = new JPanel();
         p = (JPanel) e.getSource();
         GameEnd GameEnd=new GameEnd();
         Location Lo = new Location();
         
         if(board.a) {
            if(board.squares[i][j]== p) {
               
                     
               board.tempx = i;
               board.tempy = j;
               if(Lo.loc[i][j]/16==board.turn)//�ڽ��� ���� �´� ��� �� �� �ִ� ��ġ�� ǥ��.
               {
                  
                  PlayChess.ShowPos();
               }
               //�ڽ��� ���� �ƴ� ��� �����ϰ� �ٽ� Ŭ���� ��ȸ�� ��.
            }
         }
         
         else if(board.a==false) {
            if(board.squares[i][j] == p) {
               board.row = i;
               board.col = j;
               
               if(Lo.loc[i][j]/16==board.turn)//�ڽ��� ���ʿ� �ٸ� �ڽ��� ���� Ŭ���Ͽ�����, �� ���� �������� �ű� �� �ִ� ��ġ�� ǥ��
               {
                  for(int i=0;i<8;i++)
                      for(int j=0; j<8; j++) {
                           if((i+j)%2 !=0) {
                              Board.squares[i][j].setBackground(Color.LIGHT_GRAY);
                              
                           }
                           else
                              Board.squares[i][j].setBackground(Color.white);
                           
                     }

                  board.tempx = i;
                  board.tempy = j;
                  PlayChess.ShowPos();
                  board.a = !board.a; 
               }
               else if(Lo.Pos[i][j]==0)//�ڽ��� ���ʿ� �ڽ��� �����ߴ� ���� �̵��� �� ���� ��ġ�� ������ ���, ����
               {
                  
               }
               else {//�� �ܿ� �̵��� �� �ִ� ��ġ�� ������ ��� �̵�.
               PlayChess.ShowMov();
               board.turn = 3 - board.turn;
               int ck=GameEnd.check(board.turn);//üũ�� ���� ����� �������� ����. 
               if(ck==1)
				{
				if(GameEnd.impos(board.turn) == 0) {
				      ShowCheck.CheckmateFrame();
				   }
				else
					ShowCheck.CheckFrame();
				}
               else
               {
            	   if(GameEnd.impos(board.turn) == 0) {
            		   ShowCheck.StalemateFrame();
 				   }
               }
              
				
               }
            }
            
      }
         
         System.out.println(board.turn);         
      }
   });
   
      
   }

}