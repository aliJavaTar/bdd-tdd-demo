package org.bro.demouom;

import org.bro.demouom.domain.ScaledUnitOfMeasure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.bro.demouom.testUtil.BaseUnitOfMeasureFactory.createGram;

public class ScaledUnitOfMeasureShould {

    void constructed_properly() {
        var gram = createGram();
        var kilogram = new ScaledUnitOfMeasure(2, "Kilogram", "Kg", 1);
        assertThat(kilogram.id()).isEqualTo(2);
        assertThat(kilogram.baseUnitOfMeasureId()).isEqualTo(gram.dimensionId());
        assertThat(kilogram.name()).isEqualTo("Kilogram");
        assertThat(kilogram.symbol()).isEqualTo("Kg");
    }
}
