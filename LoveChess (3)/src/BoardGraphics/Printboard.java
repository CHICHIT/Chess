package BoardGraphics;

import ChessPiece.Location;

public class Printboard extends Location{
	public Printboard() {
		
		for(int i  = 0;i<8;i++) {
			
			for(int j = 0;j<8;j++) {
				System.out.printf("%d  ", loc[i][j]);
			}
			System.out.println("");
		}
		for(int i  = 0;i<8;i++) {
			
			for(int j = 0;j<8;j++) {
				System.out.printf("%d  ", Pos[i][j]);
			}
			System.out.println("");
		}
	}

}
