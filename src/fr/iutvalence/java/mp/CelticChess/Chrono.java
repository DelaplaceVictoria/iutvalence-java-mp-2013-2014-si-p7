package fr.iutvalence.java.mp.CelticChess;

/**
 * This class is here to initialize the time using for the game.
 * 
 * @author delaplvi
 * 
 */
// TODO (think about it) this class is not really part of the model.
// If you want to ensure that a choice is given in a given time, you can delegate
// time checking in the objects that polls user
public class Chrono
{

    /**
     * Use this value to define the time.
     */
    public int chronoJoueur1 = 60000;

    /**
     * Use this value to define the time.
     */
    public int chronoJoueur2 = 60000;

    /**
     * According to this boolean, one player will start to play
     */

    public boolean tempsJoueur1Ecoule = false;
    /**
     * According to this boolean, the other player will start to play
     */

    public boolean tempsJoueur2Ecoule = false;

    /**
     * Get the time
     */
    public Chrono()
    {
        this.chronoJoueur1 = 60000;
        this.chronoJoueur2 = 60000;
    }

}
