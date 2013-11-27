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
    public Player whitePlayer;

    /**
     * The later player will play (black)
     */
    public Player blackPlayer;

    /**
     * Define the time each player play
     */
    public Chrono chrono;
    
    // TODO (fix) move this as a local variable
    /**
     * Will allow each player to play.
     */
    public boolean playGame;

    
   /**
    * Initialize a game by initializing all of the informations as the board, each player 
    */
    public CelticChess()
    {
        this.chrono = new Chrono();
        this.board = new Board();
        this.whitePlayer = new Player();
        this.blackPlayer = new Player();
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