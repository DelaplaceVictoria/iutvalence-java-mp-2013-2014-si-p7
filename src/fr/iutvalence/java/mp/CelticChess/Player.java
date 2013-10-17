package fr.iutvalence.java.mp.CelticChess;

/**
 * This class is used to define each player during the game
 * @author delaplvi
 *
 */

public class Player
{

    /**
     * Start/stop player1 round
     */
    public boolean playJoueur1;
    /**
     *  Start/stop player2 round
     */
    public boolean playJoueur2;
  
    
  /**
   *  Prepare each player to start a game 
   */
    
    public Player() {
        this.playJoueur1 = true;
        this.playJoueur2 = false;
    
    }
    
}
