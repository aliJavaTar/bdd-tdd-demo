package org.bro.demouom.testUtil;

import org.bro.demouom.domain.BaseUnitOfMeasure;
import org.bro.demouom.domain.Dimension;

public class BaseUnitOfMeasureFactory {
    public static BaseUnitOfMeasure createGram() {
        var dimension = DimensionFactory.createMissDimension();
        return new BaseUnitOfMeasure(1, "Gram", "gr", dimension.id());
    }

}
