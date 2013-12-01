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
    private int[][] board;

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
        printBoard();

    }

    /**
     * 
     */
    // public void empile()
    // {
    // if (this.destination == (BLACK_KING || BLACK_PAWN || WHITE_PAWE)) return
    // case_pleine;
    // if (this.destination == (EMPTY || BLACK_FLAG)) return case_vide;
    // return success;
    // }

    // TODO (fix) write comment
    // TODO (fix) consider overriding Object#toString instead
    public void printBoard()
    {
        int i = 0;
        int j;

        // TODO (fix) declare hard-coded values as constants
        while (i < 9)
        {
            j = 0;
            while (j < 9)
            {
                System.out.print(this.board[i][j]);
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    /**
     * return the case at line x and column y
     * 
     * @param x
     *            is the line of the wanted case
     * @param y
     *            is the column of the wanted case
     * @return Case an integer which represents the content of a case in (x,y)
     */
    // TODO (fix) comply with naming conventions
    // tODO (fix) rename this method (more explicit, should be called get...)
    public int Case(int x, int y)
    {
        int lignes = 0;
        int colonnes = 0;
        while (lignes < x)
        {
            while (colonnes < y)
            {
                colonnes++;
            }
            lignes++;
        }
        return this.board[lignes][colonnes];
    }

}