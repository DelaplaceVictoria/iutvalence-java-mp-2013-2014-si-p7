package fr.iutvalence.java.mp.CelticChess;
/**
 * Will recieve the board and all of the pawns. 9*9 board
 * @author delaplvi
 *
 */
public class Board
{
    /**
     *   Initialize a value for an Empty Case for the board
     */
    public static final int EC = 0;

    /**
     *   Initialize a value for the Black King for the board
     */
    public static final int BK = 1; 
    
    /**
     *   Initialize a value for the Black pawn for the board
     */
    public static final int BP = 2; 

    /**
     *  Initialize a value for the White pawn for the board
     */
    public static final int WP = 3; 
    
    
    /**
     *  If the king reach this case, black player's win
     */
    public static final int SC = 4; 
    /**
     *  Will create a 9*9 board for each game 
     */
    public int[][] board; 
        
    /**
     *  Will create the board will all of the pawns,
     *   this will be used when we call a new Game into CelticChess
     */

    public Board() {
     
    this.board = new int[][] 
            {
            {SC,SC,EC,WP,WP,WP,EC,SC,SC},
            {SC,EC,EC,EC,WP,EC,EC,EC,SC},
            {EC,EC,EC,EC,EC,EC,EC,EC,EC},
            {WP,EC,EC,BP,BP,BP,EC,EC,WP},
            {WP,WP,EC,BP,BK,BP,EC,WP,WP},
            {WP,EC,EC,BP,BP,BP,EC,EC,WP},
            {EC,EC,EC,EC,EC,EC,EC,EC,EC},          
            {SC,EC,EC,EC,WP,EC,EC,EC,SC},
            {SC,SC,EC,WP,WP,WP,EC,SC,SC},
            };
    int i=0;
    int j;
    while (i < 9)
    {
      j = 0;
      while(j < 9)
      {
        System.out.print(this.board[i][j]);
        j++;
      }
      System.out.println("");
      i++;
    }
    }
}