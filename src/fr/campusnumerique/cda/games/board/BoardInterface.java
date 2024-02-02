package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.CellInterface;
import fr.campusnumerique.cda.games.utils.Coordinate;

public interface BoardInterface {
    CellInterface getCell(Coordinate coordinate);
}
