/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author ahlamjaved
 */
public class Board {
    public class Board {
    
    private boolean firstMove=true;
	private int block=2;
	private int win=-6;
	private int secondEntry=-3;
	private int offset=-3;
	private char xo;
	private char mark;
	private int topN=0;
	private int middleN=0;
	private int bottomN=0;
	private int leftvN=0;
	private int middlevN=0;
	private int rightvN=0;
	private int top2bottomdN=0;
	private int bottom2topdN=0;

	public static char[][] board = new char[3][3];

	private int[] top = new int[3];
	private int[] middle = new int[3];
	private int[] bottom = new int[3];

	private int[] rightv = new int[3];
	private int[] middlev = new int[3];
	private int[] leftv = new int[3];

	private int[] top2bottomd = new int[3];
	private int[] bottom2topd = new int[3];
	
	public void setxo(char choose){
		xo=choose;
	}
	
	private int pathCode(int[] path){
		int total=0;
		
		for(int i=0;i<path.length;i++)
			total=total+path[i];
		return(total);
	}
	
	public void move(){
		if(firstMove){
                    firstMove=false;
                     System.out.println("firstMove=true");
			if (board[1][1] == '\u0000'){
                            System.out.println("First move");
				markMiddle(offset,xo);
				
			}  else markTopLeft(offset,xo);
		}else{
			bestMove();
                }
	}
	
	private boolean blockWin(int blockWin){
	if (topN==blockWin||middleN==blockWin||bottomN==blockWin||rightvN==blockWin||middlevN==blockWin||leftvN==blockWin||top2bottomdN==blockWin|bottom2topdN==blockWin){
			if (topN==blockWin){
				if (top[0]==0) markTopLeft(offset,xo);
				else if (top[2]==0) markTopRight(offset,xo);
				else if (top[1]==0) markTopMiddle(offset,xo);
				return(true);
			}
			if (middleN==blockWin){
				if (middle[0]==0) markMiddleLeft(offset,xo);
				else if (middle[2]==0) markMiddleRight(offset,xo);
				else if (middle[1]==0) markMiddle(offset,xo);
				return(true);
			}
			if (bottomN==blockWin){
				if (bottom[0]==0) markBottomLeft(offset,xo);
				else if (bottom[2]==0) markBottomRight(offset,xo);
				else if (bottom[1]==0) markBottomMiddle(offset,xo);
				return(true);
			}
			if (rightvN==blockWin){
				if (rightv[0]==0) markTopLeft(offset,xo);
				else if (rightv[2]==0) markBottomLeft(offset,xo);
				else if (rightv[1]==0) markMiddleLeft(offset,xo);
				return(true);
			}
			if (middlevN==blockWin){
				if (middlev[0]==0) markTopMiddle(offset,xo);
				else if (middlev[2]==0) markBottomMiddle(offset,xo);
				else if (middlev[1]==0) markMiddle(offset,xo);
				return(true);
			}
			if (leftvN==blockWin){
				if (leftv[0]==0) markTopLeft(offset,xo);
				else if (leftv[2]==0) markBottomLeft(offset,xo);
				else if (leftv[1]==0) markMiddleLeft(offset,xo);
				return(true);
			}
			if (top2bottomdN==blockWin){
				if (top2bottomd[0]==0) markTopLeft(offset,xo);
				else if (top2bottomd[2]==0) markBottomRight(offset,xo);
				else if (top2bottomd[1]==0) markMiddle(offset,xo);
				return(true);
			}
			if (bottom2topdN==blockWin){
				if (bottom2topd[0]==0) markBottomLeft(offset,xo);
				else if (bottom2topd[2]==0) markTopRight(offset,xo);
				else if (bottom2topd[1]==0) markMiddle(offset,xo);
				return(true);
			}
		}
		return (false);
	}
	public boolean bestMove(){
		updateTotals();
		if (blockWin(block)) //block a win
			return(true);
		else if (blockWin(win)) //win the game
			return(true);
		else if (blockWin(secondEntry)) //put 2nd mark in this row
			return(true);  
		else if (blockWin(0)) //first entry in this row
			return(true);
		else return(false);
	}
			
	
	public boolean markMiddle(int offsetin,char xoinput){
		
		middle[1]=offsetin;
		middlev[1]=offsetin;
		top2bottomd[1]=offsetin;
		bottom2topd[1]=offsetin;
		board[1][1]=xoinput;
		return(true);
	}
	
	public boolean markTopLeft(int offsetin,char xoinput){
		top[0]=offsetin;
		leftv[0]=offsetin;
		top2bottomd[0]=offsetin;
		board[0][0]=xoinput;
		return(true);
	}
	
	public boolean markTopMiddle(int offsetin,char xoinput){
		top[1]=offsetin;
		middlev[0]=offsetin;
		board[0][1]=xoinput;
		return(true);
	}
	
	public boolean markTopRight(int offsetin,char xoinput){
		top[2]=offsetin;
		bottom2topd[2]=offsetin;
		rightv[0]=offsetin;
		board[0][2]=xoinput;
		return(true);
	}
	
	public boolean markMiddleLeft(int offsetin,char xoinput){
		middle[0]=offsetin;
		leftv[1]=offsetin;
		board[1][0]=xoinput;
		return(true);
	}
	
	public boolean markMiddleRight(int offsetin,char xoinput){
		middle[2]=offsetin;
		rightv[1]=offsetin;
		board[1][2]=xoinput;
		return(true);
	}
	
	public boolean markBottomRight(int offsetin,char xoinput){
		rightv[2]=offsetin;
		bottom[2]=offsetin;
		bottom2topd[2]=offsetin;
		board[2][2]=xoinput;
		return(true);
	}
	
	public boolean markBottomMiddle(int offsetin,char xoinput){
		middlev[2]=offsetin;
		bottom[1]=offsetin;
		board[2][1]=xoinput;
		return(true);
	}
	
	public boolean markBottomLeft(int offsetin,char xoinput){
		leftv[2]=offsetin;
		bottom2topd[0]=offsetin;
		bottom[2]=offsetin;
		board[2][0]=xoinput;
		return(true);
	}
	
	private int arrayTotal(int[] addArray){
		int sum=0;
		for(int i : addArray)
			sum+=i;
		return(sum);
	}
	
	private boolean updateTotals(){
		topN=arrayTotal(top);
		middleN=arrayTotal(middle);
		bottomN=arrayTotal(bottom);
		leftvN=arrayTotal(leftv);
		middlevN=arrayTotal(middlev);
		rightvN=arrayTotal(rightv);
		top2bottomdN=arrayTotal(top2bottomd);
		bottom2topdN=arrayTotal(bottom2topd);
                return(true);
	}
}
