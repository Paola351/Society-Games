package com.otacon.decks.domino;

import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DominoSet {

    private LinkedList<DominoTile> dominoTiles;

    public DominoSet() {
        dominoTiles = new LinkedList<>();
        initializeDeck();
        shuffleDeck();
    }

    public void initializeDeck() {
        dominoTiles.clear();
        buildSet();
    }

    public void shuffleDeck() {
        Collections.shuffle(dominoTiles);
    }

    public DominoTile pull() throws NoSuchElementException {
        return dominoTiles.removeFirst();
    }

    public DominoTile pick() {
        return dominoTiles.peek();
    }

    private void buildSet() {
        for (int i = 6; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                dominoTiles.add(new DominoTile(DominoTile.Value.getByNumericValue(i),
                        DominoTile.Value.getByNumericValue(j)));
            }
        }
    }

    @Override
    public String toString() {
        return "DominoSet{" +
                "tiles=" + dominoTiles + "\n" +
                "size=" + dominoTiles.size() + "\n" +
                '}';
    }
}
