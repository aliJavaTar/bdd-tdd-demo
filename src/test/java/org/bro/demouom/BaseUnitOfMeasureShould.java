package org.bro.demouom;

import org.assertj.core.api.Assertions;
import org.bro.demouom.domain.BaseUnitOfMeasure;
import org.junit.jupiter.api.Test;

import static org.bro.demouom.testUtil.DimensionFactory.createMissDimension;

public class BaseUnitOfMeasureShould {

    @Test
    void define_in_a_dimension() {
        var miss = createMissDimension();
        var gram = new BaseUnitOfMeasure("Gram", "gr", miss.id());


        Assertions.assertThat(gram.dimensionId()).isEqualTo(miss.id());
        Assertions.assertThat(gram.name()).isEqualTo("Gram");
        Assertions.assertThat(gram.symbol()).isEqualTo("gr");

    }
}
