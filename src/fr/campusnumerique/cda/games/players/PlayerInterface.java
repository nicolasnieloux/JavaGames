package fr.campusnumerique.cda.games.players;
import fr.campusnumerique.cda.games.symbol.SymbolInterface;
import fr.campusnumerique.cda.games.utils.Coordinate;

public interface PlayerInterface  {
    SymbolInterface getSymbol();
    Coordinate giveCoordinate();
}
