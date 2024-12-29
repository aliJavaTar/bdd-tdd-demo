package org.bro.demouom;

import org.bro.demouom.domain.BaseUnitOfMeasure;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.bro.demouom.testUtil.DimensionFactory.createMissDimension;

public class BaseUnitOfMeasureShould {

    @Test
    void define_in_a_dimension() {
        var miss = createMissDimension();
        var gram = new BaseUnitOfMeasure("Gram", "gr", miss.id());


        assertThat(gram.dimensionId()).isEqualTo(miss.id());
        assertThat(gram.name()).isEqualTo("Gram");
        assertThat(gram.symbol()).isEqualTo("gr");

    }
}
