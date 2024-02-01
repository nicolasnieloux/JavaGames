package fr.campusnumerique.cda.games.cell;

import fr.campusnumerique.cda.games.symbol.SymbolInterface;

public abstract class CellAbstract implements CellInterface {
    private SymbolInterface symbol;

    protected CellAbstract(SymbolInterface symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean isOccupied() {
        return getDefault() != symbol;
    }


    @Override
    public boolean occupy(SymbolInterface symbolInterface) {
        if (!isOccupied()) {
            symbol = symbolInterface;
            return true;
        }
        return false;
    }

    protected abstract SymbolInterface getDefault();

    protected SymbolInterface getSymbol(){
        return symbol;
    }

    @Override
    public void clear() {
        symbol = getDefault();
    }
}
