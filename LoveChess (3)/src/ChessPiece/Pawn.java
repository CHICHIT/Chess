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

		//최초의 움직임
	      if(cur_x == -5 * team +11)
	      {
	         //System.out.println("첫 움직임");
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;
	        	 Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);
	        	 
	        		 
	         }
	            
	         if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
	        	 Pos[cur_x-2*t][cur_y] = 1;
	        	 Board.squares[cur_x-2*t][cur_y].setBackground(Color.GREEN);
	         }
	            
	         
	      }
	      
	      //최초가 아닌 경우의 움직임
	      else
	      {
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;
	        	 Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);
	         }
	           
	      }
	
	    //폰의 다른 말 잡기
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

		//최초의 움직임
	      if(cur_x == -5 * team +11)
	      {
	         //System.out.println("첫 움직임");
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;    	 
	        		 
	         }
	            
	         if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
	        	 Pos[cur_x-2*t][cur_y] = 1;
	         }
	            
	         
	      }
	      
	      //최초가 아닌 경우의 움직임
	      else
	      {
	         if((loc[cur_x-t][cur_y]/16) == 0) {
	        	 Pos[cur_x-t][cur_y] = 1;
	         }
	      
	           
	      }
	
	    //폰의 다른 말 잡기
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
