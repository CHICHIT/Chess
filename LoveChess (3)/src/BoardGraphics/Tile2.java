package BoardGraphics;

import javax.swing.*;
import BoardGraphics.SetBoardGraphic;
import ChessPiece.GameEnd;
import ChessPiece.Location;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import control.PlayChess;


public class Tile2 extends JPanel{
   
   
   public Tile2(int i, int j){
      
      Board board = new Board();
      
   setPreferredSize(new Dimension(60, 60));
   if((i % 2 == 1 && j % 2 ==1 ) || (i % 2 == 0 && j % 2 == 0)) {
		if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
		}
		else {
			setBackground(Color.WHITE);
		}
	}
	else {
		if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
		}
		else {
			setBackground(Color.LIGHT_GRAY);
		}
	}
   
   
   addMouseListener(new MouseAdapter() {
      
      public void mouseClicked(MouseEvent e) {
         JPanel p = new JPanel();
         p = (JPanel) e.getSource();
         GameEnd GameEnd=new GameEnd();
         Location Lo = new Location();
         
         if(board.a) {
            if(board.squares2[i][j]== p) {
               
                     
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
                  for(int i=0;i<14;i++)
                      for(int j=0; j<14; j++) {
                    	  if((i % 2 == 1 && j % 2 ==1 ) || (i % 2 == 0 && j % 2 == 0)) {
                    			if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
                    			}
                    			else {
                    				Board.squares2[i][j].setBackground(Color.WHITE);
                    			}
                    		}
                    		else {
                    			if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
                    			}
                    			else {
                    				Board.squares2[i][j].setBackground(Color.LIGHT_GRAY);
                    			}
                    		}
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
                  System.out.println(board.turn+"P is Checked");
               }
            }
            
      }
         
         System.out.println(board.turn);         
      }
   });
   
      
   }

}