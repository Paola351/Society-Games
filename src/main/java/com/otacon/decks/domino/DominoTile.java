package com.otacon.decks.domino;

import java.math.BigInteger;
import java.util.Arrays;

public class DominoTile {

    public static final int BASE_DECIMAL_HORIZONTAL_VALUE = 127025;
    public static final int BASE_DECIMAL_VERTICAL_VALUE = 127075;

    public enum Type { VERTICAL, HORIZONTAL }

    public enum Value {
        ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

        int numericValue;

        Value(int value) {
            this.numericValue = value;
        }

        public static DominoTile.Value getByNumericValue(int value) {
            return Arrays
                    .stream(DominoTile.Value.values())
                    .filter(c -> c.numericValue == value)
                    .findFirst()
                    .orElse(DominoTile.Value.ZERO);
        }

        public int getNumericValue() { return numericValue; }

    }

    private DominoTile.Value value1;
    private DominoTile.Value value2;

    private DominoTile.Type type;

    public DominoTile(DominoTile.Value value1, DominoTile.Value value2) {
        this.value1 = value1;
        this.value2 = value2;
        this.type = Type.HORIZONTAL;
    }

    public DominoTile(DominoTile.Value value1, DominoTile.Value value2, DominoTile.Type type) {
        this.value1 = value1;
        this.value2 = value2;
        this.type = type;
    }

    public Value getValue1() { return value1; }

    public void setValue1(Value value1) { this.value1 = value1; }

    public Value getValue2() { return value2; }

    public void setValue2(Value value2) { this.value2 = value2; }

    @Override
    public String toString() {
        if (type==Type.HORIZONTAL) {

        } else {

        }
        return String.format("(%s-%s)", value1.getNumericValue(), value2.getNumericValue());
    }


}
