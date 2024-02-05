package fr.campusnumerique.cda.games.players;

import fr.campusnumerique.cda.games.symbol.SymbolInterface;
import fr.campusnumerique.cda.games.utils.Coordinate;

import java.util.Random;

public class ArtificialPlayer implements PlayerInterface {

    private SymbolInterface symbol;

    public ArtificialPlayer() {
    }

    public ArtificialPlayer(SymbolInterface symbol) {
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

    public int PlayArtificialPlayer() {
        Random random = new Random();
        return random.nextInt(3);
    }
}
