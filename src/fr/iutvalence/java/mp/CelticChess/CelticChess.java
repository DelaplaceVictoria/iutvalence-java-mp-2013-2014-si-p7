package fr.iutvalence.java.mp.CelticChess;

/**
 * This class represents a CelticChess's game
 * 
 * @author delaplvi and dufourlu
 * 
 */
public class CelticChess
{
    /**
     * Board on which we will place all pawns (9x9 cases)
     */
    public Board board;

    /**
     * The former player will play (white)
     */
    public Players whitePlayer;

    /**
     * The later player will play (black)
     */
    public Players blackPlayer;

    /**
     * Define the time each player play
     */
    public Chrono chrono;

    /**
     * Define all of the settings for the game.
     */
   
    // TODO (fix) this field looks like a local variable taht should be handled in
    // CelticChess   Fixed
    /**
     * Will allow each player to play.
     */
    public boolean playGame;

    // TODO (fix) write comment
    public CelticChess()
    {
        this.chrono = new Chrono();
        this.board = new Board();
        this.whitePlayer = new Players();
        this.blackPlayer = new Players();
    }

    /**
     * Play the game
     */
    public void play()
    {

        /*
         * while player1 (dépend si blanc ou noir pour le roi) si le roi est
         * dans l'angle ( ou n'existe plus ) return finpartie else tour joueur2
         */
    }

}