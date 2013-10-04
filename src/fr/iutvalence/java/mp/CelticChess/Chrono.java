package fr.iutvalence.java.mp.CelticChess;
/**
 * This class is here to initialize the time using for the game.
 * @author delaplvi
 *
 */
public class Chrono
{

    /**
     * Use this value to define the time.
     */
    @SuppressWarnings("unused")
    private int chrono;
    /**
     * According to this boolean, one player will start to play
     */
    
    @SuppressWarnings("unused")
    private boolean tempsJoueur1Ecoule = false;
 /**
  * According to this boolean, the other player will start to play
  */
    @SuppressWarnings("unused")
    private boolean tempsJoueur2Ecoule = false;

    
 /**
 *  Get the time
 */
public Chrono()
 {
     this.chrono = 60;
 }
 }
