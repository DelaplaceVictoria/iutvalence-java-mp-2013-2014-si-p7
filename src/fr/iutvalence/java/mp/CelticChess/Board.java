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

    private int[][] getSource;

    private int[][] getDestination;



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
                { BLACK_FLAG, BLACK_FLAG, EMPTY, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, EMPTY, BLACK_FLAG, BLACK_FLAG },
                };
        }

    /**
     * 
     */
//    public void empile()
//    {
//       if (this.destination == (BLACK_KING || BLACK_PAWN || WHITE_PAWE)) return case_pleine;
//        if (this.destination == (EMPTY || BLACK_FLAG)) return case_vide;
//                return success;
//    }


    /**
     *  This will be used to print the board for the monitor
     * @param ligne
     * @param colonnes
     * @return 
     * @return System.out
     */
    public void printBoard(int lignes, int colonnes)   // Vérif pour le void ?
    {
         lignes = 0;
         colonnes = 0;
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
    public int getSource(int x, int y)
    {
        int sourcex = x;
        int sourcey = y;
        this.getSource = new int[sourcex][sourcey];
        return sourcey; // Mettre un source qui prend en param x et y
    }
    /**
     * Method to get the destination for a pawns
     */
    public int getDestination(int x, int y)
    {
        int destinationx = x;
        int destinationy = y;
        this.getDestination = new int[destinationx][destinationy];
        return destinationy; // Mettre un destination qui prend en param x et y
    }
    
}