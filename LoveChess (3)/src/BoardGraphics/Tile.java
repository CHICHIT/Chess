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
               if(Lo.loc[i][j]/16==board.turn)//자신의 말이 맞는 경우 갈 수 있는 위치를 표시.
               {
                  
                  PlayChess.ShowPos();
               }
               //자신의 말이 아닐 경우 무시하고 다시 클릭할 기회를 줌.
            }
         }
         
         else if(board.a==false) {
            if(board.squares[i][j] == p) {
               board.row = i;
               board.col = j;
               
               if(Lo.loc[i][j]/16==board.turn)//자신의 차례에 다른 자신의 말을 클릭하였으면, 그 말을 기준으로 옮길 수 있는 위치를 표시
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
               else if(Lo.Pos[i][j]==0)//자신의 차례에 자신이 선택했던 말이 이동할 수 없는 위치를 선택할 경우, 무시
               {
                  
               }
               else {//그 외에 이동할 수 있는 위치를 선택할 경우 이동.
               PlayChess.ShowMov();
               board.turn = 3 - board.turn;
               int ck=GameEnd.check(board.turn);//체크는 아직 제대로 합쳐지지 않음. 
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