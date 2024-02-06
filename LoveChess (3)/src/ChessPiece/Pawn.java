package ChessPiece;

import java.awt.Color;

import BoardGraphics.Board;

public class Pawn extends Piece{

	/*Pawn(int x, int y, int color, int type){
		this.x=x;
		this.y=y;
		this.color=color;
		this.type=type;
	}*/
	
	GameEnd GameEnd=new GameEnd();
	
	public void possible(int cur_x, int cur_y, int piece_type) {
		int team = piece_type / 16 ;
		int enemy = 3 - team;
		int t = 3 - 2 * team ;

		//������ ������
	      if(cur_x == -5 * team +11)
	      {
	         //System.out.println("ù ������");
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;
	        	 Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);
	        	 
	        		 
	         }
	            
	         if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
	        	 Pos[cur_x-2*t][cur_y] = 1;
	        	 Board.squares[cur_x-2*t][cur_y].setBackground(Color.GREEN);
	         }
	            
	         
	      }
	      
	      //���ʰ� �ƴ� ����� ������
	      else
	      {
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;
	        	 Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);
	         }
	           
	      }
	
	    //���� �ٸ� �� ���
	      if(cur_y==0)
	        {
	        if((loc[cur_x-t][cur_y+1]/16) == enemy) {
	        	Pos[cur_x-t][cur_y+1] = 1;
	        	Board.squares[cur_x-t][cur_y+1].setBackground(Color.RED);
	        }
	           
	        }
	      
	        else if(cur_y==7)
	        {
	        if((loc[cur_x-t][cur_y-1]/16) == enemy) {
	        	 Pos[cur_x-t][cur_y-1] = 1;
	        	 Board.squares[cur_x-t][cur_y-1].setBackground(Color.RED);
	        }
	           
	        }
	        else 
	        {
	        if((loc[cur_x-t][cur_y-t]/16) == enemy) {
	        	 Pos[cur_x-t][cur_y-t] = 1;
	        	 Board.squares[cur_x-t][cur_y-t].setBackground(Color.RED);
	        }
	          
	        if((loc[cur_x-t][cur_y+t]/16) == enemy) {
	        	 Pos[cur_x-t][cur_y+t] = 1;
	        	 Board.squares[cur_x-t][cur_y+t].setBackground(Color.RED);
	        }
	          
	        }
	}

	public void possible2(int cur_x, int cur_y, int piece_type) {
		int team = piece_type / 16 ;
		int enemy = 3 - team;
		int t = 3 - 2 * team ;

		//������ ������
	      if(cur_x == -5 * team +11)
	      {
	         //System.out.println("ù ������");
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;    	 
	        		 
	         }
	            
	         if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
	        	 Pos[cur_x-2*t][cur_y] = 1;
	         }
	            
	         
	      }
	      
	      //���ʰ� �ƴ� ����� ������
	      else
	      {
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;
	         }
	      
	           
	      }
	
	    //���� �ٸ� �� ���
	      if(cur_y==0)
	        {
	        if((loc[cur_x-t][cur_y+1]/16) == enemy) {
	        	Pos[cur_x-t][cur_y+1] = 1;
	        }
	           
	        }
	      
	        else if(cur_y==7)
	        {
	        if((loc[cur_x-t][cur_y-1]/16) == enemy) {
	        	 Pos[cur_x-t][cur_y-1] = 1;
	        }
	           
	        }
	        else 
	        {
	        if((loc[cur_x-t][cur_y-t]/16) == enemy) {
	        	 Pos[cur_x-t][cur_y-t] = 1;
	        }
	          
	        if((loc[cur_x-t][cur_y+t]/16) == enemy) {
	        	 Pos[cur_x-t][cur_y+t] = 1;
	        }
	          
	        }
	}

}
