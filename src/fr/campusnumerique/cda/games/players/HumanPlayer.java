package fr.campusnumerique.cda.games.players;

import fr.campusnumerique.cda.games.symbol.SymbolInterface;
import fr.campusnumerique.cda.games.utils.Coordinate;

public class HumanPlayer implements PlayerInterface{

    private SymbolInterface symbol;

    public HumanPlayer(SymbolInterface symbol) {
        this.symbol = symbol;
    }

    @Override
    public SymbolInterface getSymbol() {
        return symbol;
    }

    @Override
    public Coordinate giveCoordinate() {
        return null;
    }
}

