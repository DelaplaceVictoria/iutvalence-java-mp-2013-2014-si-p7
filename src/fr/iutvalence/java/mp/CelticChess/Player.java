package fr.iutvalence.java.mp.CelticChess;

/**
 * This class is used to define each player during the game
 * @author delaplvi
 *
 */

public class Player
{
   /**
    *  Declaration of the white color
    *  For the moment it is just a string, this will change
    */
    private static final String White = null;
    
    /**
     * Declaration of the black color
     *  For the moment it is just a string, this will change
     */
    private static final String Black = null;
    /**
     * Will allow each player to play.
     */
    public boolean playGame;
    
    /**
     *  Define the color of player1 during the game
     */
    
    public String colorPlayer1;
    
    /**
     * Define the color of player2 during the game  
     */
    
    public String colorPlayer2;
      
  /**
   *  Prepare each player to start a game 
   */
    
    public Player() {
        this.playGame = true;
        this.colorPlayer1 = White;
        this.colorPlayer2 = Black;
        
    
    }
    
}
