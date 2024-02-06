package BoardGraphics;

import java.awt.Color;

import javax.swing.JPanel;

import ChessPiece.ImagePanel;

//현재 판의 상태 정적 변수

public class Board {
   public static int mode;
   public static JPanel squares[][] = new JPanel[8][8];
   public static JPanel squares2[][] = new JPanel[14][14];
   public static int[][] board = new int[8][8];
   public static int[][] board2 = new int[14][14];
   public static int row;
   public static int col;
   public static boolean a = true;
   public static int[] bol ={0,1,2};
   public static ImagePanel[] bPawn = new ImagePanel[8];
   public static int click = 0;
   public static ImagePanel temp;
   public static Color background;
   public static int templocation;
   public static int tempx;
   public static int tempy;
   public static int turn = 1; //2=black, 1 = white
   //public static int[][] Mark = new int[8][8];
   //public static int mcolor_r, mcolor_c;
   //public static int acolor_r, acolor_c;
}