package fr.iutvalence.java.mp.CelticChess;

/**
 * Will recieve the board and all of the pawns. 9*9 board
 * 
 * @author delaplvi
 * 
 */
public class Board
{
    /**
     * Initialize a value for an Empty Case for the board
     */
    public static final int EMPTY = 0;

    /**
     * Initialize a value for the Black King for the board
     */
    public static final int BLACK_KING = 1;

    /**
     * Initialize a value for the Black pawn for the board
     */
    public static final int BLACK_PAWN = 2;

    /**
     * Initialize a value for the White pawn for the board
     */
    public static final int WHITE_PAWN = 3;

    /**
     * If the king reach this case, black player's win
     */
    public static final int BLACK_FLAG = 4;
   
    /**
     * Will create a 9*9 board for each game
     */
    public int[][] board;

    /**
     * Will create the board will all of the pawns, this will be used when we
     * call a new Game into CelticChess
     */

    public Board()
    {

        this.board = new int[][] { 
                { BLACK_FLAG, BLACK_FLAG, EMPTY, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, EMPTY, BLACK_FLAG, BLACK_FLAG },
                { BLACK_FLAG, EMPTY, EMPTY, EMPTY, WHITE_PAWN, EMPTY, EMPTY, EMPTY, BLACK_FLAG },
                { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY },
                { WHITE_PAWN, EMPTY, EMPTY, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, EMPTY, EMPTY, WHITE_PAWN },
                { WHITE_PAWN, WHITE_PAWN, EMPTY, BLACK_PAWN, BLACK_KING, BLACK_PAWN, EMPTY, WHITE_PAWN, WHITE_PAWN },
                { WHITE_PAWN, EMPTY, EMPTY, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, EMPTY, EMPTY, WHITE_PAWN },
                { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY },
                { BLACK_FLAG, EMPTY, EMPTY, EMPTY, WHITE_PAWN, EMPTY, EMPTY, EMPTY, BLACK_FLAG },
                { BLACK_FLAG, BLACK_FLAG, EMPTY, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, EMPTY, BLACK_FLAG, BLACK_FLAG }, };
    }
    /**
     * 
     * @param ligne
     * @param colonnes
     * @return System.out  
     */
     public static int Board;{
        int lignes = 0;
        int colonnes = 0;
        while (lignes < 8)
        {
            while (colonnes < 8)
            {               
                colonnes++;
            }
            lignes++;
        }
        System.out.print(this.board[lignes][colonnes]);
     }
        /**
         * Method to get the position of a pawns
         */
     public int getSource[][];{ 
            int sourcex;   // Doit prendre pour valeur la ligne en x du tableau
            int sourcey;   // Doit prendre pour valeur la Colonne en y du tableau
            this.getSource = new int[sourcex][sourcey];
      // return getSource;
        }
        /**
         * Method to get the destination for a pawns
         */
       public int getDestination[][] ;
        {
            int destinationx; // Doit prendre pour valeur la ligne en x de la destination du tableau
            int destinationy; // Doit prendre pour valeur la Colonne en y de la destination du tableau
            this.getDestination = new int[destinationx][destinationy];
        }
        
        // This method must be erase later
        /**
         *  
         *  To swap 2 positions into the board
         */
     //   private void swap; {
     //   int[][] memoire=source;
     //  source=destination;
     //   destination=memoire;
     //   }
    /**
     * All of the illegal action will be treated here, for example put a pawns out of the board.
     * @param sourcex
     * @param sourcey
     * @param destinationx
     * @param destinationy
     * @return action
     */
    // TODO
    private boolean action(int sourcex, int sourcey,int destinationx, int destinationy) {
        
        return action(sourcex , sourcey , destinationx , destinationy);
    }
}