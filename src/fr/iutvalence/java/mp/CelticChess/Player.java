package fr.iutvalence.java.mp.CelticChess;

/**
 * This class is used to define each player during the game
 * 
 * @author delaplvi
 * 
 */

public class Player
{
    /**
     * Declaration of the white color For the moment it is just a string, this
     * will change
     */
    private static final String WHITE = null;

    /**
     * Declaration of the black color For the moment it is just a string, this
     * will change
     */
    private static final String BLACK = null;
    
    // TODO (fix) this field looks like a local variable taht should be handled in
    // CelticChess
    /**
     * Will allow each player to play.
     */
    public boolean playGame;

    /**
     * Define the color of player1 during the game
     */

    // TODO (fix) this is confusing, it is not clear if this class represents a user
    // or both
    public String colorPlayer1;

    /**
     * Define the color of player2 during the game
     */

    public String colorPlayer2;

    /**
     * Prepare each player to start a game
     */

    public Player()
    {
        this.playGame = true;
        this.colorPlayer1 = WHITE;
        this.colorPlayer2 = BLACK;

    }

}
