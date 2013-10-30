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

    
    
    // TODO (fix) the following fields look much more like local variables
    /**
     * Declaration of variable sourcex
     */
    int sourcex;
    /**
     * Declaration of variable sourcey
     */
    int sourcey;
    /**
     * Declaration of variable destinationx
     */
    int destinationx;
    /**
     * Declaration of variable destinationy
     */
    int destinationy;
    
    /**
     * Define the initiale position of a paws
     */
    // TODO (fix) fields must be initialized in constructors
    int [][] source;{
        this.source = new int[this.sourcex][this.sourcey];
    }
    /**
     * Define the final position of a paws
     */
    // TODO (fix) fields must be initialized in constructors
    int [][] destination;{
        this.destination = new int[this.destinationx][this.destinationy];
        
    }
    
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
       
        // TODO (fix) rename local variable (more explicit) Check
        int lignes = 0;
        // TODO (fix) rename local variable (more explicit) Check
        int colonnes;
        // TODO (fix) declare hard-coded values as constants
        while (lignes < 9)
        {
            colonnes = 0;
            while (colonnes < 9)
            {
                System.out.print(this.board[lignes][colonnes]);
                colonnes++;
            }
            System.out.println("");
            lignes++;
        }
    }
    
    // TODO (fix) finish writing comment
    /**
     * We will try to see if we can move a pawn, all of the exception case will
     * appear after. ( For example we can't put a pawn on another.)
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