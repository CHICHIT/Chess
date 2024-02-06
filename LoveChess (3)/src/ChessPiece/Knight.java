package ChessPiece;

import java.awt.Color;

import BoardGraphics.Board;

public class Knight extends Piece {

	/*Knight(int x, int y, int color, int type){
		this.x=x;
		this.y=y;
		this.color=color;
		this.type=type;
	}*/

	GameEnd GameEnd=new GameEnd();
	
	public void possible(int cur_x, int cur_y, int piece_type) {
      int team = piece_type / 16 ;
      int enemy = 3 - team;
      
      try   {
          if(loc[cur_x+2][cur_y+1] == 0) {
        	  Pos[cur_x+2][cur_y+1] = 1;
        	  Board.squares[cur_x+2][cur_y+1].setBackground(Color.GREEN);
          }
          if(loc[cur_x+2][cur_y+1]/16 == enemy) {
        	  Pos[cur_x+2][cur_y+1] = 1;
        	  Board.squares[cur_x+2][cur_y+1].setBackground(Color.RED);
          }
            
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x+2][cur_y-1] == 0) {
        	  Pos[cur_x+2][cur_y-1] = 1;
        	  Board.squares[cur_x+2][cur_y-1].setBackground(Color.GREEN);
          }
          if(loc[cur_x+2][cur_y-1]/16 == enemy) {
        	  Pos[cur_x+2][cur_y-1] = 1;
        	  Board.squares[cur_x+2][cur_y-1].setBackground(Color.RED);
          }
            
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x-2][cur_y+1] == 0) {
        	  Pos[cur_x-2][cur_y+1] = 1;
        	  Board.squares[cur_x-2][cur_y+1].setBackground(Color.GREEN);
          }
          if(loc[cur_x-2][cur_y+1]/16 == enemy) {
        	  Pos[cur_x-2][cur_y+1] = 1;
        	  Board.squares[cur_x-2][cur_y+1].setBackground(Color.RED);
          }
             
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x-2][cur_y-1] == 0) {
        	  Pos[cur_x-2][cur_y-1] = 1;
        	  Board.squares[cur_x-2][cur_y-1].setBackground(Color.GREEN);
          }
          if(loc[cur_x-2][cur_y-1]/16 == enemy) {
        	  Pos[cur_x-2][cur_y-1] = 1;
        	  Board.squares[cur_x-2][cur_y-1].setBackground(Color.RED);
          }
             
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x+1][cur_y+2] == 0) {
        	  Pos[cur_x+1][cur_y+2] = 1;
        	  Board.squares[cur_x+1][cur_y+2].setBackground(Color.GREEN);
          }
          
          
          if(loc[cur_x+1][cur_y+2]/16 == enemy) {
        	  Pos[cur_x+1][cur_y+2] = 1;
        	  Board.squares[cur_x+1][cur_y+2].setBackground(Color.RED);
          }
             
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x-1][cur_y+2] == 0) {
        	  Pos[cur_x-1][cur_y+2] = 1;
        	  Board.squares[cur_x-1][cur_y+2].setBackground(Color.GREEN);
          }
          if(loc[cur_x-1][cur_y+2]/16 == enemy) {
        	  Pos[cur_x-1][cur_y+2] = 1;
        	  Board.squares[cur_x-1][cur_y+2].setBackground(Color.RED);
          }
            
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x+1][cur_y-2] == 0) {
        	  Pos[cur_x+1][cur_y-2] = 1;
        	  Board.squares[cur_x+1][cur_y-2].setBackground(Color.GREEN);
          }
          if(loc[cur_x+1][cur_y-2]/16 == enemy) {
        	  Pos[cur_x+1][cur_y-2] = 1;
        	  Board.squares[cur_x+1][cur_y-2].setBackground(Color.RED);
          }
            
       }
       catch(ArrayIndexOutOfBoundsException e){}
       try {
          if(loc[cur_x-1][cur_y-2] == 0) {
        	  Pos[cur_x-1][cur_y-2] = 1;
        	  Board.squares[cur_x-1][cur_y-2].setBackground(Color.GREEN);
          }
          if(loc[cur_x-1][cur_y-2]/16 == enemy) {
        	  Pos[cur_x-1][cur_y-2] = 1;
        	  Board.squares[cur_x-1][cur_y-2].setBackground(Color.RED);
          }
            
       }
       catch(ArrayIndexOutOfBoundsException e){}
	
	
	
   }
	
	public void possible2(int cur_x, int cur_y, int piece_type) {
	      int team = piece_type / 16 ;
	      int enemy = 3 - team;
	      
	      try   {
	          if(loc[cur_x+2][cur_y+1] == 0) {
	        	  Pos[cur_x+2][cur_y+1] = 1;
	          }
	          if(loc[cur_x+2][cur_y+1]/16 == enemy) {
	        	  Pos[cur_x+2][cur_y+1] = 1;
	          }
	            
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x+2][cur_y-1] == 0) {
	        	  Pos[cur_x+2][cur_y-1] = 1;
	          }
	          if(loc[cur_x+2][cur_y-1]/16 == enemy) {
	        	  Pos[cur_x+2][cur_y-1] = 1;
	          }
	            
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x-2][cur_y+1] == 0) {
	        	  Pos[cur_x-2][cur_y+1] = 1;
	          }
	          if(loc[cur_x-2][cur_y+1]/16 == enemy) {
	        	  Pos[cur_x-2][cur_y+1] = 1;
	          }
	             
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x-2][cur_y-1] == 0) {
	        	  Pos[cur_x-2][cur_y-1] = 1;
	          }
	          if(loc[cur_x-2][cur_y-1]/16 == enemy) {
	        	  Pos[cur_x-2][cur_y-1] = 1;
	          }
	             
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x+1][cur_y+2] == 0) {
	        	  Pos[cur_x+1][cur_y+2] = 1;
	          }
	          
	          
	          if(loc[cur_x+1][cur_y+2]/16 == enemy) {
	        	  Pos[cur_x+1][cur_y+2] = 1;
	          }
	             
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x-1][cur_y+2] == 0) {
	        	  Pos[cur_x-1][cur_y+2] = 1;
	          }
	          if(loc[cur_x-1][cur_y+2]/16 == enemy) {
	        	  Pos[cur_x-1][cur_y+2] = 1;
	          }
	            
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x+1][cur_y-2] == 0) {
	        	  Pos[cur_x+1][cur_y-2] = 1;
	          }
	          if(loc[cur_x+1][cur_y-2]/16 == enemy) {
	        	  Pos[cur_x+1][cur_y-2] = 1;
	          }
	            
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
	       try {
	          if(loc[cur_x-1][cur_y-2] == 0) {
	        	  Pos[cur_x-1][cur_y-2] = 1;
	          }
	          if(loc[cur_x-1][cur_y-2]/16 == enemy) {
	        	  Pos[cur_x-1][cur_y-2] = 1;
	          }
	            
	       }
	       catch(ArrayIndexOutOfBoundsException e){}
		
		
		
	   }
}
