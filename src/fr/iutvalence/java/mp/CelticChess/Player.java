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
     * Define the name of a player (player1 and player2)
     */
    public String namePlayer;
    
    /**
     * Boolean which permit the declaration of the color
     */
    public boolean isWhite;
    
   /**
    * Initialize the constructor which will permit to set all of the settings for the player
    * @param pName
    * @param pColor
    */

    public Player(String pName, boolean pColor )
    {
        this.namePlayer = pName;
        this.isWhite = pColor;

    }

}
