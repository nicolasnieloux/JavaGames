package fr.campusnumerique.cda.games.cell;

import fr.campusnumerique.cda.games.symbol.SymbolInterface;
import fr.campusnumerique.cda.games.symbol.TicTacToeSymbol;

public class TicTacToeCell extends CellAbstract {
    public TicTacToeCell() {
        super(TicTacToeSymbol.DEFAULT);
    }

    @Override
    protected TicTacToeSymbol getDefault() {
        return TicTacToeSymbol.DEFAULT;
    }

    @Override
    public String getRepresentation() {
        return ("| " + getSymbol() + " ");
    }
}
