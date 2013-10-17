package fr.iutvalence.java.mp.CelticChess;
/**
 * Will recieve the board and all of the pawns. 9*9 board
 * @author delaplvi
 *
 */
public class Board
{

    /**
     *  Set an Empty Case for the board
     */
    public static final int EC = 0;
    /**
     *  Set the Black King for the board
     */
    public static final int BK = 1; 
    
    
    /**
     *  Set the Black pawn for the board
     */
    public static final int BP = 2; 
    
    /**
     *  Set the White pawn for the board
     */
    public static final int WP = 3; 
    

    /**
     *  Will be used to create a case for each game
     */
    public int[][] monTableau; 
    
    
    /**
     *  Create the 9*9 board
     * @param args 
     */
    public void celticBoard (String[] args){

     int value = 1;

     int[][] monTableau = new int[9][9];

     for (int i = 0; i < 9; i++){

     for(int j = 0; j < 9; j++){

     monTableau[i][j] = value + i;
     }
     }
     }


/**
 *  Will create the board will all of the pawns,
 *   this will be used when we call a new Game into CelticChess
 */
public Board() {
      
    this.monTableau =  new int[9][9];
          /*
           *  Modifier 'new int [9][9] par la valeur de celticBoard
           */
    
}
}