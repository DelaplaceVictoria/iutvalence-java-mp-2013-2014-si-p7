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
    private String namePlayer;

    /**
     * Boolean which permit the declaration of the color
     */
    private boolean isWhite;

    /**
     * Initialize the constructor which will permit to set all of the settings
     * for the player
     * 
     * @param pName a string, represents the name of the Player, default Joueur1 and Joueur2
     * @param pColor a boolean, represents the color of the Player
     */

    public Player(String pName, boolean pColor)
    {
        this.namePlayer = pName;
        this.isWhite = pColor;

    }
    
    /**
     * getter which return the name of the player
     * @return namePlayer
     */
    public String getNamePlayer(){
        return this.namePlayer;
    }
    
    /**
     * getter which return the color of the player
     * @return isWhite
     */
    public boolean getIsWhite(){
        return this.isWhite;
    }
    
     
    /**
     * setter define the name of the player
     * @param pName a string, the name we want to give at the player
     */
    public void setNamePlayer(String pName){
        this.namePlayer = pName;
    }
    
    /**
     * setter define the color of the player
     * @param pColor a boolean, the color we want to give at the player
     */
    public void setIsWhite(boolean pColor){
        this.isWhite = pColor;
    }

}
