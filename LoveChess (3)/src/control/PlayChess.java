package control;


import java.awt.Color;

import BoardGraphics.Board;
import ChessPiece.Bishop;
import ChessPiece.GameEnd;
import ChessPiece.King;
import ChessPiece.Knight;
import ChessPiece.Location;
import ChessPiece.Pawn;
import ChessPiece.Piece;
import ChessPiece.Queen;
import ChessPiece.Rook;
import BoardGraphics.Tile;
import BoardGraphics.SetBoardGraphic;


public class PlayChess extends Location{
   public PlayChess() {
      System.out.println("<Loc>\n");
      PrintLoc();

      Rook Rook =new Rook();
      Bishop Bishop =new Bishop();
      Queen Queen =new Queen();
      King King =new King();
      Knight Knight =new Knight();
      Pawn Pawn =new Pawn();
      Board board = new Board();
      GameEnd GameEnd=new GameEnd();
      
      
      int turn=1;
      while(true)
      {
         int piece_type, x, y, ck;
         System.out.println("<Loc>");
         PrintLoc();
         ShowPos();
         ShowMov();
         ck=GameEnd.check(3-turn);
         if(ck==1)
            System.out.println(3-turn+"P is Checked");
      
         turn=3-turn;
         
   }
}
   
   public static void ShowPos() {
         int piece_type;
         Board board = new Board();
         System.out.println("<Loc>");
         PrintLoc();
         if(loc[board.tempx][board.tempy]==0)
            System.out.println("There is not corret input2.");
         
       
         Rook Rook =new Rook();
         Bishop Bishop =new Bishop();
         Queen Queen =new Queen();
         King King =new King();
         Knight Knight =new Knight();
         Pawn Pawn =new Pawn();
         GameEnd GameEnd=new GameEnd();
         
         for(int i=0; i<Pos.length; i++) {
             for(int j=0; j<Pos[0].length; j++)
            	 Pos[i][j]=0;
          }
         
         
         if(loc[board.tempx][board.tempy]!=0) {
            piece_type=loc[board.tempx][board.tempy];
            if(piece_type%0x10==0||piece_type%0x10==7)
               Rook.possible(board.tempx, board.tempy, piece_type);
            else if(piece_type%0x10==1||piece_type%0x10==6)
               Knight.possible(board.tempx, board.tempy, piece_type);
            else if(piece_type%0x10==2||piece_type%0x10==5)
               Bishop.possible(board.tempx, board.tempy, piece_type);
            else if(piece_type%0x10==4)
               King.possible(board.tempx, board.tempy, piece_type);
            else if(piece_type%0x10==3)
               Queen.possible(board.tempx, board.tempy, piece_type);
            else if(piece_type%0x10>=8&&piece_type%0x10<=15)
               Pawn.possible(board.tempx, board.tempy, piece_type);

            Piece.limit_possible(board.tempx, board.tempy, piece_type);
            board.a = !board.a;
            System.out.println("<Pos>");
            PrintPos();
         }
            
   }
      

      public static void ShowMov() {
         int piece_type;
         Board board = new Board();
         piece_type=loc[board.tempx][board.tempy];
         if(Pos[board.row][board.col]!=1) 
               System.out.println("The input is not correct.");

        
         if(Pos[board.row][board.col]==1) { 
            board.a = !board.a;
            Piece.move(board.tempx, board.tempy, board.row, board.col, piece_type);
             
            
         
            
         }
         
         if(Pos[board.row][board.col]==1) {
        	 
        	 for(int i=0; i<8; i++) {
        		 for(int j=0; j<8; j++)
        			 if((i+j)%2 !=0) {
        				 Board.squares[i][j].setBackground(Color.LIGHT_GRAY); 
               }
               else
                  Board.squares[i][j].setBackground(Color.white);
               
        	 }
         }
         
            for(int i=0; i<Pos.length; i++) {
               for(int j=0; j<Pos[0].length; j++)
                  Pos[i][j]=0;
            }
         System.out.println("<Loc>");
         PrintLoc();
      
      }

   
   
   
}