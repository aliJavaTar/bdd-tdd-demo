package org.bro.demouom.testUtil;

import org.bro.demouom.domain.Dimension;

public class DimensionFactory {

    public static Dimension createMissDimension() {
        return new Dimension(1, "Miss", "m");
    }
}
