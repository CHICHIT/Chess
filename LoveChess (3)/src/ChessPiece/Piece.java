package ChessPiece;

import java.awt.BorderLayout;
import java.awt.Color;

import BoardGraphics.Board;
import ChessPiece.ChessPieceSprite;
import ChessPiece.ImagePanel;
import ChessPiece.ChessPieceSprite.ChessPieceSpriteType;

public abstract class Piece extends Location implements InterfacePiece{
	/*
	//private 
	int x;
	//private 
	int y;
	//private 
	int color;			//type에 색 정보도 저장되어 있는데 필요한가 모르겠다.
	//private 
	int type;
	*/
	
	public static void move(int cur_x, int cur_y, int after_x, int after_y, int piece_type) {
		loc[cur_x][cur_y] = 0;
		Board.temp = new ImagePanel();
		if(piece_type%0x10>=8&&piece_type%0x10<=15) {
			
			if(piece_type/16 ==2) {
			Board.squares[cur_x][cur_y].removeAll();
			Board.squares[cur_x][cur_y].revalidate();
			Board.squares[cur_x][cur_y].repaint();
			Board.squares[after_x][after_y].removeAll();
			Board.squares[after_x][after_y].revalidate();
			Board.squares[after_x][after_y].repaint();
			Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
	        Board.squares[after_x][after_y].setLayout(new BorderLayout());
	        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
				}
	        		
		
        
        loc[after_x][after_y] = piece_type;
		}
		
		
		if(piece_type%0x10==0||piece_type%0x10==7) {
			
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			
			}	
			
			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			loc[after_x][after_y] = piece_type;
		}
		
		
		if(piece_type%0x10==1||piece_type%0x10==6) {
			
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			loc[after_x][after_y] = piece_type;
		}
		
		if(piece_type%0x10==2||piece_type%0x10==5) {
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			loc[after_x][after_y] = piece_type;
		}
		
		if(piece_type%0x10==4) {
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			loc[after_x][after_y] = piece_type;
		}
		
		if(piece_type%0x10==3) {
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
		        Board.squares[after_x][after_y].setLayout(new BorderLayout());
		        Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			
			loc[after_x][after_y] = piece_type;
		}
		
		
		
		
		
}
	
	public static void limit_possible(int cur_x, int cur_y, int piece_type) {
		int team=piece_type/0x10;
		int ck;
		for(int i=0;i<8;i++)
	    {
	        for(int j=0;j<8;j++)
	        {
	            if(Pos[i][j]==1)
	            {
	               int temp = loc[i][j];
	               loc[i][j] = piece_type;
	               loc[cur_x][cur_y] = 0;
	               ck = GameEnd.check(team);
	               if(ck == 1) {
	                  Pos[i][j] = 0;
	                  
	             			 if((i+j)%2 !=0) {
	             				 Board.squares[i][j].setBackground(Color.LIGHT_GRAY); 
	                    }
	                    else
	                       Board.squares[i][j].setBackground(Color.white);
	               }      
	             	 
	              	               
	               loc[cur_x][cur_y] = piece_type;
	               loc[i][j] = temp;
	               
	            }
	         }
	    }
	}
}
