package ChessPiece;

import java.awt.Color;

import BoardGraphics.Board;

public class King extends Piece{

	/*King(int x, int y, int color, int type){
		this.x=x;
		this.y=y;
		this.color=color;
		this.type=type;
	}*/
	GameEnd GameEnd=new GameEnd();
	
	public void possible(int cur_x, int cur_y, int piece_type) {
			int team = piece_type/16;
			int enemy =  3 - team;
			if(cur_x+1<8) {
				if(loc[cur_x+1][cur_y]==0) {
					Pos[cur_x+1][cur_y]=1;
					Board.squares[cur_x+1][cur_y].setBackground(Color.GREEN);
				}
				if(loc[cur_x+1][cur_y]/16==enemy) {
					Pos[cur_x+1][cur_y]=1;
					Board.squares[cur_x+1][cur_y].setBackground(Color.RED);
				}
					Pos[cur_x+1][cur_y]=1;
			}
			
			if(cur_x+1<8&&cur_y+1<8) {
				if(loc[cur_x+1][cur_y+1]==0) {
					Pos[cur_x+1][cur_y+1]=1;
					Board.squares[cur_x+1][cur_y+1].setBackground(Color.GREEN);
				}
				if(loc[cur_x+1][cur_y+1]/16==enemy) {
					Pos[cur_x+1][cur_y+1]=1;
					Board.squares[cur_x+1][cur_y+1].setBackground(Color.RED);
				}
					
			}
			
			if(cur_x+1<8&&cur_y-1>=0) {
				if(loc[cur_x+1][cur_y-1]==0) {
					Pos[cur_x+1][cur_y-1]=1;
					Board.squares[cur_x+1][cur_y-1].setBackground(Color.GREEN);
				}
				if(loc[cur_x+1][cur_y-1]/16==enemy) {
					Pos[cur_x+1][cur_y-1]=1;
					Board.squares[cur_x+1][cur_y-1].setBackground(Color.RED);
				}
					
			}
			if(cur_y-1>=0) {
				if(loc[cur_x][cur_y-1]==0) {
					Pos[cur_x][cur_y-1]=1;
					Board.squares[cur_x][cur_y-1].setBackground(Color.GREEN);
				}
				if(loc[cur_x][cur_y-1]/16==enemy) {
					Pos[cur_x][cur_y-1]=1;
					Board.squares[cur_x][cur_y-1].setBackground(Color.RED);
				}
					
			}
			if(cur_y+1<8) {
				if(loc[cur_x][cur_y+1]==0) {
					Pos[cur_x][cur_y+1]=1;
					Board.squares[cur_x][cur_y+1].setBackground(Color.GREEN);
				}
				if(loc[cur_x][cur_y+1]/16==enemy) {
					Pos[cur_x][cur_y+1]=1;
					Board.squares[cur_x][cur_y+1].setBackground(Color.RED);
				}
			}
			if(cur_x-1>=0&&cur_y-1>=0) {
				if(loc[cur_x-1][cur_y-1]==0) {
					Pos[cur_x-1][cur_y-1]=1;
					Board.squares[cur_x-1][cur_y-1].setBackground(Color.GREEN);
				}
				if(loc[cur_x-1][cur_y-1]/16==enemy) {
					Pos[cur_x-1][cur_y-1]=1;
					Board.squares[cur_x-1][cur_y-1].setBackground(Color.RED);
				}
					
			}
			if(cur_x-1>=0){
				if(loc[cur_x-1][cur_y]==0) {
					Pos[cur_x-1][cur_y]=1;
					Board.squares[cur_x-1][cur_y].setBackground(Color.GREEN);
				}
				if(loc[cur_x-1][cur_y]/16==enemy) {
					Pos[cur_x-1][cur_y]=1;
					Board.squares[cur_x-1][cur_y].setBackground(Color.RED);
				}
					
			}
			if(cur_x-1>=0&&cur_y+1<8) {
				if(loc[cur_x-1][cur_y+1]==0) {
					Pos[cur_x-1][cur_y+1]=1;
					Board.squares[cur_x-1][cur_y+1].setBackground(Color.GREEN);
				}
				if(loc[cur_x-1][cur_y+1]/16==enemy) {
					Pos[cur_x-1][cur_y+1]=1;
					Board.squares[cur_x-1][cur_y+1].setBackground(Color.RED);
				}
					
		}
		Pos[cur_x][cur_y]=0;
		
	
	}
	public void possible2(int cur_x, int cur_y, int piece_type) {
		int team = piece_type/16;
		int enemy =  3 - team;
		if(cur_x+1<8) {
			if(loc[cur_x+1][cur_y]==0) {
				Pos[cur_x+1][cur_y]=1;
			}
			if(loc[cur_x+1][cur_y]/16==enemy) {
				Pos[cur_x+1][cur_y]=1;
			}
				Pos[cur_x+1][cur_y]=1;
		}
		
		if(cur_x+1<8&&cur_y+1<8) {
			if(loc[cur_x+1][cur_y+1]==0) {
				Pos[cur_x+1][cur_y+1]=1;
			}
			if(loc[cur_x+1][cur_y+1]/16==enemy) {
				Pos[cur_x+1][cur_y+1]=1;
			}
				
		}
		
		if(cur_x+1<8&&cur_y-1>=0) {
			if(loc[cur_x+1][cur_y-1]==0) {
				Pos[cur_x+1][cur_y-1]=1;
			}
			if(loc[cur_x+1][cur_y-1]/16==enemy) {
				Pos[cur_x+1][cur_y-1]=1;
			}
				
		}
		if(cur_y-1>=0) {
			if(loc[cur_x][cur_y-1]==0) {
				Pos[cur_x][cur_y-1]=1;
			}
			if(loc[cur_x][cur_y-1]/16==enemy) {
				Pos[cur_x][cur_y-1]=1;
			}
				
		}
		if(cur_y+1<8) {
			if(loc[cur_x][cur_y+1]==0) {
				Pos[cur_x][cur_y+1]=1;
			}
			if(loc[cur_x][cur_y+1]/16==enemy) {
				Pos[cur_x][cur_y+1]=1;
			}
		}
		if(cur_x-1>=0&&cur_y-1>=0) {
			if(loc[cur_x-1][cur_y-1]==0) {
				Pos[cur_x-1][cur_y-1]=1;
			}
			if(loc[cur_x-1][cur_y-1]/16==enemy) {
				Pos[cur_x-1][cur_y-1]=1;
			}
				
		}
		if(cur_x-1>=0){
			if(loc[cur_x-1][cur_y]==0) {
				Pos[cur_x-1][cur_y]=1;
			}
			if(loc[cur_x-1][cur_y]/16==enemy) {
				Pos[cur_x-1][cur_y]=1;
			}
				
		}
		if(cur_x-1>=0&&cur_y+1<8) {
			if(loc[cur_x-1][cur_y+1]==0) {
				Pos[cur_x-1][cur_y+1]=1;
			}
			if(loc[cur_x-1][cur_y+1]/16==enemy) {
				Pos[cur_x-1][cur_y+1]=1;
			}
				
	}
	Pos[cur_x][cur_y]=0;
	

}

}
