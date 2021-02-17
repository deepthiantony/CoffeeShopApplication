package org.example.enums;

public enum ItemType {
    COFFEE (10),
    TEA (10),
    CUPCAKE( 20 ),
    VANILLA_ICECREAM (30),
    CHOCOLATE_PASTRY (30);
    int value;

   ItemType(int value) {
       this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
