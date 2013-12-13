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
    private final int[][] board;

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
        printBoard(9,9);

    }

    /**
     * Define if the exchange between 2 cases is possible
     * @param x the line of the destination
     * @param y the column of the destination
     * @return a boolean, exchange possible(true) or not(false)
     */
    public boolean exchangeIsPossible(int x,int y)
    {
        int destination = getCase(x,y);
        if (destination == 1 ||destination == 2 ||destination == 3)
        {
            return false;
        }else if (destination == 0 ||destination == 4)
        {
            return true;
        }else return false;
    }
    
    /**
     * Define the exchange of cases
     * @param x1 the line of the source
     * @param y1 the column of the source
     * @param x2 the line of the destination
     * @param y2 the column of the destination
     */
    public void exchange(int x1,int y1, int x2, int y2)
    {
        int temp=getCase(x2,y2);

        if (exchangeIsPossible(x2,y2))
        {
            if(endGame(x1,y1,x2,y2)){
               System.out.println("partie terminée");
            }
            setCase(x2, y2, getCase(x1,y1));
            setCase(x1,y1, temp);

            System.out.println("mouvement effectué");
        }else
        {
            System.out.println("Vous ne pouvez pas faire ce mouvement, trouvez autre chose!");
        }

        printBoard(9,9);
    }

    
    
    // TODO (fix) consider overriding Object#toString instead
    /**
     * print the board on the screen
     * @param x number of cases we want in a line
     * @param y number of cases we want in a column
     */
    public void printBoard(int x, int y)
    {
        int i = 0;
        int j;

        while (i < x)
        {
            j = 0;
            while (j < y)
            {
                System.out.print(this.board[i][j]);
                j++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
    }

    /**
     * Define the end of the game
     * @param x the line of the source
     * @param y the column of the source
     * @param x2 the line of the destination
     * @param y2 the column of the destination
     * @return a boolean which define if the game is finished or not
     */
    public boolean endGame(int x, int y, int x2, int y2)
    {
        int source = getCase(x,y);
        int destination = getCase(x2,y2);
        if(source==1 && destination==4)
        {
         return true;
        }else return false;
        
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

    public int getCase(int x, int y)
    {
        return this.board[x][y];
    }
    
    /**
     * Give a value on a case in (x,y)
     * @param x the line of the board
     * @param y the column of the board
     * @param value an integer which is the value on the board
     */
    public void setCase(int x, int y, int value)
    {
       this.board[x][y]=value;
    }

}