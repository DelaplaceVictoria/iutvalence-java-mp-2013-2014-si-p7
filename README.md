iutvalence-java-mp-2013-2014-si-p7
==================================

Mini-projets Java, IUT de Valence, 2013-2014, groupe SI, projet 7


Le jeu de Guewzboel est aussi appelé Échecs Celtiques.

Le plateau est fait de 9x9 cases. 
Deux camps sont en présence :
- le roi noir et sa garde de 8 pions noirs.
- 16 pions blancs.

Le roi noir se trouve sur la case du centre et doit se rendre dans une des cases des coins, représentant les quatre provinces irlandaises.
Les Blancs doivent l’en empêcher en le bloquant ou en l'empêchant de passer.
Tous les pions peuvent être pris. Pour cela, il suffit d’encadrer un pion ennemi par deux de ses pions.
(Mais si un pion se met délibérément entre deux pions ennemis, il est imprenable tant qu’il reste dans cette position).
Pour le roi, il doit être entouré de tous les côtés (4 s'il est au centre, 3 s'il est au bord) pour être capturé.

Le roi et les pions se déplacent selon les rangées et les colonnes, d’autant de cases libres qu’ils veulent. 

First of all, we ask for the player to lunch a game, the chessboard appear with all of the 
pawns, (the king include), one player lead the blacks pawns at the middle of the chessboard
and the other is playing the white from all over the tray.
The white pawns begin to play, they can only move 1 pawns per round, (this game is obviously
a in turn game), they can move horizontally,vertically and in diagonal until there where blocked by 
something.
To erase a pawn, you need to surround him with 2 paws from both side (Only horizontally, or vertically)
But if a pawn come between two opponent's pawns, it is not loose.
The game ends when the king was surround or if he succed reaching one of the corn of the 
chessboard. 