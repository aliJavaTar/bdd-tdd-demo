package org.bro.demouom.domain;

import lombok.Getter;

@Getter
public class Dimension {

    private int id;
    private String name;
    private String symbol;

    public Dimension(int id, String name, String symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }
}
