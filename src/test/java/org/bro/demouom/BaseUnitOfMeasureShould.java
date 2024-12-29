package org.bro.demouom;

import org.assertj.core.api.Assertions;
import org.bro.demouom.domain.Dimension;

import static org.assertj.core.api.Assertions.*;

public class BaseUnitOfMeasureShould {


    void define_in_dimension() {
        var dimension = new Dimension(1, "Miss", "m");
        assertThat(dimension.getId()).isEqualTo(1);
        assertThat(dimension.getName()).isEqualTo("Miss");
        assertThat(dimension.getSymbol()).isEqualTo("m");

    }
}
