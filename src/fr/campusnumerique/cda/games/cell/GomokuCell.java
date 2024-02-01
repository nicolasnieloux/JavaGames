package fr.campusnumerique.cda.games.cell;

import fr.campusnumerique.cda.games.symbol.GomokuSymbol;
import fr.campusnumerique.cda.games.symbol.SymbolInterface;

public class GomokuCell extends CellAbstract {
    public GomokuCell() {
        super(GomokuSymbol.DEFAULT);
    }

    @Override
    protected SymbolInterface getDefault() {
        return GomokuSymbol.DEFAULT;
    }


    @Override
    public String getRepresentation() {
        return ("  |  \n" +
                "--"+getSymbol() + "--\n" +
                "  |  ");
    }
}
