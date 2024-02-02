package fr.campusnumerique.cda.games.cell;

import fr.campusnumerique.cda.games.utils.ClearableInterface;
import fr.campusnumerique.cda.games.symbol.SymbolInterface;

public interface CellInterface extends ClearableInterface {
    boolean isOccupied();

    boolean occupy(SymbolInterface symbolInterface);

    String getRepresentation();

}
